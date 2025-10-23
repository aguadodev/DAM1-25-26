package ud2.ejercicios.estructurascontrol;

import java.util.Scanner;

/*
 * E0312. Pedir 5 calificaciones de alumnos y decir al final si hay algún suspenso.
 */

public class E0312 {

    public static void main(String[] args) {
        final int NUM_ALUMNOS = 5;

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce 5 notas: ");

        boolean haySuspensos = false;

        for (int i = 0; i < NUM_ALUMNOS; i++) {
            int nota = sc.nextInt();
            if (nota < 5) {
                haySuspensos = true;
            }
        }
        sc.close();

        if (haySuspensos) {
            System.out.println("Hay suspensos..");
        }
    }
}
