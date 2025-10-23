package ud2.ejercicios.estructurascontrol;

import java.util.Scanner;
/**
 * @author Adrián Gómez
 */
public class Bisiesto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Inserta un año: ");
        int anho = sc.nextInt();
        sc.close();

        boolean multiplo400 = anho % 400 == 0;
        boolean multiplo100 = anho % 100 == 0;
        boolean multiplo4 = anho % 4 == 0;

        if (multiplo400 || multiplo4 && !multiplo100) {
            System.out.println("Es año bisiesto");
        } else {
            System.out.println("NO es año bisiesto");
        }

        /* Con Condicionales anidadas
        if (multiplo400) {
            System.out.println("Es bisiesto");
        } else if (multiplo4 && !multiplo100) {
            System.out.println("Es bisiesto");
        } else {
            System.out.println("No es bisiesto");
        }*/
         

        /* Evaluando si NO es bisiesto (REVISAR)
        if (!multiplo4 || multiplo100 && !multiplo400) {
            System.out.println("NO es año bisiesto");
        } else {
            System.out.println("Es año bisiesto");
        }        
         */
    }
}
