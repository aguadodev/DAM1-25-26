package ud5;

import java.util.Arrays;
import ud4.rol.Personaje;

public class ContenedorLista<T extends Comparable<T>> implements Pila<T>, Cola<T> {
    private T[] elementos;

    public ContenedorLista(T[] t) {
        elementos = t;
    }

    void insertarAlFinal(T nuevo) {
        elementos = Arrays.copyOf(elementos, elementos.length + 1);
        elementos[elementos.length - 1] = nuevo;
    }

    T extraerDelPrincipio() {
        T e = null;
        if (elementos.length > 0) {
            e = elementos[0];
            elementos = Arrays.copyOfRange(elementos, 1, elementos.length);
        }
        return e;
    }

    private T extraerDelFinal() {
        T e = null;
        if (elementos.length > 0) {
            e = elementos[elementos.length - 1];
            elementos = Arrays.copyOf(elementos, elementos.length - 1);
        }
        return e;
    }

    void ordenar() {
        Arrays.sort(elementos);
    }

    @Override
    public String toString() {
        return Arrays.toString(elementos);
    }

    @Override
    public void apilar(T e) {
        insertarAlFinal(e);
    }

    @Override
    public T desapilar() {
        return extraerDelFinal();
    }


    @Override
    public void encolar(T e) {
        insertarAlFinal(e);
    }

    @Override
    public T desencolar() {
        return extraerDelPrincipio();
    }    

    public static void main(String[] args) {
        ContenedorLista<Integer> lista = new ContenedorLista<>(new Integer[0]);
        lista.insertarAlFinal(7);
        lista.insertarAlFinal(9);
        System.out.println(lista);

        ContenedorLista<Personaje> listaP = new ContenedorLista<>(new Personaje[0]);
        listaP.insertarAlFinal(new Personaje("Pepe"));
        listaP.insertarAlFinal(new Personaje("Marta"));
        listaP.ordenar();
        System.out.println(listaP);
        Personaje p = listaP.extraerDelPrincipio();
        System.out.println(p); // Pepe
        p = listaP.extraerDelPrincipio();
        System.out.println(p); // Marta
        p = listaP.extraerDelPrincipio();
        System.out.println(p); // null


        // PILAS
        System.out.println("PILAS");
        Pila<Integer> pila = new ContenedorLista<>(new Integer[0]);
        for (int i = 0; i < 10; i++) {
            pila.apilar(i);
        }
        Integer e = pila.desapilar();
        while (e != null) {
            System.out.println(e);
            e = pila.desapilar();
        }


        // PILAS
        System.out.println("COLAS");
        Cola<Integer> cola = new ContenedorLista<>(new Integer[0]);
        for (int i = 0; i < 10; i++) {
            cola.encolar(i);
        }
        e = cola.desencolar();
        while (e != null) {
            System.out.println(e);
            e = cola.desencolar();
        }



    }




}
