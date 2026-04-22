package ud5.colecciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

import ud5.interfaces_funcionales.Cliente;

public class ColeccionesGlobal {
    public static void main(String[] args) {
        Collection<Cliente> clientes = new HashSet<>();

        Cliente cliente = new Cliente("111", "Pepe", "01/01/2000");
        clientes.add(cliente);
        clientes.add(new Cliente("222", "Marta", "02/02/2002"));
        clientes.add(new Cliente("333", "Juan", "03/03/2003"));
        clientes.add(cliente);

        // IMPRIME LA COLECCION
        System.out.println(clientes); // toString()


        Collection<Cliente> clientes2 = new HashSet<>();
        clientes2.add(new Cliente("222", "Marta", "02/02/2002"));
        clientes2.add(new Cliente("333", "Juan", "03/03/2003"));
        clientes2.add(new Cliente("444", "Lola", "04/04/2004"));
        System.out.println(clientes.containsAll(clientes2));  
    

        clientes.addAll(clientes2);
        System.out.println(clientes.size()); 
        
        //Object[] cArray = clientes.toArray();
        Cliente[] cArray = clientes.toArray(new Cliente[0]);
        System.out.println(Arrays.toString(cArray));

        Collection<Cliente> listaOtraVez = Arrays.asList(cArray);

        clientes.removeAll(clientes2);
        System.out.println(clientes);
    }
}
