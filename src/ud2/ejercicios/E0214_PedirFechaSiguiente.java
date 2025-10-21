package ud2.ejercicios;

import java.util.Scanner;

/**
 * @author AmerCz.
 *
 *         /*
 *         Crear una aplicación que solicite al usuario una fecha (día, mes,
 *         año) y muestre la fecha correspondiente al día siguiente.
 */

public class E0214_PedirFechaSiguiente {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Día: ");
        int dia = sc.nextInt();

        System.out.print("Mes: ");
        int mes = sc.nextInt();

        System.out.print("Año: ");
        int year = sc.nextInt();
        sc.close();

        System.out.printf("El día actual es (%02d / %02d / %04d) %n", dia, mes, year);

        boolean esBisiesto = (year % 4 == 0 || year % 400 == 0 && !(year % 100 == 0));
        int diasMesActual = 0;
        dia++;

        switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12 -> diasMesActual = 31;
            case 4, 6, 9, 11 -> diasMesActual = 30;
            case 2 -> diasMesActual = esBisiesto ? 29 : 28;
        }

        if (dia > diasMesActual) {
            dia = 1;
            mes++;
            if (mes > 12) {
                mes = 1;
                year++;
            }
        }

        System.out.printf("El día +1 es (%02d / %02d / %04d)", dia, mes, year);
    }
}
