package ud3.api;

/**
 * @author Hugo Romay
 */

public class Circulo {
    static double volumenEsfera(double radio) {
        return 4.0 / 3 * Math.PI * Math.pow(radio, 3);
    }

    public static void main(String[] args) {
        System.out.println( volumenEsfera(14.5));
    }
}
