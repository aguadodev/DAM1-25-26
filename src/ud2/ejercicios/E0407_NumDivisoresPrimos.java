package ud2.ejercicios;

import ud2.Util;

public class E0407_NumDivisoresPrimos {

    static int numDivisoresPrimos(int n) {
        int numDivisoresPrimos = 0;

        for (int i = 2; i <= n; i++) {
            if (n % i == 0 && Util.esPrimo(i)) {
                numDivisoresPrimos++;
            }
        }

        return numDivisoresPrimos;
    }


    public static void main(String[] args) {
        for (int i = 1; i < 20; i++) {
            int numDivisoresPrimos = numDivisoresPrimos(i);
            System.out.println(i + " - " + numDivisoresPrimos);        
        }
    }
}
