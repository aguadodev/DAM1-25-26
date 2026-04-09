package ud5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Mapas {
    public static void main(String[] args) {
        Map<String, Double> m = new TreeMap<>();
        m.put("Ana", 1.65);
        m.put("Marta", 1.60);
        m.put("Luis", 1.73);
        m.put("Pedro", 1.69);

        m.putIfAbsent("Luis", 1.75);
        m.put("Pedro", 1.71);
        m.put("Pedrito", 1.71);

        System.out.println(m);

        double estaturaLuis = m.get("Luis");
        System.out.println("Estatura de Luis " + estaturaLuis);
        System.out.println(m);

        System.out.println(m.containsKey("Marta")); // true
        System.out.println(m.containsKey("Marte")); // false


        System.out.println(m.containsValue(1.73)); // true
        System.out.println(m.containsValue(1.72)); // false

        Set<String> claves = m.keySet();
        System.out.println(claves);

        List<Double> valores = new ArrayList<>(m.values());
        Collections.sort(valores);
        System.out.println(valores);

        Set<Entry<String, Double>> entradas = m.entrySet();
        System.out.println(entradas);
        for (Entry<String,Double> entrada : entradas) {
            if (entrada.getValue() >= 1.7)
                System.out.println(entrada.getKey());
        }

        System.out.println(entradas);


        Iterator<Entry<String, Double>> it = entradas.iterator();
        while (it.hasNext()) {
            Entry<String, Double> entrada = it.next();
            if (entrada.getValue() >= 1.7)
                it.remove();
        }

        System.out.println(entradas);

        System.out.println(m);

    }
}
