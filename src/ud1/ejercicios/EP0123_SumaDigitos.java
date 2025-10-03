package ud1.ejercicios;

import java.util.Scanner;

public class EP0123_SumaDigitos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número de 3 cifras: ");
        int n = sc.nextInt();
        sc.close();

        int centenas = n / 100;
        int decenas = n / 10 % 10;
        int unidades = n % 10;

        int suma = centenas + decenas + unidades;
        System.out.println("Suma de los dígitos: " + suma);

    }
}
