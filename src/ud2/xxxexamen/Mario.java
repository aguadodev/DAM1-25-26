package ud2.xxxexamen;

import java.util.Scanner;

public class Mario {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        boolean inicioJuego = false;        
        int altura = sc.nextInt();
        int posicionActual = altura;
        while (altura != -1) {
            // Procesar altura
            if (!inicioJuego) {
                posicionActual = altura;
                inicioJuego = true;
            } else {
                // Saltó hacia arriba?
                // o saltó hacia abajo                
                if (posicionActual > altura) {

                } else if (posicionActual < altura) {

                }

            }
            altura = sc.nextInt();
        }

    }
}
