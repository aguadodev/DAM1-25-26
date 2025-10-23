
/*
 * E0213. Escribir un programa que pida una hora de la siguiente forma: hora, minutos y segundos. El programa debe mostrar qué hora será un segundo más tarde. Por ejemplo: hora actual (10:41:59) => hora actual + 1 segundo (10:42:00)
 */

/**
 * @author Javier Ramírez de Aguilera Cruz
 */

package ud2.ejercicios.estructurascontrol;

import java.util.Scanner;

public class E0213 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int horas, minutos, segundos;

        System.out.print("Horas: ");
        horas = sc.nextInt();
        System.out.print("Minutos: ");
        minutos = sc.nextInt();
        System.out.print("Segundos: ");
        segundos = sc.nextInt();
        sc.close();

        if (segundos == 59) {
            segundos = 0;
            minutos++;
            if (minutos == 60) {
                minutos = 0;
                horas++;
                if (horas == 24) {
                    horas = 0;
                }
            }
        } else {
            segundos++;
        }
        System.out.printf("Un segundo después, serán las: %02d:%02d:%02d", horas, minutos, segundos);
}
}
