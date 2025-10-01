package ud1.ejercicios;
import java.util.Scanner;
/*
 * EP0122_FarenheitACelsius. Convertir una temperatura introducida por teclado en grados Farenheit a grados Celsius o centígrados, mostrando el resultado por pantalla.
 */

/**
 * @author Araujo
 */

public class EP0122_FarenheitACelsius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Escribe la temperatura en grados Farenheit: ");
        double farenheit = sc.nextDouble();

        double celsius = (farenheit - 32) * 5 / 9;
        sc.close();
        System.out.printf("La temperatura en grados Celsius es: %.2f %n", celsius);
    }
}
