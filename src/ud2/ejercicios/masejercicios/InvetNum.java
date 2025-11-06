package ud2.ejercicios.masejercicios;
/**
 * @author Ignacio MR
 */
public class InvetNum {
    static long InvertirNum(long n) {
        long numInvert=0;
        while (n % 10 != 0) {
            numInvert = numInvert*10 + n%10;
            n = n/10;
        }
        return numInvert;
    }
    public static void main(String[] args) {
        final long num = 12422;
        System.out.println(InvertirNum(num));
    }
}
