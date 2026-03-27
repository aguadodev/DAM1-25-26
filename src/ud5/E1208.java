package ud5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Random;

/**
 * @author Araujo
 */

public class E1208 {
    public static void main(String[] args) {
        Random rm = new Random();
        Collection<Integer> listaInt = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            listaInt.add(rm.nextInt(10) + 1);
        }
        Integer[] listaArray = listaInt.toArray(new Integer[0]);

        Arrays.sort(listaArray);

        listaInt = Arrays.asList(listaArray);

        System.out.println(listaInt);
    }
}
