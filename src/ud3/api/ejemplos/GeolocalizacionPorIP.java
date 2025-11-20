package ud3.api.ejemplos;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeolocalizacionPorIP {
    public static void main(String[] args) throws Exception {
        // devuelve JSON con campos: country, city, lat, lon, ...
        String url = "http://ip-api.com/json";

        String json = getJson(url);

        System.out.println("Respuesta cruda: " + json);

        // Extracción simple (sin librería JSON) — busca "country","city","lat","lon"
        String country = extractString(json, "\"country\"\\s*:\\s*\"([^\"]*)\"");
        String city = extractString(json, "\"city\"\\s*:\\s*\"([^\"]*)\"");
        String latStr = extractString(json, "\"lat\"\\s*:\\s*([-+]?[0-9]*\\.?[0-9]+)");
        String lonStr = extractString(json, "\"lon\"\\s*:\\s*([-+]?[0-9]*\\.?[0-9]+)");

        System.out.println("País:  " + country);
        System.out.println("Ciudad:" + city);
        System.out.println("Lat:   " + latStr);
        System.out.println("Lon:   " + lonStr);

        String url2 = "https://api.sunrise-sunset.org/json?lat=" + latStr + "&lng=" + lonStr + "&formatted=0";
        System.out.println(url2);
        String json2 = getJson(url2);
        System.out.println(json2);
        String sunrise = extractString(json2, "\"sunrise\"\\s*:\\s*\"([^\"]*)\"");
        String sunset = extractString(json2, "\"sunset\"\\s*:\\s*\"([^\"]*)\"");
        System.out.println("Salida del Sol: " + sunrise);
        System.out.println("Puesta del Sol: " + sunset);

        LocalDateTime amanecer = OffsetDateTime.parse(sunrise).toLocalDateTime();
        LocalDateTime puestaDeSol = OffsetDateTime.parse(sunset).toLocalDateTime();

        LocalDateTime ahora = LocalDateTime.now();

        if (ahora.isAfter(amanecer))
            System.out.println("Ya ha amanecido");
        else {
            System.out.println("Aún no ha amanecido");
        }

        if (ahora.isAfter(puestaDeSol))
            System.out.println("Ya se ha puesto el sol");
        else {
            System.out.println("Aún no se ha puesto el sol");
        }

    }

    private static String getJson(String url) throws IOException, InterruptedException {
        // Configuración del proxy del sistema
        System.setProperty("java.net.useSystemProxies", "true");

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest req = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .GET()
                .build();

        HttpResponse<String> resp = client.send(req, HttpResponse.BodyHandlers.ofString());
        if (resp.statusCode() != 200) {
            System.err.println("Error HTTP: " + resp.statusCode());
            System.exit(1);
        }

        String json = resp.body();
        return json;
    }

    private static String extractString(String text, String regex) {
        Matcher m = Pattern.compile(regex).matcher(text);
        return m.find() ? m.group(1) : "(no disponible)";
    }
}
