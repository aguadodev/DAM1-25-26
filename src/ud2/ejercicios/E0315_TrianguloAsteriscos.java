package ud2.ejercicios;

import java.util.Scanner;

public class E0315_TrianguloAsteriscos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Número de niveles del triángulo: ");
        int n = sc.nextInt();
        sc.close();

        for (int i = 0; i < n; i++) {
            // Imprime una línea
            for (int j = 0; j < n - i; j++) {
                // Imprime un asterisco
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
