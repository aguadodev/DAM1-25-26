package ud6.ficherostexto;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/**
 * @author Araujo
 */
public class E1004 {
    public static void main(String[] args) {
        try {
            BufferedReader in = new BufferedReader(new FileReader("NumerosReales.txt"));
            String linea = in.readAllAsString();
            String[] nums = linea.split("[ \n]");
            Double suma = 0.;
            Double media = 0.;
            for (int i = 0; i < nums.length; i++) {
                Double n = Double.parseDouble(nums[i]);
                suma += n;
            }
            media = suma / nums.length;
            System.out.println(suma);
            System.out.println(media);
            in.close();
        } catch (FileNotFoundException e) {
            System.out.println("Fichero no encontrado o inexistente");
        } catch (IOException e) {
            System.out.println("Error de entrada/salida");
        }
    }
    
}
