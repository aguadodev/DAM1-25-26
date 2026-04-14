package ud5.colecciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import ud3.strings.Util;

public class E1216_RAE {
    public static void main(String[] args) {
        // Cargar fichero
        String[] lineas = Util.readFileToStringArray("DATOS - Académicos RAE (2025_04_11).txt");
        
        // Crear Mapa
        Map<Character, Academico> mapaAcademia = new LinkedHashMap<>();
        // Recorrer y analizar lineas
        for (String linea : lineas) {
            // Crear academicos y entradas del mapa
            Character letra = linea.charAt(6);
            int posAux = linea.indexOf("(");
            String nombre = linea.substring(7, posAux);
            int anhoIngreso = Integer.parseInt(linea.substring(posAux + 1, linea.indexOf(")")));
            Academico academico = new Academico(nombre, anhoIngreso);
            mapaAcademia.put(letra, academico);
        }
        
        // Listados:
        // 1. sin letra, por orden de nombre
        System.out.println("Académicos ordenados por nombre:");
        Set<Academico> listaNombres = new TreeSet<>(mapaAcademia.values());
        System.out.println(listaNombres);

        // 2. sin letra, por orden de año de ingreso y en caso de empate por nombre
        System.out.println("\nAcadémicos ordenados por año de ingreso y nombre:");
        Comparator<Academico> compAnhoNombre = new Comparator<>() {
            @Override
            public int compare(Academico o1, Academico o2) {
                int res = o1.anhoIngreso - o2.anhoIngreso;
                if (res == 0) {
                    return o1.nombre.compareTo(o2.nombre);
                }
                return res;
            }            
        };

        List<Academico> listaAnhoNombre = new ArrayList<>(mapaAcademia.values());
        listaAnhoNombre.sort(compAnhoNombre);
        // @TODO: Listar año y academicos de ese año
        for (Academico a : listaAnhoNombre) {
            System.out.println(a.anhoIngreso + " - " + a.nombre);
        }

        // 3. con letra, por orden de letra (clave), indicando nombre y fecha de ingreso.
        System.out.println("\nAcadémicos ordenados por letra, indicando nombre y año de ingreso");
        Set<Character> letras = new TreeSet<>(mapaAcademia.keySet());
        for (Character letra : letras) {
            System.out.println(letra + " - " + mapaAcademia.get(letra));
        }


    }


}

class Academico implements Comparable<Academico>{
    String nombre;
    int anhoIngreso;

    public Academico(String nombre, int anhoIngreso) {
        this.nombre = nombre;
        this.anhoIngreso = anhoIngreso;
    }

    @Override
    public String toString() {
        return nombre + " (" + anhoIngreso + ")";
    }

    @Override
    public int compareTo(Academico o) {
        return nombre.compareTo(o.nombre);
    }

    
    
}