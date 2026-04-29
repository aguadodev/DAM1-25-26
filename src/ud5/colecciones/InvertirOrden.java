package ud5.colecciones;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class InvertirOrden {

    static <V, K> Map<V, List<K>> invertirOrden(Map<K, V> m) {
        Map<V, List<K>> mapaRes = new LinkedHashMap<>();

        // 1. Obtener Conjunto de Valores
        Set<V> valores = new LinkedHashSet<>();
        valores.addAll(m.values());

        // 2. Recorremos el conjunto de valores y vamos generando las entradas del nuevo mapa
        for (V v : valores) {
            // Recorremos las entradas del mapa generando la lista de claves asociadas a cada valor
            Set<Entry<K, V>> entradas = m.entrySet();
            List<K> listaClaves = new ArrayList<>();
            for (Entry<K, V> entrada : entradas) {
                if (entrada.getValue().equals(v))
                    listaClaves.add(entrada.getKey());
            }
            mapaRes.put(v, listaClaves);
        }
        
        return mapaRes;
    }

    public static void main(String[] args) {
        Map<Integer, String> mapa = new LinkedHashMap<>();
        mapa.put(1, "a");
        mapa.put(2, "b");
        mapa.put(3, "a");

        System.out.println(invertirOrden(mapa));
    }

}
