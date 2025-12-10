package ud3.arrays;

import java.util.Arrays;

public class InsercionOrdenada {
    public static void main(String[] args) {
        int[] t = {1, 2, 3, 4, 6, 7, 8, 9};
        int nuevo = 5;

        // Busca el elemento en el array y obtiene su posición
        int pos = Arrays.binarySearch(t, nuevo);

        // Si no se encuentra el elemento calculamos dónde insertarlo
        if (pos < 0) {
            pos = -pos -1;
        }
        
        // Insertamos el nuevo elemento en la posición indicada
        // Podríamos usar el método de la 
        // Util.insertarEnPosicion(t, nuevo, pos);
        // Crea una copia del array original con una posición más
        t = Arrays.copyOf(t, t.length + 1);
        // Hace un hueco en la posición de inserción copiando/desplazando los elementos a la derecha
        System.arraycopy(t, pos, t, pos + 1, t.length - pos - 1);
        // Inserta el nuevo elemento
        t[pos] = nuevo;

        System.out.println(Arrays.toString(t));
    }
}
