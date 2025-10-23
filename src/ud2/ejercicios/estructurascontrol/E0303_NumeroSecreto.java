/*
 * E0303_NumeroSecreto. Codificar el juego “el número secreto”, que consiste en acertar un número entre 1 y 100 (generado aleatoriamente). Para ello se introduce por teclado una serie de números, para los que se indica: “mayor” o “menor”, según sea mayor o menor con respecto al número secreto. El proceso termina cuando el usuario acierta o cuando se rinde (introduciendo un -1).
 */
package ud2.ejercicios.estructurascontrol;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Alex
 */

public class E0303_NumeroSecreto {

    public static void main(String[] args) {
        Random rdm = new Random();
        int numeroSecreto = rdm.nextInt(100) + 1;

        Scanner sc = new Scanner(System.in);
        final int MAX_INTENTOS = 1;
        int numeroIntroducido = 0;
        int intentos = 0;
        boolean seHaRendido = false;
        boolean haAcertado = false;

        while (!haAcertado && !seHaRendido && intentos < MAX_INTENTOS) {
            System.out.print("Introduce un número: ");
            numeroIntroducido = sc.nextInt();
            haAcertado = numeroSecreto == numeroIntroducido;
            seHaRendido = numeroIntroducido == -1;
            intentos++;
            if (numeroSecreto > numeroIntroducido) {
                System.out.println("El número secreto es mayor");
            } else if (numeroSecreto < numeroIntroducido) {
                System.out.println("El número secreto es menor");
            }
        }

        
        System.out.println("FIN DEL JUEGO");
        if (haAcertado) {
                System.out.println("Has acertado el número");
                System.out.printf("Te tomó el número de %d intentos.", intentos);            
        } else if (seHaRendido) {
                System.out.printf("Te has rendido y el número era %d", numeroSecreto);
        } else {
            System.out.println("Superaste el número de intentos: " + intentos);
        }

        sc.close();
    }

}
