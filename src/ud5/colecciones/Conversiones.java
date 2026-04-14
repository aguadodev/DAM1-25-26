package ud5.colecciones;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.util.Comparator;

public class Conversiones {
    public static void main(String[] args) {
        Random rnd = new Random(7);
        Set<Integer> conjunto = new LinkedHashSet<>();
        for (int i = 0; i < 12; i++) 
            conjunto.add(rnd.nextInt(10) + 1);

        System.out.println("Conjunto: " + conjunto);

        Set<Integer> conjOrdenado = new TreeSet<>(Comparator.reverseOrder());
        conjOrdenado.addAll(conjunto);

        System.out.println(conjOrdenado);



        
    }
}
