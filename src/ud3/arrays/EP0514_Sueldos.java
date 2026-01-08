package ud3.arrays;

import java.util.Arrays;
import java.util.Scanner;

/*
El ayuntamiento de tu localidad te ha encargado una aplicación que ayude a realizar encuestas estadísticas para conocer el nivel adquisitivo de los habitantes del municipio. Para ello, tendrás que preguntar el sueldo a cada persona encuestada. A priori, no conoces el número de encuestados. Para finalizar la entrada de datos, introduce un sueldo con valor -1.

Una vez terminada la entrada de datos, muestra la siguiente información:
Todos los sueldos introducidos ordenados de forma decreciente.
El sueldo máximo y mínimo.
La media de los sueldos.
Cuántos sueldos hay por encima de la media.
Cuántos sueldos hay por debajo de la media.

*/

public class EP0514_Sueldos {

    public static void main(String[] args) {
        double[] sueldos = new double[0];

        // ENTRADA DE DATOS
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce sueldos de ciudadanos (-1 para terminar): ");
        double sueldo = sc.nextDouble();

        while (sueldo != -1) {
            // Procesar entrada: Añadir el sueldo al array
            sueldos = Arrays.copyOf(sueldos, sueldos.length + 1);
            sueldos[sueldos.length - 1] = sueldo;

            // Leer el siguiente sueldo
            sueldo = sc.nextDouble();
        }

        // PROCESO DE DATOS
        if (sueldos.length > 0) {
            Arrays.sort(sueldos);
            System.out.println();
            for (int i = sueldos.length - 1; i >= 0; i--) {
                System.out.print(sueldos[i] + " ");
            }

            System.out.println();
            System.out.println("Máximo sueldo: " + sueldos[sueldos.length - 1]);
            System.out.println("Mínimo sueldo: " + sueldos[0]);

            double suma = 0;
            for (double s : sueldos) {
                suma += s;
            }
            double media = suma / sueldos.length;
            System.out.println("Media de sueldos: " + media);

            int contSueldosMayoresMedia = 0;
            int contSueldosMenoresMedia = 0;
            for (double s : sueldos) {
                if (s > media)
                    contSueldosMayoresMedia++;
                else if (s < media)
                    contSueldosMenoresMedia++;
            }
            System.out.println("Número de sueldos por encima de la media: " + contSueldosMayoresMedia);
            System.out.println("Número de sueldos por debajo de la media: " + contSueldosMenoresMedia);

        }

    }
}
