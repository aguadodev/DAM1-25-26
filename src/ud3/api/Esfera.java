package ud3.api;

public class Esfera {
    public static void main(String[] args) {
        double r = ClaseMath.random(10, 100);
        System.out.println("Radio: " + r);
        double volumenEsfera = Circulo.volumenEsfera(r);
        System.out.println("Volumen Esfera: " + volumenEsfera);
    }
}
