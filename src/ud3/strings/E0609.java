package ud3.strings;

import java.util.Scanner;

public class E0609 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final String FIN = "fin";
        String frase = "";

        System.out.println("Introduce las palabras de una frase una a una. Introduce \'"+ FIN + "\' para terminar:");
        String palabra = sc.nextLine();
        while (!palabra.equalsIgnoreCase(FIN)) {
            // Proceso
            frase += palabra + " ";
            // Volver a leer
            palabra = sc.nextLine();
        }
        sc.close();
        
        frase = frase.stripTrailing();

        System.out.println("Frase Completa: \"" + frase + "\"");
    }
}
