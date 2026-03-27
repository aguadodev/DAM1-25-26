
package ud5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Araujo
 */
public class E1209 {
    public static void main(String[] args) {
        List<Integer> listaEnteros = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println(
                "Escribe numeros positivos para añdir a las lista (Un numero negativo para dejar de añadir numeros): ");
        int n = sc.nextInt();
        while (n != -1) {
            listaEnteros.add(n);
            n = sc.nextInt();
        }
        sc.close();
        for (int i = 0; i < listaEnteros.size(); i++) {
            if (listaEnteros.get(i) % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}