package ud1.ejercicios;
import java.util.Scanner;

/*
 * EP0121_CelsiusAFarenheit. Convertir una temperatura introducida por teclado en grados Celsius o centígrados a grados Farenheit, mostrando el resultado por pantalla.
 */
/*
 * @ Author Fran
 */
public class EP0121_CelsiusAFarenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce los grados Celsius: ");
        double gradosC = sc.nextDouble();
        sc.close();

        double gradosF =  gradosC * 9 / 5 + 32;

        System.out.println("El resultado es: " + gradosF + " grados Farenheit");
    }
}
