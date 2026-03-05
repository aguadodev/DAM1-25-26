package ud4.rol;

import java.util.Arrays;
import java.util.Comparator;

public class AppCombateGrupos {
    public static void main(String[] args) {
        
        Personaje[] equipoA = {
            new Personaje("A-1"),
            new Personaje("A-2"),
            new Personaje("A-3"),
        };

        Comparator<Personaje> comparadorPV = new Comparator<>() {
            @Override
            public int compare(Personaje o1, Personaje o2) {
                return o1.getPv() - o2.getPv();
            }
        };

        Arrays.sort(equipoA, comparadorPV.reversed());

        for (Personaje personaje : equipoA) {
            System.out.println(personaje);
        }

    }
}
