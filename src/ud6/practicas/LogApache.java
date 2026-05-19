package ud6.practicas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class LogApache {
    public static void main(String[] args) {

        try (BufferedReader in = new BufferedReader(new FileReader("bacharelato_access.log"))) {
            List<String> lineas = new ArrayList<>(in.readAllLines());

            int numAccesos = lineas.size();


            // Obtenemos el número de accesos desde las distintas IPs 
            Map<String, Integer> accesosPorIP = new LinkedHashMap<>();
            for (String linea : lineas) {
                String ip = linea.split(" ")[0];
                accesosPorIP.put(ip, accesosPorIP.getOrDefault(ip, 0) + 1);
            }

            // Ordeno el mapa por valores descendentemente 
            List<Map.Entry<String, Integer>> listaEntradas = new ArrayList<>(accesosPorIP.entrySet());
            listaEntradas.sort((e1, e2) -> e2.getValue() - e1.getValue());

            lineas.removeIf(linea -> !linea.split(" ")[8].equals("404"));
            int errores404 = lineas.size();

            System.out.println("Total de Accesos: " + numAccesos);
            System.out.println("Errores 404: " + errores404);
            System.out.println("Accesos correctos: " + (numAccesos - errores404));

            System.out.println("\nLISTA DE IPS MÁS REPETIDAS");
            System.out.println("==========================");
            for (Map.Entry<String,Integer> e : listaEntradas) {
                System.out.println(e.getKey() + " (" + e.getValue() + ")");
            }
            


        } catch (Exception e) {
            System.out.println("Problemas con el fichero...");
            e.printStackTrace();
        }
    }
}
