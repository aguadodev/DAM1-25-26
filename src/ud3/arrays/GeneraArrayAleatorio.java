package ud3.arrays;

/**
 * @author Hugo Romay
 */

import java.util.Random;

public class GeneraArrayAleatorio {
    public static int[] arrayAleatorio(int n) {
        Random rnd = new Random();
        int[] arrayAleatorio = new int[n];

        for (int i = 0; i < arrayAleatorio.length; i++) {
            arrayAleatorio[i] = rnd.nextInt(-9,9); 
        }
    return arrayAleatorio;
    }
}
