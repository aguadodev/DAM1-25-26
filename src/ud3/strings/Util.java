package ud3.strings;

import java.io.Console;

public class Util {

    public static String leerPassword() {
        Console cons = System.console();

        String passwd = new String(cons.readPassword());

        return passwd;
    }


    public static String invertirCadena(String str) {
        String cadenaInvertida = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            cadenaInvertida += str.charAt(i);
        }
        return cadenaInvertida;
    }    

    public static int contarEspacios(String cad1) {
        int n = cad1.length();
        String cad2 = cad1.replaceAll(" ", "");
        int n2 = cad2.length();
        return n - n2;
    }

    public static boolean esVocal(char ch) {
        String vocales = "aeiouAEIOUáéíóúÁÉÍÓÚüÜ";

        boolean esVocal = false;
        
        for (int i = 0; i < vocales.length(); i++) {
            if (ch == vocales.charAt(i))
                esVocal = true;
        }

        return esVocal;
    }

    public static String sinVocales(String cad) {
        String sinVocales = "";

        for (int i = 0; i < cad.length(); i++) {
            char caracter = cad.charAt(i);
            if(!esVocal(caracter))
                sinVocales += caracter;
        }

        return sinVocales;
    }

}
