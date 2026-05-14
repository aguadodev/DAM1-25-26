package ud6.ficherostexto;


/**
 * @author Adrian S.C
 */
import java.io.File;
import java.util.Locale;
import java.util.Scanner;

public class E1005 {
    public static void main(String[] args)  throws Exception{
        File ficherito = new File("NumerosReales.txt");
        Scanner sc = new Scanner(ficherito);
        sc.useLocale(Locale.US);

        double suma = 0;
        int cont = 0;

        // mientras sea un numero 
        while (sc.hasNextDouble()) {
            // Pillamos el numero y lo guardamos en variable
            double numero = sc.nextDouble();
            // lo acumulamos en la suma 
            suma = suma + numero;
            // y contamos cuantos hay para luego dividirlos
            cont = cont + 1;
        }

        sc.close();

        System.out.println("Suma: " + suma);
        System.out.println("Media: " + (suma / cont));
    }
}
