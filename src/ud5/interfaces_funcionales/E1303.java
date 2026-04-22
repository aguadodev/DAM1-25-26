package ud5.interfaces_funcionales;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import ud3.strings.Util;

public class E1303 {
    public static void main(String[] args) {
        List<String> alumnado = Arrays.asList(Util.readFileToStringArray("DATOS - Alumnado DAM1.txt"));
        String maximo = max(alumnado, Comparator.reverseOrder());
        System.out.println(maximo);

        
        List<Cliente> clientes = new LinkedList<>();

        Cliente cliente = new Cliente("111", "Pepe", "01/01/2000");
        clientes.add(cliente);
        clientes.add(new Cliente("222", "Marta", "02/02/2002"));
        clientes.add(new Cliente("333", "Juan", "03/03/2003"));
        clientes.add(new Cliente("444", "Lola", "04/04/2004"));        

        System.out.println(max(clientes, (c1, c2) -> c1.getEdad() - c2.getEdad()));
        System.out.println(max(clientes, (c1, c2) -> c2.getNombre().compareTo(c1.getNombre())));




    }

    static <T> T max(List<T> lista, Comparator<T> comparador) {
        T max = lista.getFirst();
        for (T t : lista) {
            if (comparador.compare(t, max) > 0)
                max = t;
        }
        return max;
    }

}
