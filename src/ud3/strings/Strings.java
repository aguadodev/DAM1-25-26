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

        System.out.println("COMPARACIONES");
        System.out.println("Hola".equals(cad));
        System.out.println(cad.equals("Hola"));

        cad = "Mi perro ladra mucho";
        String otra = "Un bonito perro blanco";
        boolean b = cad.regionMatches(3, otra, 10, 8);
        System.out.println(b);

        System.out.println(cad + ". ".concat(otra));
        
        String multilinea = """
                
            STRING MULTILINEA
                linea 1
                linea 2
                linea 3
                """;

        System.out.println(multilinea);

        System.out.println("FIN");

    }
}
