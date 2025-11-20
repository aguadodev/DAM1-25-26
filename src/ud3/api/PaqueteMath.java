
package ud3.api;

import java.math.BigDecimal;
import java.math.BigInteger;

import ud2.Util;

public class PaqueteMath {
    public static void main(String[] args) {
        float unCentimo = 0.01f;

        float suma = unCentimo + unCentimo + unCentimo + unCentimo + unCentimo + unCentimo;

        System.out.println(suma);

        BigDecimal centimo = new BigDecimal("0.01");

        BigDecimal granPrecision = centimo.add(centimo).add(centimo).add(centimo).add(centimo).add(centimo);
        System.out.println("Céntimos con precisión: " + granPrecision);

        System.out.println("FACTORIAL");


        for (int i = 0; i < 30; i++) {
            long factorial = Util.factorial(i);
            System.out.println(factorial);
        }
        int n = 50;
        BigInteger factorialGrande = BigInteger.ONE;
        for (int i = 2; i < n; i++) {
            BigInteger mult = BigInteger.valueOf(i);
            factorialGrande = factorialGrande.multiply(mult);
        }

        System.out.println("Factorial Grande: " + factorialGrande);



    }
}
