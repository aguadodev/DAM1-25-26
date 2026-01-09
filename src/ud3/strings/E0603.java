/**
 * 
 * @author Ismael caldas 
 */

package ud3.strings;

import java.util.Scanner;

public class E0603 {

    public static void main(String[] args) {
        final int MAX_INTENTOS = 3;

        Scanner sc = new Scanner(System.in);

        System.out.println("!Jugador 1 introduce la contraseña");

        String contrasena = Util.leerPassword();

        boolean haAcertado = false;
        
        int intentosRestantes = MAX_INTENTOS;

        while (!haAcertado && intentosRestantes > 0) {

            System.out.println("!jugador2 Introduce la posible contraseña");

            String contrasenaJugador2 = sc.nextLine();

            if (contrasena.equalsIgnoreCase(contrasenaJugador2)) {
                System.out.println("Has acertado!");
                haAcertado = true;
            } else {
                System.out.println("No es la contraseña correcta vuelve a intentarlo");
                intentosRestantes--;
                System.out.println("te quedan " + intentosRestantes + " Intentos");
            }
        }
        sc.close();

    }
}
