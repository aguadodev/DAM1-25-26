package ud2.ejercicios;

/**
 * @author Alex
 */

public class E0402_Rango {

    static void imprimirRango(int inicio, int fin) {
        for (int i = inicio + 1; i < fin; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        imprimirRango(2, 17);
        imprimirRango(0, 1);
        imprimirRango(-10, -2);
        imprimirRango(-1, -2);
        
    }
}
