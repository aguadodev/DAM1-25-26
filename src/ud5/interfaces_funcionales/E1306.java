package ud5.interfaces_funcionales;

import java.util.function.Consumer;

public class E1306 {

    static <T> void paraCada(T[] t, Consumer<T> c) {
        for (T e : t) {
            c.accept(e);
        }
    }


    public static void main(String[] args) {
        Cliente[] clientes = {
            new Cliente("111", "Pepe", "01/01/2000"),
            new Cliente("222", "Marta", "02/02/2012"),
            new Cliente("333", "Juan", "03/03/2009"),
            new Cliente("444", "Lola", "04/04/2004")
        };

        Consumer<Cliente> accion = c -> System.out.println(c.nombre + " (" + c.getEdad() + ")");

        paraCada(clientes, accion);

    }

}
