package ud2.ejemplos;

import java.util.Scanner;

public class CondicionalSimple {
    public static void main(String[] args) {
        System.out.print("Edad: ");
        Scanner sc = new Scanner(System.in);
        int edad = sc.nextInt();
        sc.close();

        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
            System.out.println("Puedes conducir");
        }
        
    }
    
}
