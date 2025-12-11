package ud3.arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class E0511_CamaraSecreta {
    public static void main(String[] args) {
        int longitud = Util.ventanaLeerInt("Longitud de la combinación?");
        Util.ventanaImprimir("Longitud de la combinación generada: " + longitud);
        // Generar combinación aleatoria
        int[] combinacionSecreta = arrayAleatorio(longitud);
        
        // Pedir combinación
        int[] combinacionUsuario = leerCombinacion(longitud);
        
        while (!Arrays.equals(combinacionSecreta, combinacionUsuario)) {
            // Generar y Mostrar Pista
            // Pedir combinación
            combinacionUsuario = leerCombinacion(longitud);
        }

        // Enhorabuena
        System.out.println("Enhorabuena!!");
    }

    public static int[] leerCombinacion(int longitud) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce los " + longitud + " valores de la combinación separados por espacios");
        int[] t = new int[longitud];
        for (int i = 0; i < t.length; i++) {
            t[i] = sc.nextInt();
        }
        return t;
    }

    public static int[] arrayAleatorio(int n) {
        Random rnd = new Random();
        int[] arrayAleatorio = new int[n];

        for (int i = 0; i < arrayAleatorio.length; i++) {
            arrayAleatorio[i] = rnd.nextInt(1, 6); 
        }
    return arrayAleatorio;
    }    
}
