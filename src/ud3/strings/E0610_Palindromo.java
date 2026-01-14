package ud3.strings;

public class E0610_Palindromo {



    public static boolean esPalindromo2(String str) {
        String aux = str.replace(" ", "");
        String auxInv = Util.invertirCadena(aux);
        return aux.equalsIgnoreCase(auxInv);
    }

    public static boolean esPalindromo(String str) {
        boolean esPalindromo = true;
        int i = 0;
        int j = str.length() - 1;

        while (esPalindromo && i < j) {
            char letraI = str.charAt(i);
            char letraJ = str.charAt(j);
            if (Character.isWhitespace(letraJ)) {
                j--;
            } else if (Character.isWhitespace(letraI)) {
                i++;
            } else {
                // @TODO Contemplar tildes y diéresis
                esPalindromo = Character.toLowerCase(letraI) == Character.toLowerCase(letraJ);
                i++;
                j--;
            }
        }
        return esPalindromo;
    }

    public static void main(String[] args) {
        System.out.println(esPalindromo("anitalavalatina"));
        System.out.println(esPalindromo("Anitalavalatina"));
        System.out.println(esPalindromo("Anita lava la tina"));
        System.out.println(esPalindromo("Programación"));
        System.out.println(esPalindromo("Dábale arroz a la zorra el abad"));

    }
}
