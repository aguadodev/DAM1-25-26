package ud3.arrays;

import java.util.Arrays;

public class Util {

    static public int[] insertarAlFinal(int[] t, int num) {
        t = Arrays.copyOf(t, t.length + 1);
        t[t.length - 1] = num;
        return t;
    }

    static public int[] insertarAlInicio(int[] t, int num) {
        t = Arrays.copyOf(t, t.length + 1);
        System.arraycopy(t, 0, t, 1, t.length - 1);
        t[0] = num;
        return t;
    }

    static public int[] insertarEnPosicion(int[] t, int num, int pos) {
        t = Arrays.copyOf(t, t.length + 1);
        System.arraycopy(t, pos, t, pos + 1, t.length - pos - 1);
        t[pos] = num;
        return t;
    }

    static public int[] eliminarAlFinal(int[] t) {
        t = Arrays.copyOf(t, t.length - 1);
        return t;
    }

    static public int[] eliminarAlInicio(int[] t) {
        t = Arrays.copyOfRange(t, 1, t.length);
        //System.arraycopy(t, 1, t, 0, t.length - 1);
        /*for (int i = 0; i < t.length - 1; i++) {
            t[i] = t[i + 1];
        }

        t = Arrays.copyOf(t, t.length - 1);*/

        return t;
    }

    public static void main(String[] args) {
        int[] numeros = { 1, 2, 3, 4 };
        numeros = insertarAlFinal(numeros, 5);
        numeros = insertarAlInicio(numeros, 5);
        numeros = insertarEnPosicion(numeros, 5, 2);
        numeros = eliminarAlFinal(numeros);
        numeros = eliminarAlInicio(numeros);
        System.out.println(Arrays.toString(numeros));

        int t1[] = {1, 2, 3};
        int t2[] = {1, 2, 3};
        
        System.out.println(t1 == t2); // false
        
        System.out.println(Arrays.equals(t1, t2)); // true
    }

}
