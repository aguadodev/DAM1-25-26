package ud5;

import java.util.Collection;

import ud3.strings.Util;

public interface CSV <T> {
    String generarLinea(T e);

    static <T> void guardarCSV(Collection<T> c, CSV<T> csv, String fichero) {        
        String str = "";
        for (T t : c) {
            str += csv.generarLinea(t) + "\n";
        }
        Util.writeStringToFile(str, fichero);
    }    
}
