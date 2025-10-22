package ud2.ejercicios;

import java.util.Scanner;

public class E0401_Eco {
    /**
     * @author Darío
     * 
     */
    static void eco(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("Eco...");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Numero de Ecos");
        int n = sc.nextInt();
        sc.close();

        eco(n);


        System.out.println("..........");

        eco(5);
    }

}
