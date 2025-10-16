package ud2.ejemplos;

import java.util.Scanner;

public class Bucles {
    public static void main(String[] args) {
        // Bucle de 0 iteraciones
        int contador = -8;
        while (contador >= 0) {
            // Cuerpo del bucle
            System.out.println(contador);
        }

        // Bucle infinito
        /*int contador2 = -8;
        while (contador2 < 0) {
            // Cuerpo del bucle
            System.out.println(contador2);
        }*/

        // Ejemplo lectura anticipada
/*        Scanner sc = new Scanner(System.in);
        int num;
        int suma = 0; // acumulador números


        do {
            System.out.print("Número ( < 0 para finalizar): ");
            num = sc.nextInt();

            if (num != -1) 
                suma += num;

        } while (num != -1);
*/

        // Lectura adelantada
        /*System.out.print("Número ( < 0 para finalizar): ");
        num = sc.nextInt();

        while (num >= 0) { // inicio del bucle while
            suma += num;

            // lectura del siguiente número
            System.out.print("Número ( < 0 para finalizar): ");
            num = sc.nextInt();
        }
        System.out.println("Suma: " + suma);
*/






        // Bucle controlado por contador
        // Imprime los números de 0 a 9
        /*int n = 10;
        int contador3 = 0;

        while (contador3 < n) {
            contador3++;
            System.out.print(contador3);
        }*/

        // Versión for
        int i = 10;
        for (; i >= 0; ) {
            System.out.println(i);
            i -= 2;
        }

    }
}
