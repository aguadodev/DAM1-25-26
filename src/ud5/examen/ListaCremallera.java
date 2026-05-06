package ud5.examen;

import java.util.ArrayList;
import java.util.List;

public class ListaCremallera {
    static <T> List<T> listaCremallera(List<T> l1, List<T> l2) {
        // Si las dos listas son null
        if (l1 == null && l2 == null)
            return null;

        // Si una de las listas es null
        if (l1 == null)
            return new ArrayList<>(l2);
        if (l2 == null)
            return new ArrayList<>(l1);

        // Si ninguna lista es null
        List<T> listaCremallera = new ArrayList<>();     
        int maxSize = Math.max(l1.size(), l2.size());
        for (int i = 0; i < maxSize; i++) {
            if (i < l1.size())
                listaCremallera.add(l1.get(i));
            if (i < l2.size())
                listaCremallera.add(l2.get(i));
        }
        return listaCremallera;
    }
}
