package ud5;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import ud3.strings.Util;


public class E1302 {
    public static void main(String[] args) {
        List<Cliente> clientes = new LinkedList<>();

        Cliente cliente = new Cliente("111", "Pepe", "01/01/2000");
        clientes.add(cliente);
        clientes.add(new Cliente("222", "Marta", "02/02/2002"));
        clientes.add(new Cliente("333", "Juan", "03/03/2003"));
        clientes.add(new Cliente("444", "Lola", "04/04/2004"));

        List<String> saludos = Saludo.saludarGrupo(clientes, c -> "Estimado/a " + c.getNombre());      

        for (String saludo : saludos) {
            System.out.println(saludo);
        }

        List<String> alumnado = Arrays.asList(Util.readFileToStringArray("DATOS - Alumnado DAM1.txt"));
        for (String saludo : Saludo.saludarGrupo(alumnado, a -> "Qué pasa " + a +  "?")) {
            System.out.println(saludo);
        }        

    }

}
