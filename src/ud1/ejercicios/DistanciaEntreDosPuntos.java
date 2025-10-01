package ud1.ejercicios;
import java.util.Locale;
import java.util.Scanner;

/*
 * DistanciaEntreDosPuntos. La fórmula para la distancia entre dos puntos  es:

Convierte esta fórmula en una expresión algorítmica en Java, asumiendo que las coordenadas  son variables de tipo double y realiza un programa que calcule la distancia entre dos puntos a partir de los datos solicitados por teclado al usuario.
 */

/**
 * @author Samuel
 */

public class DistanciaEntreDosPuntos {
    public static void main(String[] args) {
        double x1;
        double x2;
        double y1;
        double y2;

        Scanner sc = new Scanner(System.in);
        // Configuramos la entrada en formato americano => El separador decimal esperado es el punto (.)
        sc.useLocale(Locale.US); 
        System.out.print("Introduce la coordenada X del punto 1: ");
        x1 = sc.nextDouble();
        System.out.print("Introduce la coordenada Y del punto 1: ");
        y1 = sc.nextDouble();
        System.out.print("Introduce la coordenada X del punto 2: ");
        x2 = sc.nextDouble();
        System.out.print("Introduce la coordenada Y del punto 2: ");
        y2 = sc.nextDouble();
        sc.close();

        double distancia = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

        System.out.print("La distancia es " + distancia);

    }

}