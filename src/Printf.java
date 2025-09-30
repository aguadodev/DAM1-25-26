import java.text.DecimalFormat;
import java.util.Scanner;

public class Printf {
    public static void main(String[] args) {
        System.out.printf("El valor es %.2f %n", 12.3698);

        double n = 1.25036;
        System.out.printf("El primer valor es %.3f, y el segundo es %d %n", n, 100);
        System.out.println("Hola");

        int x = 10;
        System.out.printf("n = %.2f x = %d %n", n, x);

        System.out.printf("%+10.2f %n", n);
        System.out.printf("%+010.2f %n", n);

        String nombre = "Oscar";

        String saludo = String.format("Hola %s %n", nombre);

        System.out.println(saludo);

        double n2 = 5589625.5;
        String patron = "#,###.##";
        DecimalFormat formato = new DecimalFormat(patron);
        System.out.println(formato.format(n2));

        System.out.println(saludo);

        Scanner sc = new Scanner(System.in);
        char caracter; 
        System.out.print("Introduce un carácter: ");
        caracter = sc.next().charAt(0);  //se obtiene el primer carácter del String introducido por teclado       
        System.out.println("Carácter introducido -> " + caracter);


    }
}
