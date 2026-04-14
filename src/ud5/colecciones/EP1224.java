package ud5.colecciones;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class EP1224 {
    public static List<Integer> fusionOrdenadaInteger(List<Integer> l1, List<Integer> l2) {
        List<Integer> fusionOrdenada = new LinkedList<>(l1);
        fusionOrdenada.addAll(l2);
        Collections.sort(fusionOrdenada);
        return fusionOrdenada;
    }

    public static <T extends Comparable<T>> List<T> fusionOrdenada(List<T> l1, List<T> l2) {
        List<T> fusionOrdenada = new LinkedList<>(l1);
        fusionOrdenada.addAll(l2);
        Collections.sort(fusionOrdenada);
        return fusionOrdenada;
    }

    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(new Integer[] {1, 2, 3});
        List<Integer> l2 = Arrays.asList(new Integer[] {2, 4, 6});
        System.out.println(fusionOrdenada(l1, l2));

        /* Falla porque bombilla no es comparable
        List<Bombilla> b1 = Arrays.asList(new Bombilla[] {new Bombilla()});
        List<Bombilla> b2 = Arrays.asList(new Bombilla[] {new Bombilla()});
        System.out.println(fusionOrdenada(b1, b2));        
        */
    }

}
