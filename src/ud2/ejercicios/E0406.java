package ud2.ejercicios;

/**
 * 
 * @author Tomás
 * 
 */
public class E0406 {
    static boolean esPrimo(int n) {
        if (n <= 1)
            return false;

        boolean esPrimo = true;
        for (int i = 2; esPrimo && i <= n / 2; i++) {
            if (n % i == 0) {
                esPrimo = false;
            }
        }

        return esPrimo;
    }

    public static void main(String[] args) {
        System.out.println(esPrimo(14));

        System.out.println(esPrimo(500));
        System.out.println(esPrimo(13));
        System.out.println(esPrimo(333));

        System.out.println("Es Primo?");
        for (int i = 1; i < 100; i++) {
            System.out.println(i + "? " + esPrimo(i));
        }
    }
}
