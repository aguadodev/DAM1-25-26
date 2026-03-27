package ud5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import ud2.Util;

public class E1209b {
    public static void main(String[] args) {
        Random rm = new Random();
        List<Integer> listaInt = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            listaInt.add(rm.nextInt(1000) + 1);
        }

        List<Integer> listaPrimos = new LinkedList<>();
        for (int i = 0; i < listaInt.size(); i++) {
            Integer num = listaInt.get(i);

            if (Util.esPrimo(num)) {
                System.out.println(i + " - " + num);
                listaPrimos.add(num);
            }
        }

        Comparator<Integer> orden = Comparator.naturalOrder();
        listaPrimos.sort(orden);
        System.out.println("Primos: " + listaPrimos);

    }
}
