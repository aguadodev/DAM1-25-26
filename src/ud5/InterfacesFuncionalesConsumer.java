package ud5;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Consumer;

public class InterfacesFuncionalesConsumer {
    public static void main(String[] args) {

        Set<Cliente> clientes = new TreeSet<>();

        Cliente cliente = new Cliente("111", "Pepe", "01/01/2000");
        clientes.add(cliente);
        clientes.add(new Cliente("222", "Marta", "02/02/2012"));
        clientes.add(new Cliente("333", "Juan", "03/03/2009"));
        clientes.add(new Cliente("444", "Lola", "04/04/2004"));
        

        Consumer<Cliente> saludo = c -> System.out.println("Hola " + c.nombre);

        saludo.accept(cliente);

        clientes.forEach(saludo);

    }
}
