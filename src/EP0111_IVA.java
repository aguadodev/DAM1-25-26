import java.util.Scanner;

/*
 * EP0111_IVA. Un economista te ha encargado un programa para realizar cálculos con el IVA. La aplicación debe solicitar la base imponible y el IVA que se debe aplicar. Muestra en pantalla el importe correspondiente al IVA y al total.
 */

public class EP0111_IVA {
    /**
     * @author Darío
     * 
     */
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la base imponible para calcular su IVA: ");
        double baseImponible = sc.nextDouble();

        System.out.print("Introduce el IVA: ");
        double iva = sc.nextDouble();
        sc.close();

        double importeIva = baseImponible * iva / 100;
        double importeTotal = importeIva + baseImponible;
        System.out.printf("El importe del IVA es %.2f euros %n", importeIva);
        System.out.printf("El importe total es de %.2f euros %n ", importeTotal);

    }
}
