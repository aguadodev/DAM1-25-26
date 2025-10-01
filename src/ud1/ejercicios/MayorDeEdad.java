package ud1.ejercicios;
import java.util.Scanner;

/**
 * @author Óscar
 */
public class MayorDeEdad {
    public static void main(String[] args) {
        String nombre;
        int edad;
        final int MAYORIA_DE_EDAD = 18;
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe tu nombre: ");
        nombre = sc.nextLine();

        System.out.println("Escribe tu edad: ");
        edad = sc.nextInt();
        sc.close();  // Cierro el Scanner para liberar recursos

        boolean mayorDeEdad = edad >= MAYORIA_DE_EDAD;

        System.out.println("Hola, " + nombre);
        System.out.println("Eres mayor de edad? " + mayorDeEdad);
    }
}
