package ud5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import ud3.strings.Util;

public class EP1226 {
    static List<List<String>> repartoAlumnos(List<String> lista, int numGrupos) {
        Collections.shuffle(lista);
        // Creo la lista de listas
        List<List<String>> grupos = new ArrayList<>();
        // Añado e instancio cada lista a la lista de listas
        for (int i = 0; i < numGrupos; i++) {
            grupos.add(new ArrayList<>());            
        }


        int indiceLista = 0;
        for (String alumno : lista) {
            // inserto en la lista correspondiente;
            grupos.get(indiceLista).add(alumno);
            // incremento el número de lista
            indiceLista++;
            if (indiceLista == numGrupos)
                indiceLista = 0;
        }

        return grupos;
    }

    public static void main(String[] args) {
        List<String> alumnado = Arrays.asList(Util.readFileToStringArray("DATOS - Alumnado DAM1.txt"));
        List<List<String>> listas = repartoAlumnos(alumnado, 5);
        for (List<String> lista : listas) {
            System.out.println(lista);
        }

    }

}
