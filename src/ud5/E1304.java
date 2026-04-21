package ud5;

import java.sql.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.function.Predicate;

/**
 * Implementar un método estático (filtrar) al que se pasa como parámetro una
 * tabla de tipo genérico y un predicado. El método devuelve otra tabla con los
 * elementos de
 * la tabla original que verifiquen la condición del predicado. Aplicarlo a una
 * tabla de 50
 * enteros entre 1 y 100 que devuelve los múltiplos de 3.
 * Prueba a implementar una versión del método que utilice listas en lugar de
 * arrays
 */
public class E1304 {
    public static <T> T[] filtrar (T[] t, Predicate<T> p) {

        T[] nuevaT = Arrays.copyOf(t, 0);

        for (T e : t) {
            if (p.test(e)) {
                nuevaT = Arrays.copyOf(nuevaT, nuevaT.length + 1);
                nuevaT[nuevaT.length - 1] = e;
            }
        }

        return nuevaT;
    }
    
    public static void main(String[] args) {
        Integer[] numeros = new Integer[50];

        Random rnd = new Random();

        for (int i = 0; i < numeros.length; i++) {
            int random = rnd.nextInt(1, 101);
            numeros[i] = random;    
        }

        Predicate<Integer> esMultiploDe3 = x -> x % 3 == 0;

        System.out.println(Arrays.toString(numeros));

        Integer[] multiplosDe3 = filtrar(numeros, esMultiploDe3);

        System.out.println(Arrays.toString(multiplosDe3));
    }
}
