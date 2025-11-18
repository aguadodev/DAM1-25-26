package ud2.xxxexamen;

import java.util.Scanner;

public class Mario {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean juegoIniciado = false;
        int contSaltosArriba = 0;
        int contSaltosAbajo = 0;
        int altura = sc.nextInt();
        int posicionActual = altura;
        while (altura >= 0) {
            // Procesar altura
            if (!juegoIniciado) {
                posicionActual = altura;
                juegoIniciado = true;
            } else {
                if (altura > posicionActual) {
                    // Saltó hacia arriba?
                    contSaltosArriba++;

                } else if (altura < posicionActual) {
                    // o saltó hacia abajo
                    contSaltosAbajo++;
                }
                posicionActual = altura;

            }
            altura = sc.nextInt();
        }

        System.out.println(contSaltosArriba + " " + contSaltosAbajo);

    }
}
