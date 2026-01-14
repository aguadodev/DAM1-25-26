package ud3.strings;

public class E0608 {
    public static void main(String[] args) {
        final String PREFIJO = "Javalín, javalón";
        final String SUFIJO = "javalén, len, len";
        String cad = "Javalín, javalón      Programar mola";
        String cad2 = "Programar rocks           javalén, len, len";

        if (cad.startsWith(PREFIJO)) {
            System.out.printf("\"%s\" está escrita en el IDIOMA de Javalandia. %n", cad);
            String mensaje = cad.substring(PREFIJO.length());
            mensaje = mensaje.stripLeading();
            System.out.printf("El mensaje es \"%s\" %n", mensaje);
            System.out.println("Este mensaje en dialecto sería: ");
            System.out.printf("\"%s\" %n", mensaje + " " + SUFIJO );
        }

        System.out.println();

        if (cad2.endsWith(SUFIJO)) {
            System.out.printf("\"%s\" está escrita en el DIALECTO de Javalandia. %n", cad2);
            String mensaje = cad2.substring(0, cad2.length() - SUFIJO.length());
            mensaje = mensaje.stripTrailing();
            System.out.printf("El mensaje es \"%s\" %n", mensaje);
            System.out.println("Este mensaje en idioma de Javalandia sería: ");
            System.out.printf("\"%s\" %n", PREFIJO + " " + mensaje);            
        }

    }
}
