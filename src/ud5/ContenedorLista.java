package ud5;

import java.util.Arrays;

public class ContenedorLista<T> {
    private T[] elementos;

    public ContenedorLista(T[] t) {
        elementos = t;
    }

    @Override
    public String toString() {
        return Arrays.toString(elementos);
    }

    

public static void main(String[] args) {
    ContenedorLista<Integer> lista = new ContenedorLista<>(new Integer[0]);

    System.out.println(lista);
}    
    
}
