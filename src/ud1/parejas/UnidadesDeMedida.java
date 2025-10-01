package ud1.parejas;

import java.util.Scanner;

/**
 * @author María y Brais
 */

public class UnidadesDeMedida {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final double HECTAREA = 10000;
        final double CAMPO_FUTBOL = 105 * 70;
        final double CANCHA_BASKET = 28 * 15;
        final double PISTA_TENIS = 23.77 * 10.97;
        final double PARQUE_RETIRO = 125 * HECTAREA;

        System.out.print("Introduce el número de hectáreas quemadas: ");
        double hec = sc.nextDouble();
        sc.close();

        double superficie = hec * HECTAREA;
        double cF = superficie / CAMPO_FUTBOL;
        double cB = superficie / CANCHA_BASKET;
        double pT = superficie / PISTA_TENIS;
        double pR = superficie / PARQUE_RETIRO;

        System.out.printf("Se han quemado: %.2f campos de fútbol%n", cF);
        System.out.printf("Se han quemado: %.2f campos de basket%n", cB);
        System.out.printf("Se han quemado: %.2f pistas de tenis%n", pT);
        System.out.printf("Se han quemado: %.2f parques del retiro%n", pR);

    }

}
