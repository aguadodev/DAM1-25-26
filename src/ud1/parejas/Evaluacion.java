package ud1.parejas;

import java.util.Scanner;

/**
 * @author Adrián López y Falou Faye
 */
public class Evaluacion {
    public static void main(String[] args) {
        System.out.println("Vamos a evaluar el ejercicio de programacón");
        Scanner sc = new Scanner(System.in);
        double nota1;
        double nota2;
        double nota3;
        double nota4;
        double nota5;
        double nota6;
        System.out.println("El programa funciona?");
        System.out.println("Sí y funciona => 4 puntos /// Sí pero no hace lo que debe => 2 pt /// No => 0 pt.");
        nota1 = sc.nextDouble();

        System.out.println("El programa funciona y es eficiente?");
        System.out.println("Sí => 1 pt /// Regular => 0,5 /// pt No => 0 pt");
        nota2 = sc.nextDouble();

        System.out.println("Usa estructuras y tipos de datos adecuados al problema");
        System.out.println("Siempre => 1 pt /// A veces => 0,5 pt /// Nunca = 0 pt");
        nota3 = sc.nextDouble();

        System.out.println("Usa identificadores adecuados");
        System.out.println("Siempre => 1,5 pt /// A veces => 0,75 pt /// Nunca = 0 pt");
        nota4 = sc.nextDouble();

        System.out.println(" El programa es legible");
        System.out.println("Mucho => 1,5 pt /// Regular => 0,75 pt /// Poco => 0 pt");
        nota5 = sc.nextDouble();

        System.out.println("Presenta la información completa al usuario");
        System.out.println("Sí => 1 pt /// Regular => 0,5 pt /// No => 0 pt");
        nota6 = sc.nextDouble();
        sc.close();

        double notaTotal = nota1 + nota2 + nota3 + nota4 + nota5 + nota6;
        System.out.println("La nota final del ejercicio es " + notaTotal);

    }

}
