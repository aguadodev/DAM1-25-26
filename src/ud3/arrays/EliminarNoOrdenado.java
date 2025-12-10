package ud3.arrays;

import java.util.Arrays;

public class EliminarNoOrdenado {
    public static void main(String[] args) {
        int[] t = {30, 46, 46, 36, 96, 63};

        int eliminar = 46;

        int i = 0;
        while (i < t.length && t[i] != eliminar) {
            i++;
        }
        
        // Si ha encontrado el valor
        if (i < t.length) {
            // Lo borramos
            t[i] = t[t.length - 1];
            t = Arrays.copyOf(t, t.length - 1);
        }
        System.out.println(Arrays.toString(t));

    }
}
