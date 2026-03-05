package ud4.interfaces;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public class E0910_OrdenarNumeros {
    public static void main(String[] args) {
        Random rnd = new Random();

        Integer[] numeros = new Integer[20];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rnd.nextInt(100);            
        }

        Arrays.sort(numeros, Comparator.reverseOrder());

        System.out.println(Arrays.toString(numeros));

        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe un número para comprobar si está en la colección: ");
        Integer numero = sc.nextInt();

        System.out.println(Arrays.binarySearch(numeros, numero, Comparator.reverseOrder()));

    }
}
