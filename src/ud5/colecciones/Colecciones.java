package ud5.colecciones;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

import ud5.interfaces_funcionales.Cliente;

public class Colecciones {
    public static void main(String[] args) {
        Collection<Cliente> clientes = new ArrayList<>();

        Cliente cliente = new Cliente("111", "Pepe", "01/01/2000");
        clientes.add(cliente);
        clientes.add(new Cliente("222", "Marta", "02/02/2002"));
        clientes.add(new Cliente("222", "Marta", "02/02/2002"));
        clientes.add(cliente);

        // IMPRIME LA COLECCION
        System.out.println(clientes); // toString()
        System.out.println("Listado de clientes: "); // for-each
        int i = 1;
        for (Cliente c : clientes) {
            System.out.println(i + ". " + c);
            /*
             * if (c.fechaNacimiento.getYear() == 2000)
             * clientes.remove(c); // Error! No se pueden eliminar elementos de la colección
             * que estoy recorriendo
             */
            i++;
        }

        // Iterator
        System.out.println("Listado de clientes (con Iterator): ");
        i = 1;
        Iterator<Cliente> itCliente = clientes.iterator();
        while (itCliente.hasNext()) {
            Cliente c = itCliente.next();
            System.out.println(i + ". " + c);
            if (c.getFechaNacimiento().getYear() == 2000)
                itCliente.remove();
            i++;
        }

        System.out.println(clientes.remove(cliente));
        System.out.println(clientes);
        System.out.println(clientes.remove(cliente));
        System.out.println(clientes);
        System.out.println(clientes.remove(cliente));
        System.out.println(clientes);
        System.out.println(clientes.size());

        System.out.println("CONTAINS: ");
        System.out.println(clientes.contains(cliente)); // false
        System.out.println(clientes.contains(new Cliente("222"))); // true

        Cliente clienteParaBorrar = new Cliente("222");
        System.out.println(clientes.remove(clienteParaBorrar));
        System.out.println(clientes);
        System.out.println(clientes.remove(new Cliente("222")));
        System.out.println(clientes);
        System.out.println(clientes.remove(new Cliente("222")));
        System.out.println(clientes);
        System.out.println(clientes.size());

    }
}
