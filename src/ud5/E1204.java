package ud5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class E1204 {
    /**
     * 
     * @author darío quintillan
     */
    public static void main(String[] args) {
        List<Integer> listaInts = new ArrayList<>();
        Collection<Integer> coleccionInt = listaInts;
        System.out.println("Introduce numeros enteros (-1 para parar)");
        Scanner sc = new Scanner(System.in);
        int n = 0;
        do {
            System.out.println("Siguiente numero: ");
            n = sc.nextInt();
            if (n >= 0) {
                coleccionInt.add(n);
            }
        } while (n >= 0);
        sc.close();

        System.out.println(coleccionInt);

        System.out.print("Números pares: ");
        for (Integer i : coleccionInt) {
            if (i % 2 == 0)
                System.out.print(i + " ");
        }
        System.out.println();

        System.out.print("Borramos múltiplos de 3: ");       
        Iterator<Integer> it = coleccionInt.iterator();
        while (it.hasNext()) {
            Integer p = it.next();
            if (p % 3 == 0) {
                it.remove();
            }
        }
        System.out.println(coleccionInt);
    }

}
