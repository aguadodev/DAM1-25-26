package ud5.examen;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class MaximoSegunCondicion {
    static <T> T maximoSegunCondicion(Collection<T> c, Comparator<T> comp, Predicate<T> p) {
        if (c == null || comp == null || p == null)
            return null;

        Collection<T> clon = new ArrayList<>(c);
        clon.removeIf(p.negate());
        if (clon.isEmpty())
            throw new IllegalArgumentException("Ningún elemento cumple el predicado");
        else
            return Collections.max(clon,comp);
    }

    public static void main(String[] args) {
        List<LocalDate> listaFechas = new ArrayList<>();
        listaFechas.add(LocalDate.of(2026, 04, 26));
        listaFechas.add(LocalDate.of(2026, 05, 06));
        listaFechas.add(LocalDate.of(2026, 02, 06));
        listaFechas.add(LocalDate.of(2026, 04, 06));
        listaFechas.add(LocalDate.of(2026, 05, 26));

        LocalDate fechaRes = maximoSegunCondicion(listaFechas, Comparator.naturalOrder(), fecha -> fecha.isBefore(LocalDate.now()));

        System.out.println(fechaRes);
    }
}
