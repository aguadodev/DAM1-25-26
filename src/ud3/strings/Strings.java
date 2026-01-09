package ud3.strings;

public class Strings {
    public static void main(String[] args) {

        String str = "Hola\n";
        String cad = "En un lugar de la mancha";
        String msg = "Un corazón: \u2661";
        String str2 = new String("Mi perro \"Perico\"");

        str = String.valueOf(1234566798);
        cad = String.valueOf(-12.1234);

        double numero = Double.valueOf(cad);

        System.out.println(str);
        System.out.println(cad);
        System.out.println(msg);
        System.out.println(str2);

        int longitud = cad.length(); // 8
        int longitud2 = "Hola".length(); // 4

        System.out.println("FIN");

    }
}
