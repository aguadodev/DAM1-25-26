package ud1.ejercicios;
import java.util.Scanner;
/*
 * E0107_Circulo. Aplicación que calcule el perímetro y el área de un círculo a partir del valor del radio introducido por teclado. El radio puede contener decimales.
 */

/**
 * @author Adrián L.
 */
public class E0107_Circulo {
    public static void main(String[] args) {
        // 1. Declaración de variables
        double radio;
        double perimetro;
        double area;

        // 2. Entrada de datos
        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe aquí el valor del radio:");
        radio = sc.nextDouble();
        sc.close();

        // 3. Proceso
        perimetro = 2 * Math.PI * radio;
        area = Math.PI * Math.pow(radio, 2);

        // 4. Salida de datos: Mostrar resultados
        System.out.println("El perímetro es de:" + perimetro);
        System.out.println("El área es de:" + area);

    }

}
