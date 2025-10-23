package ud2.ejercicios;
/*
 * E0403. Realizar un programa que calcule y muestre el área y el volumen de un cilindro a partir del radio de la base y la altura que se introducirá por teclado.

área = 2pi * radio * (altura + radio)
volumen = pi * radio2 * altura

Resuelve el programa implementando e invocando una función para cada cálculo.

 */
import java.util.Scanner;

/**
 * @author Ignacio MR
 */
public class E0403_Cilindro {
    public static double area(double altura, double radio) {
        return 2 * Math.PI * radio * (altura + radio);
    }

    public static double volumen(double altura, double radio) {
        return Math.PI * Math.pow(radio, 2) * altura;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Altura? ");
        double alt = sc.nextDouble();

        System.out.print("Radio de la base? ");
        double rad = sc.nextDouble();
        sc.close();
        double vol = volumen(alt, rad);
        double area = area(alt, rad);
        System.out.printf("El área del cilindro es %.2fu2 y la volumen %.2fu3", area, vol);
    }
}
