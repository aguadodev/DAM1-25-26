package ud5.colecciones;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import ud5.Cliente;

public class Listas {
    public static void main(String[] args) {
        List<Cliente> clientes = new LinkedList<>();

        Cliente cliente = new Cliente("111", "Pepe", "01/01/2000");
        clientes.add(cliente);
        clientes.add(new Cliente("222", "Marta", "02/02/2002"));
        clientes.add(new Cliente("333", "Juan", "03/03/2003"));
        clientes.add(cliente);

        // IMPRIME LA LISTA
        System.out.println(clientes); // toString()

        System.out.println(clientes.get(1)); // "Marta"

        System.out.println(clientes.set(0, new Cliente("444"))); // Pepe

        clientes.add(0, new Cliente("555"));


        List<Cliente> clientes2 = new ArrayList<>();
        clientes2.add(new Cliente("222", "Marta", "02/02/2002"));
        clientes2.add(new Cliente("333", "Juan", "03/03/2003"));
        clientes2.add(new Cliente("444", "Lola", "04/04/2004"));

        clientes.addAll(3, clientes2);

        System.out.println(clientes.remove(1));

        System.out.println("Primera ocurrencia de DNI=333: " + clientes.indexOf(new Cliente("333")));
        System.out.println("Primera ocurrencia de DNI=333: " + clientes.lastIndexOf(new Cliente("333")));


        // ORDENAR
        Comparator<Cliente> ordenNatural = Comparator.naturalOrder();
        Comparator<Cliente> ordenNombre = new Comparator<>() {
            @Override
            public int compare(Cliente o1, Cliente o2) {
                if (o1.getNombre() == null || o2.getNombre() == null)
                    return 0;
                return o2.getNombre().compareTo(o1.getNombre());
            }
            
        };

        clientes.sort(ordenNombre);
        System.out.println(clientes);
        
        Scanner sc = new Scanner(System.in);
        System.out.print("DNI a buscar: ");
        String dni = sc.nextLine();
        Cliente clienteAux = new Cliente(dni);
        if (clientes.contains(clienteAux)) {
            if (clientes.indexOf(clienteAux) != clientes.lastIndexOf(clienteAux))
                System.out.println("El cliente está repetido");
            else 
                System.out.println("El cliente aparece una sola vez");
        }

        clientes.reversed();
        List<Cliente> sublista = clientes.subList(3, 6);
    
        List<Cliente> clientes3 = new ArrayList<>();
        clientes3.add(new Cliente("222", "Marta", "02/02/2002"));
        clientes3.add(new Cliente("444", "Lola", "04/04/2004"));        
        clientes3.add(new Cliente("333", "Juan", "03/03/2003"));


        System.out.println("clientes2.equals(clientes3)? " + clientes2.equals(clientes3));

        System.out.println("Fin programa");
    }
}
