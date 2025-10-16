package ud2.ejercicios;

/*
 * E0211. Idear un programa que solicite al usuario un número comprendido entre 1 y 7, correspondiente a un día de la semana. Se debe mostrar el nombre del día de la semana al que corresponde. Por ejemplo, el número 1 corresponde a “lunes” y el 6 a “sábado”.
 */

import java.util.Scanner;

/**
 * @author Eusebio Moreira Dominguez
 */
public class E0211 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Dime un número entre 1 y 7 sin decimales");
        int dia = sc.nextInt();
        sc.close();

        switch (dia) {
            case 1 ->
                System.out.println("Lunes");
            case 2 ->
                System.out.println("Martes");
            case 3 ->
                System.out.println("Miercoles");
            case 4 ->
                System.out.println("Jueves");
            case 5 ->
                System.out.println("Viernes");
            case 6 ->
                System.out.println("Sábado");
            case 7 ->
                System.out.println("Domingo");
            default ->
                System.out.println("No es un número comprendido entre 1 y 7");
        }
    }
}
