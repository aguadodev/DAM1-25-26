package ud3.strings;

import java.util.Random;
import java.util.Scanner;

public class E0614_Juego_Anagrama {
    public static void main(String[] args) {
        // Colección de palabras
        /*String[] palabras = {
            "amor", "teclado", "programa", "instituto", "ciudad"
        };*/

        String[] palabras = Util.readFileToStringArray("palabras.txt");

        // Elige una palabra al azar y genera su anagrama
        Random rnd = new Random();
        String palabraOculta = palabras[rnd.nextInt(palabras.length)];
        String anagrama = generarAnagrama(palabraOculta);

        // Comienza el juego
        System.out.println("Adivina la palabra oculta!");
        System.out.println("Escribe la palabra asociada a este anagrama: \"" + anagrama + "\"");
        Scanner sc = new Scanner(System.in);

        String palabraUsuario = sc.nextLine();

        while (!palabraOculta.equals(palabraUsuario)) {
            System.out.println("Prueba otra vez");
            palabraUsuario = sc.nextLine();
        }
        sc.close();

        System.out.println("Enhorabuena!! Esa era la palabra oculta!!");
    }

    public static String generarAnagrama(String str) {
        char[] t = str.toCharArray();

        Random rnd = new Random();
        // Recorrer cada elemento
        for (int i = 0; i < t.length; i++) {
            // Genero una posición aleatoria
            int posRnd = rnd.nextInt(t.length);
            // Intercambio los valores de la posición actual y la aleatoria
            char aux = t[i];
            t[i] = t[posRnd];
            t[posRnd] = aux;
        }        

        return String.valueOf(t);
    }

}
