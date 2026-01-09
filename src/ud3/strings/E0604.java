/**
 * @author Fran
 */
package ud3.strings;

import java.util.Scanner;

public class E0604 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una frase por teclado: ");
        String cad1 = sc.nextLine();
        sc.close();
        System.out.println("El número de espacios en blanco es de: " + contarEspacios(cad1));
        System.out.println("El número de espacios en blanco es de: " + contarEspacios2(cad1));


    }

    public static int contarEspacios(String cad1) {
        int n = cad1.length();
        String cad2 = cad1.replaceAll(" ", "");
        int n2 = cad2.length();
        return n - n2;
    }


    public static int contarEspacios2(String cad1) {
        int numEspacios = 0;
        for (int i = 0; i < cad1.length(); i++) {
            if (Character.isSpaceChar(cad1.charAt(i))) 
                numEspacios++;
        }
        return numEspacios;
    }
}
