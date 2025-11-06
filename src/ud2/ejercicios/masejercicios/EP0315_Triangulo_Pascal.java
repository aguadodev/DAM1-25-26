package ud2.ejercicios.masejercicios;

import ud2.Util;

public class EP0315_Triangulo_Pascal {
    public static void main(String[] args) {
        trianguloPascal(10);
    }

    public static void trianguloPascal(int num) {
        for (int n = 0; n <= num; n++) {
            for (int m = 0; m <= n; m++) {
                long e = Util.factorial(n) / (Util.factorial(m) * Util.factorial(n - m));
                System.out.print(e + " ");
            }
            System.out.println();
        }
    }
}
