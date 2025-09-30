import java.util.Scanner;
/*
 * @ Author Fran
 */
public class EP0121_CelsiusAFarenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce los grados Celsius: ");
        double grados = sc.nextDouble();
        sc.close();

        double conversion = ((grados * 9/5) + 32);

        System.out.println("El resultado es: " + conversion + "grados Celsius");
    }
}
