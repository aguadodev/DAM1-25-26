package ud4.estructuras;

import java.util.Arrays;

public class Lista {
    Integer[] elementos;


    public Lista() {
        elementos = new Integer[0];
    }

    public boolean add(Integer e) {
        elementos = Arrays.copyOf(elementos, elementos.length + 1);
        elementos[elementos.length - 1] = e;
        return true;
    }

    public void clear() {
        elementos = new Integer[0];
    }

    @Override
    public String toString() {
        return Arrays.toString(elementos);
    }

    public Integer get(int index) {
        return elementos[index];
    }

    public static void main(String[] args) {
        Lista lista = new Lista();
        lista.add(5);
        lista.add(7);
        lista.add(3);
        System.out.println(lista);
        int i = 1;
        System.out.println("Elemento en la posición " + i + ": " + lista.get(i));
        lista.clear();
        System.out.println(lista);
        System.out.println("Elemento en la posición " + i + ": ");
        System.out.println(lista.get(i));
        

    }
}
