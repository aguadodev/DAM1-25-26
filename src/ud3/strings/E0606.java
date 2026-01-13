package ud3.strings;

public class E0606 {
    public static void main(String[] args) {
        System.out.println(esVocal('0'));
        System.out.println(esVocal('a'));
        System.out.println(esVocal('m'));
        System.out.println(esVocal('á'));
        System.out.println(esVocal('Ü'));


        System.out.println(sinVocales("Álvaro Pérez")); // lvr Prz
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
