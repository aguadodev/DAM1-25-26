package ud2.ejercicios;

import java.util.Scanner;

public class E0210_NotaB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe tu nota (número entero de 0 a 10): ");
        int nota = sc.nextInt();
        sc.close();

        switch (nota) {
            case 0, 1, 2, 3, 4 -> {
                System.out.println("Suspenso.");
                System.out.println("Animo...");
            }
            case 5 ->
                System.out.println("Suficiente.");
            case 6 ->
                System.out.println("Bien.");
            case 7, 8 ->
                System.out.println("Notable");
            case 9, 10 -> {
                System.out.println("Sobresaliente.");
                System.out.println("Enhorabuena");
            }
            default ->
                System.out.println("Nota incorrecta");
        }

        System.out.println("Fin del programa");

    }
}
