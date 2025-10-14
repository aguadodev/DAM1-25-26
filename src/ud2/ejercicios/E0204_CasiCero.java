package ud2.ejercicios;

import java.util.Scanner;

public class E0204_CasiCero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Número: ");
        double n = sc.nextDouble();
        sc.close();

        boolean casiCero = n > -1 && n < 1 && n != 0;

        if (casiCero) {
            System.out.println("Casi cero");
        } else {
            System.out.println("NO casi cero");
        }
    }
}
