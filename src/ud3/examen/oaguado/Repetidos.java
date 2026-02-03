package ud3.examen.oaguado;

import java.util.Arrays;

public class Repetidos {
    static int[] repetidos(int t[]) {
        // Early return
        if (t == null)
            return null;

        int[] repetidos = new int[0];
        // Hago una copia ordenada del array original
        int[] aux = t.clone();
        Arrays.sort(aux);

        // Recorro el array ordenado del mayor al menor valor
        for (int i = aux.length - 1; i > 0; i--) {
            if (aux[i] == aux[i - 1]) {
                // Si el elemento es igual al anterior
                // Si el elemento aún no existe en el array repetidos
                if (repetidos.length == 0 || aux[i] != repetidos[repetidos.length - 1]) {
                    repetidos = Arrays.copyOf(repetidos, repetidos.length + 1);
                    repetidos[repetidos.length - 1] = aux[i];
                }
            }
        }

        return repetidos;
    }
}
