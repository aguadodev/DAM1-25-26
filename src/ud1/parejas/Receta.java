package ud1.parejas;

import java.util.Scanner;

/**
 * @author Darío y Marco
 */
public class Receta {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int personas;

        System.out.print("Dime el número de personas: ");
        personas = sc.nextInt();

        double agua = 55 * personas;
        double azucar = 20 * personas;
        double manzanas = 250 * personas;
        double zumo = 0.16 * personas;
        double naranja = 0.16 * personas;
        double canela = 0.16 * personas;

        System.out.println("Para este número de personas necesitas: " + agua + "ml de agua ");
        System.out.println("Para este número de personas necesitas: " + azucar + "g de azúcar ");
        System.out.println("Para este número de personas necesitas: " + manzanas + "g de manzanas ");
        System.out.println("Para este número de personas necesitas: " + zumo + "% de una cucharadita de zumo ");
        System.out.println("Para este número de personas necesitas: " + naranja + "% de naranja");
        System.out.println("Para este número de personas necesitas: " + canela + "% de una rama de canela");

        double precioManzana = 0.20 * personas;
        double precioAzucar = 0.05 * personas;
        double total = precioManzana + precioAzucar;

        System.out.printf("Este es el precio de las manzanas:  %.2f euros%n", precioManzana);
        System.out.printf("Este es el precio de el azúcar:  %.2f euros%n", precioAzucar);
        System.out.printf("Este es el precio Total:  %.2f euros%n ", total);

        sc.close();
    }
}
