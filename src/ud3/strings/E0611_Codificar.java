package ud3.strings;

public class E0611_Codificar {
    public static void main(String[] args) {
        String conjunto1 = "eikmpqrstuv";
        String conjunto2 = "pviumterkqs";

        String palabra = "PaquiTo";

        String palbraCodificada = codifica(conjunto1, conjunto2, palabra);

        System.out.println(palbraCodificada); // "matqvko"

        System.out.println(codifica(conjunto2, conjunto1, palbraCodificada)); // "paquito"


    }

    static String codifica(String conjunto1, String conjunto2, String palabra) {
        String resultado = "";

        palabra = palabra.toLowerCase();

        for (int i = 0; i < palabra.length(); i++) {
            char letra = palabra.charAt(i);
            int posicionLetra = conjunto1.indexOf(letra);

            if (posicionLetra == -1) {
                resultado += letra;
            } else {
                resultado += conjunto2.charAt(posicionLetra);
            }
            
        }

        return resultado;
    }

}