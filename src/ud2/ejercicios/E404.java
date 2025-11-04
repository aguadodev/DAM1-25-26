package ud2.ejercicios;

import java.util.Scanner;

/**
 * @author Adrian S.C
 */

public class E404 {

    public static int obtenerMaximo(int a, int b) {
        return a > b ? a : b;
    }

    public static double obtenerMaximo(double a, double b) {
        return a > b ? a : b;
    }           

    public static int obtenerMaximo(int a, int b, int c) {
        int mayor;
        if (a > b)
            if (a > c)
                mayor = a;
            else
                mayor = c;
        else if (b > c)
            mayor = b;
        else
            mayor = c;

        /* Otras maneras de calcular el máximo en una sola línea de código

        // Invocando el método implementado anteriormente
        int mayor2 = obtenerMaximo(a, obtenerMaximo(b, c));

        // Invocando un método equivalente de la API de Java
        int mayor3 = Math.max(a, Math.max(b, c));

        // Con operadores ternarios encadenados
        int mayor4 = a > b ? a > c ? a : c : b > c ? b : c;
        */
        return mayor;
    }

    /**
     * Devuelve el mayor de los números naturales introducidos por teclado.
     * Termina la entrada al recibir un cero o número negativo.
     * @return máximo de los números introducidos
     */
    public static int maximoNaturalPorTeclado() {
        int maximo = -1; // Equivale a error o no haber introducido números naturales
        Scanner sc = new Scanner(System.in);

        // Lectura anticipada
        int n = sc.nextInt();
        while (n > 0) {
            // Procesamos
            maximo = obtenerMaximo(maximo, n);
            /*if (n > maximo)
                maximo = n;*/

            // Nueva Lectura
            n = sc.nextInt();
        }
        sc.close();
        return maximo;
    }


    public static void main(String[] args) {
        int num1 = 15;
        int num2 = 8;

        int max = obtenerMaximo(num1, num2);

        System.out.println(obtenerMaximo(5.7, 9.8));

        System.out.println("El máximo es: " + max);


        //System.out.println(maximoNaturalPorTeclado());

        System.out.println(obtenerMaximo(5, 8, 3));
    }
}
