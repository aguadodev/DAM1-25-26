/**
 * @author Adrián Gómez
 */

/* 
 * E0109_Par. Programa que pida un número entero al usuario y que indique si es par mediante un literal booleano (true o false).
 */

import java.util.Scanner;

public class E0109_Par {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Inserta un número entero: ");
        int numero = sc.nextInt();
        sc.close();

        boolean esPar = numero % 2 == 0;

        System.out.println("El número es par? " + esPar);
    }
}
