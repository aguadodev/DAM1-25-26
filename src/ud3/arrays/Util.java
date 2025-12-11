package ud3.arrays;

import java.util.Arrays;
import java.util.Random;

import javax.swing.JOptionPane;

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

        return t;
    }

    static public int[] eliminarEnPosicion(int[] t, int pos) {
        int[] tRes = new int[t.length - 1];
        System.arraycopy(t, 0, tRes, 0, pos);
        System.arraycopy(t, pos + 1, tRes, pos, tRes.length - pos);
        return tRes;
    }

    static public int[] borrarOrdenado(int[] t, int num) {
        int pos = Arrays.binarySearch(t, num);
        if (pos != -1) {
            return eliminarEnPosicion(t, pos);
        }
        return t;
    }

    public static void desordenar(int t[]) {
        Random rnd = new Random();
        // Recorrer cada elemento
        for (int i = 0; i < t.length; i++) {
            // Genero una posición aleatoria
            int posRnd = rnd.nextInt(t.length);
            // Intercambio los valores de la posición actual y la aleatoria
            int aux = t[i];
            t[i] = t[posRnd];
            t[posRnd] = aux;
        }
    }


    // Métodos Interfaz gráfica
    public static int ventanaLeerInt(String prompt) {
        return Integer.parseInt(JOptionPane.showInputDialog(prompt));
    }

    public static String ventanaLeer(String prompt) {
        return JOptionPane.showInputDialog(prompt);
    }

    public static void ventanaImprimir(String str) {
        JOptionPane.showMessageDialog(null, str);        
    }

    public static int[] copiaDesordenada(int[] tOrdenada) {
        int[] t = tOrdenada.clone();
        Random rnd = new Random();
        // Recorrer cada elemento
        for (int i = 0; i < t.length; i++) {
            // Genero una posición aleatoria
            int posRnd = rnd.nextInt(t.length);
            // Intercambio los valores de la posición actual y la aleatoria
            int aux = t[i];
            t[i] = t[posRnd];
            t[posRnd] = aux;
        }
        return t;
    }

    public static void main(String[] args) {
        /*
        int num = ventanaLeerInt("Introduce el dato: ");
        ventanaImprimir("Valor:" + num);

        int[] numeros = { 1, 2, 3, 4, 5, 6, 7 };
        System.out.println(Arrays.toString(borrarOrdenado(numeros, 5)));
        
        // numeros = insertarAlFinal(numeros, 5);
        // numeros = insertarAlInicio(numeros, 5);
        // numeros = insertarEnPosicion(numeros, 5, 2);
        // numeros = eliminarAlFinal(numeros);
        // int[] menosNumeros = eliminarAlInicio(numeros);
        int[] menosNumeros = eliminarEnPosicion(numeros, 2);
        System.out.println(Arrays.toString(menosNumeros));
        System.out.println(Arrays.toString(numeros)); */

        
         int t1[] = {1, 2, 3};
         int t2[] = {1, 2, 3};
         
         System.out.println(t1 == t2); // false
          
         System.out.println(Arrays.equals(t1, t2)); // true
         
    }

}
