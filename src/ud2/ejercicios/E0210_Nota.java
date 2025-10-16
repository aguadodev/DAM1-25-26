package ud2.ejercicios;

import java.util.Scanner;

public class E0210_Nota {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe tu nota (número entero de 0 a 10): ");
        int nota = sc.nextInt();
        sc.close();

        switch (nota) {
            case 0, 1, 2, 3, 4:
                System.out.println("Insuficiente");
                break;
            case 5:
                System.out.println("Suficiente");
                break;
            case 6:
                System.out.println("Bien");
                break;
            case 7, 8:
                System.out.println("Notable");
                break;
            case 9, 10:
                System.out.println("Sobresaliente");
                break;
        
            default:
                System.out.println("Nota errónea");
        }

        System.out.println("Fin del programa");


        /* Solución alternativa con if's anidados
        if (nota >= 0 && nota <= 4) {

        } else if (nota <= 5) {

        } else if (nota <= 6) {

        } else if (nota <= 8) {

        } else if (nota <= 10) {

        } else {
            
        }         
         */

    }
}
