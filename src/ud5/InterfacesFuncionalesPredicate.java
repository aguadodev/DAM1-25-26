package ud5;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;

public class InterfacesFuncionalesPredicate {

    public static void main(String[] args) {

        Predicate<Integer> esPositivo = x -> x > 0;

        System.out.println(esPositivo.test(6)); // true;

        System.out.println(esPositivo.test(0)); // false;

        Predicate<Integer> esNoPositivo = esPositivo.negate();

        System.out.println(esNoPositivo.test(6)); // false

        Predicate<Integer> esPar = x -> x % 2 == 0;

        System.out.println(esPar.test(6)); // true;

        System.out.println(esPar.test(5)); // false;

        Predicate<Integer> esPositivoYPar = esPositivo.and(esPar);

        System.out.println(esPositivoYPar.test(6)); // true;
        
        System.out.println(esPositivoYPar.test(-6)); // false;

        System.out.println(esPositivoYPar.test(5)); // false;    
        
        Predicate<Integer> esPositivoOPar = esPositivo.or(esPar);
        
        System.out.println(esPositivoOPar.test(6)); // true;
        
        System.out.println(esPositivoOPar.test(-6)); // true;

        System.out.println(esPositivoOPar.test(5)); // true;  

        System.out.println(esPositivoOPar.test(-5)); // false;
        
        Predicate<Integer> esPositivoParYMultiploDe3 = x -> (x > 0) && (x % 2 == 0) && (x % 3 == 0);

        System.out.println(esPositivoParYMultiploDe3.test(6));


        List<Cliente> clientes = new LinkedList<>();

        Cliente cliente = new Cliente("111", "Pepe", "01/01/2000");
        clientes.add(cliente);
        clientes.add(new Cliente("222", "Marta", "02/02/2012"));
        clientes.add(new Cliente("333", "Juan", "03/03/2009"));
        clientes.add(new Cliente("444", "Lola", "04/04/2004"));

        Predicate<Cliente> esMayorEdad = c -> c.getEdad() >= 18;
        clientes.removeIf(esMayorEdad.negate());

        System.out.println(clientes);


    }
}
