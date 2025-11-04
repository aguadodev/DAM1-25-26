package ud2.ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 *  Escribe un programa que solicite dos números enteros por teclado y muestre el resultado
de dividir el primero (numerador) por el segundo (denominador).
 */
/**
 * @author Marcos
 */

public class Division {

    public static int leerIntRecursiva() {
        Scanner sc = new Scanner(System.in);
        try {
            return sc.nextInt();
        } catch (Exception e) {
            String entradaIncorrecta = sc.nextLine();
            System.out.println("El dato introducido (" + entradaIncorrecta + ") no es un número entero");
            return leerIntRecursiva();
        }
    }

    public static int leerInt() {
        Scanner sc = new Scanner(System.in);
        int numeroEntero = 0;
        boolean numeroValido = false;
        do {
            try {

                numeroEntero = sc.nextInt();
                numeroValido = true;
            } catch (Exception e) {
                String entradaIncorrecta = sc.nextLine();
                System.out.println("El dato introducido (" + entradaIncorrecta + ") no es un número entero");
            }
        } while (!numeroValido);
        return numeroEntero;
    }

    public static void main(String[] args) {
        System.out.print("Introduzca el numerador: ");
        int numerador = leerIntRecursiva();
        System.out.print("Introduzca el denominador: ");
        int denominador = leerInt();

        try {
            int resultado = numerador / denominador;
            System.out.print("El resultado de dividir " + numerador + " entre " + denominador + " es: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error al dividir: " + e.getMessage()
                    + ". El denominador no puede ser 0 o el resultado es infinito.");
        } catch (Exception e) {
            System.out.println("EXCEPCIÓN!!.");

        } finally {
            System.out.println("Finalizando programa.");
        }
    }
}
