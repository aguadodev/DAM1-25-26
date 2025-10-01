package ud1.ejercicios;
import java.util.Scanner;

/*
 * AreaTriangulo. Realiza un programa que calcule el área de un triángulo a partir de los datos solicitados por teclado al usuario. 
La fórmula para el área de un triángulo es:

Donde:
b es la base.
h es la altura.
Convierte esta fórmula en una expresión algorítmica en Java asumiendo que b y h son variables de tipo double.
 */

/**
 * @author Adam y Matias
 */

public class AreaTriangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime cuál es la base de triángulo: ");
        double base = sc.nextDouble();
        System.out.println("Dime cuál es la altura del triángulo: ");
        double altura = sc.nextDouble();
        sc.close();
        double area = base * altura / 2;
        System.out.println("El área del triángulo es igual a " + area);

    }
}
