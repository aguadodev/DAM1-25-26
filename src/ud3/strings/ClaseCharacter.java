package ud3.strings;

import java.util.Scanner;

public class ClaseCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe un carácter: ");
        char ch = sc.nextLine().charAt(0);

        if (Character.isDigit(ch))
            System.out.println("Es un número");
        if (Character.isLetter(ch))
            System.out.println("Es una letra");
        if (Character.isLetterOrDigit(ch))
            System.out.println("Es una letra o un número");
        if (Character.isLowerCase(ch)) {
            System.out.println("Es una minúscula.");
            System.out.println("La mayúscula equivalente es: " + Character.toUpperCase(ch));
        }
        if (Character.isUpperCase(ch)) {
            System.out.println("Es una mayúscula.");
            System.out.println("La minúscula equivalente es: " + Character.toLowerCase(ch));
        }
        if (Character.isSpaceChar(ch))
            System.out.println("Es el carácter espacio");
        if (Character.isWhitespace(ch))
            System.out.println("Es un carácter espacio o tabulador, salto de línea, etc.");
    }
}
