package ud1.parejas;

import java.util.Scanner;

/**
 * @Author Lunna e Ignacio MR
 */
public class HorasYAsistencia {
    public static void main(String[] args) {

        /*final String MODULO = "Programación";
        final int HORAS = 240;*/
        final String MODULO = "Lenguaje de marcas y sistemas de gestión de información";
        final int HORAS = 133;        
        /*
         * final String MODULO = "Base de Datos";
         * final int HORAS = 187;
         */

        int sesiones = HORAS * 60 / 50;
        double sesAp = sesiones * 0.06;
        double sesPrdCont = sesiones * 0.1;

        System.out.printf("El módulo de %s tiene %d sesiones%n", MODULO, sesiones);
        System.out.printf("Apercibimiento al superar %.1f faltas no justificadas%n", sesAp);
        System.out.printf("Pérdida de la evaluación contínua con %.1f faltas no justificadas %n", sesPrdCont);                                

        Scanner sc = new Scanner(System.in);
        System.out.print("Cuantas faltas NO justificadas de sesiones tienes? ");
        int faltasNJ = sc.nextInt();

        sc.close();

        String mensaje = faltasNJ > sesPrdCont ? "Pérdida de evaluación continua" : faltasNJ > sesAp ? "Apercibimiento" : "Ningún problema";
        System.out.println(mensaje);
    }
}
