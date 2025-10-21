package ud2.ejercicios;

/*
 * E0312. Pedir 5 calificaciones de alumnos y decir al final si hay algún suspenso.

E0313. Dadas 6 notas, escribir la cantidad de alumnos aprobados, condicionados (nota igual a 4) y suspensos.
 */
import java.util.Scanner;

public class E0313 {
    /**
     * @author Darío
     * 
     */
    public static void main(String[] args) {

        final int NUM_ALUMNOS = 6;

        Scanner sc = new Scanner(System.in);

        int aprobados = 0;
        int condicionados = 0;
        int suspensos = 0;

        for (int i = 0; i < NUM_ALUMNOS; i++) {

            System.out.println("Nota: ");
            int nota = sc.nextInt();
            if (nota >= 5)
                aprobados++;
            else if (nota == 4)
                condicionados++;
            else if (nota < 4)
                suspensos++;
        }

        System.out.println("Aprobados: " + aprobados);
        System.out.println("Condicionados: " + condicionados);
        System.out.println("Suspensos: " + suspensos);

        sc.close();
    }
}
