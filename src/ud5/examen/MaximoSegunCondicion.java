package ud5.examen;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
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
}
