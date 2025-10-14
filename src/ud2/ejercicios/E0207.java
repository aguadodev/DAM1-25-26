package ud2.ejercicios;

import java.util.Scanner;

public class E0207 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Número1: ");
        int n1 = sc.nextInt();
        System.out.println("Número2: ");
        int n2 = sc.nextInt();
        System.out.println("Número3: ");
        int n3 = sc.nextInt();
        sc.close();

        // Solución con ifs encadenados
        if (n1 > n2 && n1 > n3 && n2 > n3) {
            System.out.println(n1 + " " + n2 + " " + n3);
        } else if (n1 > n2 && n1 > n3 && n2 < n3) {
            System.out.println(n1 + " " + n3 + " " + n2);
        } else if (n2 > n1 && n2 > n3 && n1 > n3) {
            System.out.println(n2 + " " + n1 + " " + n3);
        } else if (n2 > n1 && n2 > n3 && n1 < n3) {
            System.out.println(n2 + " " + n3 + " " + n1);
        } else if (n3 > n1 && n3 > n2 && n1 > n2) {
            System.out.println(n3 + " " + n1 + " " + n2);
        } else {
            System.out.println(n3 + " " + n2 + " " + n1);
        }

        // solución con ifs encadenados y condicional doble
        if (n1 > n2 && n1 > n3) {
            if (n2 > n3) {
                System.out.println(n1 + " " + n2 + " " + n3);
            } else {
                System.out.println(n1 + " " + n3 + " " + n2);
            }
        } else if (n2 > n1 && n2 > n3) {
            if (n1 > n3) {
                System.out.println(n2 + " " + n1 + " " + n3);
            } else {
                System.out.println(n2 + " " + n3 + " " + n1);
            }
        } else {
            if (n1 > n2) {
                System.out.println(n3 + " " + n1 + " " + n2);
            } else {
                System.out.println(n3 + " " + n2 + " " + n1);
            }
        }
    }
}
