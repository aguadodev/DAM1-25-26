package ud4.examen;

import java.util.Comparator;

public class ComparaJugadorDorsal implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Jugador j1 = (Jugador) o1;
        Jugador j2 = (Jugador) o2;
        return j1.getDorsal() - j2.getDorsal();
    }

}
