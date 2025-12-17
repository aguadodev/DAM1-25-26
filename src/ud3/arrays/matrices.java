package ud3.arrays;

import java.util.Arrays;

public class matrices {
    public static void main(String[] args) {
        int datos[][];

        datos = new int[5][5];

        datos[2][3] = 6;

        String palabras[][] = new String[4][6];

        palabras[0][0] = "Programación";

        System.out.println(palabras[0][0] + " - " + datos[2][3]);

        int numeros[][] = {
            {2, 4, 6, 12, 0},
            {2, -11, 4, 7, 86, 3, 9},
            {0, 1, 6, 5, 3, 2, 8},
            {1, 93, 6, -2, 0, 5, 9},
            {9, 71, 23, 2, 8, 7, 2},
            {5, 3, 7}
        };

        int numeros2[][] = {
            {2, 4, 6, 12, 0},
            {2, -11, 4, 7, 86, 3, 9},
            {0, 1, 6, 5, 3, 2, 8},
            {1, 93, 6, -2, 0, 5, 9},
            {9, 71, 23, 2, 8, 7, 2},
            {5, 3, 7}
        };
        
        System.out.println(numeros);
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print(numeros[i][j] + "  ");
            }
            System.out.println();            
        }

        System.out.println(Arrays.deepToString(numeros));

        System.out.println(numeros == numeros2); // false
        System.out.println(Arrays.equals(numeros, numeros2)); // false
        System.out.println(Arrays.deepEquals(numeros, numeros2)); // true

        System.out.println("Fin de programa");
    }
}
