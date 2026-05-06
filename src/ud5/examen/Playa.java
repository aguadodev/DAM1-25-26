package ud5.examen;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Playa {

        int id;
    String nombre;
    String concello;
    String provincia;
    double lat;
    double lon;





   

    static void playasConcello(List<Playa> playas, String concello) {
        if (playas == null || concello == null)
            return;
        playas.removeIf(p -> p.concello != concello);
    }

    static List<Playa> playasOrdenadas(List<Playa> playas, Comparator<Playa> comp1, Comparator<Playa> comp2) {
        if (playas == null || comp1 == null || comp2 == null)
            return null;
        playas.sort(comp1.thenComparing(comp2));
        return playas;
    }

    static Map<String, List<Playa>> playasPorProvincia(List<Playa> playas) {
        if (playas == null)
            return null;
        
        Map<String, List<Playa>> playasPorProvincia = new HashMap<>();
        Set<String> provincias = new TreeSet<>();
        for (Playa playa : playas) 
            provincias.add(playa.getProvincia());
        
        for (String provincia : provincias) {
            List<Playa> lista = new ArrayList<>();
            for (Playa p : playas)
                if (p.provincia.equals(provincia))
                    lista.add(p);
            playasPorProvincia.put(provincia, lista);
        }

        return playasPorProvincia;
    }

    static Map<Playa, Integer> playasFavoritas(Map<String, List<Playa>> playasFavoritas) {
        Map<Playa, Integer> playasConPuntos = new LinkedHashMap<>();

        int puntos;

        for (Map.Entry<String, List<Playa>> e : playasFavoritas.entrySet()) {
            List<Playa> playas = e.getValue();
            // Recorro las 3 primeras playas de la lista
            for (int i = 0; i < 3 && i < playas.size(); i++) {
                switch (i) {
                    case 0: puntos = 10; break;
                    case 1: puntos = 5; break;
                    case 2: puntos = 2; break;
                }

                playasConPuntos.put(playas.get(i), playasConPuntos.getOrDefault(playasConPuntos, puntos));
            }
            // añado la playa o actualizo la puntuación


        }
        
        return playasConPuntos;
    }




 public Playa(int id, String nombre, String concello, String provincia, double lat, double lon) {
        this.id = id;
        this.nombre = nombre;
        this.concello = concello;
        this.provincia = provincia;
        this.lat = lat;
        this.lon = lon;
    }

 public int getId() {
    return id;
 }

 public void setId(int id) {
    this.id = id;
 }

 public String getNombre() {
    return nombre;
 }

 public void setNombre(String nombre) {
    this.nombre = nombre;
 }

 public String getConcello() {
    return concello;
 }

 public void setConcello(String concello) {
    this.concello = concello;
 }

 public String getProvincia() {
    return provincia;
 }

 public void setProvincia(String provincia) {
    this.provincia = provincia;
 }

 public double getLat() {
    return lat;
 }

 public void setLat(double lat) {
    this.lat = lat;
 }

 public double getLon() {
    return lon;
 }

 public void setLon(double lon) {
    this.lon = lon;
 }

    





}
