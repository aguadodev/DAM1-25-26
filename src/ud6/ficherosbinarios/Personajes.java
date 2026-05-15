package ud6.ficherosbinarios;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import ud4.rol.Personaje;

public class Personajes {
    public static void main(String[] args) {
        // Genera y escribe 10 Personajes de rol en un fichero binario
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("personajesRol.dat"))) {

            for (int i = 0; i < 10; i++) {
                out.writeObject(new Personaje("Jugador" + (i + 1)));
            }

        } catch (IOException ex) {
            System.out.println("Escribiendo... Error Entrada/Salida");
        }

        Personaje[] tabla = new Personaje[10];
        // Lee 10 Personajes de rol de un fichero binario
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("personajesRol.dat"))) {

            int i = 0;
            while (true) {
                tabla[i] = (Personaje) in.readObject();
                i++;
            }

        } catch (EOFException ex) {
            System.out.println("Leyendo... Excepción fin de fichero");
        } catch (IOException ex) {
            System.out.println("Leyendo... Error Entrada/Salida");
        } catch (ClassNotFoundException ex) {
            System.out.println("ClassNotFoundException");
        }

        for (Personaje p : tabla)
            System.out.println(p);

    }
}
