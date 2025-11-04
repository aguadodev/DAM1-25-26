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
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Introduzca el numerador: ");
            int numerador = sc.nextInt();
            System.out.print("Introduzca el denominador: ");
            int denominador = sc.nextInt();
            sc.close();
            int resultado = numerador / denominador;
            System.out.print("El resultado de dividir " + numerador + " entre " + denominador + " es: " + resultado);
        } catch (InputMismatchException e) {
            System.out.println("Error con los datos de entrada. Deben ser números enteros.");
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
