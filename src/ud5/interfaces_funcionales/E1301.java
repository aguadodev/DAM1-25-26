package ud5.interfaces_funcionales;

import java.util.ArrayList;
import java.util.List;

public class E1301 {
    public static void main(String[] args) {
        Saludo<String> saludoNombres = o -> "Hola " + o;

        System.out.println(saludoNombres.saludar("Pepe"));
        System.out.println(saludoNombres.saludar("Marta"));

        Cliente cliente = new Cliente("111", "Pepe", "01/01/2000");
        Saludo<Cliente> saludoCliente = c -> "Estimado/a " + c.getNombre();
        System.out.println(saludoCliente.saludar(cliente));
    }

}
