package ud6.ficherosbinarios;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class FicheroBinarioEscribir {
    public static void main(String[] args) {
        try {
            FileOutputStream archivo = new FileOutputStream("datos.dat");
            ObjectOutputStream out = new ObjectOutputStream(archivo);

            out.writeInt(33);
            out.writeDouble(8.7);
            out.writeBoolean(true);

            Partida p = new Partida();
            p.posJugador = new int[] {7, 7};
            out.writeObject(p);

            out.close();

        } catch (FileNotFoundException e) {
            System.out.println("No se encuentra el fichero");
        } catch (IOException e) {
            System.out.println("Error Entrada/Salida");
            e.printStackTrace();
        }

        
    }
}
