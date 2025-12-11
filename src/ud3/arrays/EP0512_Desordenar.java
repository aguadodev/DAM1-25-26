package ud3.arrays;

import java.util.Arrays;
import java.util.Random;

public class EP0512_Desordenar {

    public static void desordenar(int t[]) {
        Random rnd = new Random();
        // Recorrer cada elemento
        for (int i = 0; i < t.length; i++) {
            // Genero una posición aleatoria
            int posRnd = rnd.nextInt(t.length);
            // Intercambio los valores de la posición actual y la aleatoria
            int aux = t[i];
            t[i] = t[posRnd];
            t[posRnd] = aux;
        }
    }

    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        desordenar(numeros);
        System.out.println(Arrays.toString(numeros));
    }
}
