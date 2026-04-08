package ud5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class E1210 {
    public static void main(String[] args) {
        Random rnd = new Random(7);
        List<Integer> lista = new ArrayList<>();
        for (int i = 0; i < 12; i++) 
            lista.add(rnd.nextInt(10) + 1);

        System.out.println("Lista con elementos repetidos: " + lista);

        // Elementos sin incluir repeticiones
        Set<Integer> conjunto = new LinkedHashSet<>(lista);
        System.out.println("Elementos Únicos: " + conjunto);

        // 
        Set<Integer> losQueSeRepiten = new LinkedHashSet<>();
        Set<Integer> losQueNoSeRepiten = new LinkedHashSet<>();
        
        for (Integer n : conjunto) {
            if (lista.indexOf(n) == lista.lastIndexOf(n))
                losQueNoSeRepiten.add(n);
            else 
                losQueSeRepiten.add(n);
        }

        /* OTRO MÉTODO
        for (Integer i : conjunto) {
            lista.remove(i);    
        }
        System.out.println("ListaAuxiliar: " + lista);

        losQueSeRepiten.addAll(lista);
        losQueNoSeRepiten = conjunto;
        losQueNoSeRepiten.removeAll(losQueSeRepiten);
        */


        System.out.println("Repetidos en la lista: " + losQueSeRepiten);
        System.out.println("NO repetidos en la lista: " + losQueNoSeRepiten);
    
    }
}
