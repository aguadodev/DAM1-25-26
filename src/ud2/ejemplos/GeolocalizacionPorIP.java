package ud2.ejemplos;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeolocalizacionPorIP {
    public static void main(String[] args) throws Exception {
        String url = "http://ip-api.com/json"; // devuelve JSON con campos: country, city, lat, lon, ...
        
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
        
        System.out.println("Respuesta cruda: " + json);

        // Extracción simple (sin librería JSON) — busca "country","city","lat","lon"
        String country = extractString(json, "\"country\"\\s*:\\s*\"([^\"]*)\"");
        String city    = extractString(json, "\"city\"\\s*:\\s*\"([^\"]*)\"");
        String latStr  = extractNumber(json, "\"lat\"\\s*:\\s*([-+]?[0-9]*\\.?[0-9]+)");
        String lonStr  = extractNumber(json, "\"lon\"\\s*:\\s*([-+]?[0-9]*\\.?[0-9]+)");

        System.out.println("País:  " + country);
        System.out.println("Ciudad:" + city);
        System.out.println("Lat:   " + latStr);
        System.out.println("Lon:   " + lonStr);
    }

    private static String extractString(String text, String regex) {
        Matcher m = Pattern.compile(regex).matcher(text);
        return m.find() ? m.group(1) : "(no disponible)";
    }

    private static String extractNumber(String text, String regex) {
        Matcher m = Pattern.compile(regex).matcher(text);
        return m.find() ? m.group(1) : "(no disponible)";
    }
}
