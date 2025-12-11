package ud3.arrays;

import java.util.Arrays;
import java.util.Random;

/**
 * @author Alejandro
 */
public class E0510 {
    public static int[] eliminarMayores(int t[], int clave) {
        int[] eliminarMayor = new int[0];
        for (int i = 0; i < t.length; i++) {
            if (t[i] <= clave) {
                eliminarMayor = Arrays.copyOf(eliminarMayor, eliminarMayor.length + 1);
                eliminarMayor[eliminarMayor.length - 1] = t[i];
            }
        }
        return eliminarMayor;
    }
    public static void main(String[] args) {
        Random rm = new Random();
        int[] t = new int[10];
        for (int i = 0; i < t.length; i++) {
            t[i] = rm.nextInt(50) + 1;
        }
        System.out.println("Array sin eliminar los mayores: " + Arrays.toString(t));
        System.out.println("Arrays quitando los numeros mayor que la clave (en este caso 30): " + Arrays.toString(eliminarMayores(t, 30)));
    }
}
