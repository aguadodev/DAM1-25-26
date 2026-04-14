package ud5.colecciones;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class E1205 {
    public static void main(String[] args) {
        Random rnd = new Random();
        Collection<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            numeros.add(rnd.nextInt(10) + 1);
        }

        System.out.println(numeros);

        Collection<Integer> aux = new ArrayList<>();
        for (Integer i : numeros) {
            if (!aux.contains(i))
                aux.add(i);
        }

        System.out.println(aux);
    }
}
