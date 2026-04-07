package ud5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Conjuntos {
    public static void main(String[] args) {

        Set<Cliente> clientes = new LinkedHashSet<>();

        Cliente cliente = new Cliente("111", "Pepe", "01/01/2000");
        clientes.add(new Cliente("222", "Marta", "02/02/2002"));
        clientes.add(new Cliente("333", "Juan", "03/03/2003"));
        clientes.add(new Cliente("444", "Lola", "04/04/2003"));        
        clientes.add(cliente);
        clientes.add(cliente);

        for (Cliente c : clientes) {
            System.out.println(c);
        }

        Comparator<Cliente> compEdad = new Comparator<>() {
            @Override
            public int compare(Cliente o1, Cliente o2) {
                return o1.getEdad() - o2.getEdad();
            }  
        };

        Set<Cliente> clientesPorEdad = new TreeSet<>(compEdad.thenComparing(Comparator.naturalOrder()));
        clientesPorEdad.addAll(clientes);
        System.out.println("Ordenados por Edad");
        for (Cliente c : clientesPorEdad) {
            System.out.println(c);
        }        

        // Opción 2: Usando lista auxiliar
        List<Cliente> listaAux = new ArrayList<>(clientes);
        listaAux.sort(compEdad);

        Set<Cliente> clientesPorEdad2 = new LinkedHashSet<>(listaAux);
        System.out.println("Ordenados por Edad2");
        for (Cliente c : clientesPorEdad2) {
            System.out.println(c);
        }





        /*
         * Set<Cliente> clientes2 = new HashSet<>();
         * clientes2.add(new Cliente("222", "Marta", "02/02/2002"));
         * clientes2.add(new Cliente("333", "Juan", "03/03/2003"));
         * clientes2.add(new Cliente("444", "Lola", "04/04/2004"));
         */

    }
}
