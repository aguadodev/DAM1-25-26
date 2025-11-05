package ud2.ejercicios.masejercicios;

import ud2.Util;

public class Digitos {
    public static void main(String[] args) {
        System.out.print("Introduce un número entero para descomponerlo en sus cifras: ");
        int n = Util.leerInt();

        // i vale 1, 10, 100, 1000, 10000, etc.
        for (int i = 1; i <= n; i *= 10) {
            System.out.println(n / i % 10);
        }

    }
}
