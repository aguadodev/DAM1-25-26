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

        System.out.println(lista);

        // Elementos sin incluir repeticiones
        Set<Integer> conjunto = new LinkedHashSet<>(lista);
        System.out.println(conjunto);

        // 
        Set<Integer> losQueSeRepiten = new LinkedHashSet<>();
        Set<Integer> losQueNoSeRepiten = new LinkedHashSet<>();
        for (Integer n : conjunto) {
            if (lista.indexOf(n) == lista.lastIndexOf(n))
                losQueNoSeRepiten.add(n);
            else 
                losQueSeRepiten.add(n);
        }

        System.out.println(losQueSeRepiten);
        System.out.println(losQueNoSeRepiten);
    
    }
}
