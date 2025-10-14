package ud2.ejercicios;

import java.util.Scanner;

public class E0201 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Número: ");
        int n = sc.nextInt();
        sc.close();

        if (n % 2 == 0) {
            System.out.println("Es par");
        } else {
            System.out.println("No es par");
        }
    }
}
