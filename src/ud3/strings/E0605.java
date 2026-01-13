package ud3.strings;

public class E0605 {
    public static void main(String[] args) {
        System.out.println(invertirCadena("Mi perro Perico"));
    }

    public static String invertirCadena(String str) {
        String cadenaInvertida = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            cadenaInvertida += str.charAt(i);
        }
        return cadenaInvertida;
    }
}
