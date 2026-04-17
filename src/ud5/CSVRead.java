package ud5;

import java.util.ArrayList;
import java.util.Collection;

import ud3.strings.Util;

public interface CSVRead <T> {
    T parsearLinea(String str);

    static <T> Collection<T> leerCSV(CSVRead<T> csv, String fichero) {        
        Collection<T> c = new ArrayList<>();
        String contenido = Util.readFileToString(fichero);
        String[] lineas = contenido.split("\n");

        for (String linea : lineas) {
            T e = csv.parsearLinea(linea);
            c.add(e);
        }
        return c;
    }    
}
