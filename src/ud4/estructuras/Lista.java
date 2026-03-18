package ud4.estructuras;

import java.util.Arrays;

import ud4.clases.Persona;
import ud4.rol.Personaje;

public class Lista {
    Object[] elementos;

    public Lista() {
        elementos = new Object[0];
    }

    public boolean add(Object e) {
        elementos = Arrays.copyOf(elementos, elementos.length + 1);
        elementos[elementos.length - 1] = e;
        return true;
    }

    public void clear() {
        elementos = new Object[0];
    }

    @Override
    public String toString() {
        return Arrays.toString(elementos);
    }

    public Object get(int index) {
        return elementos[index];
    }

    public boolean contains(Object element) {
        for (int i = 0; i < elementos.length; i++) {
            if (elementos[i] == element) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(Object o) {
        for (int i = 0; i < elementos.length; i++) {
            if (elementos[i].equals(o))
                return i;
        }
        return -1;
    }

    public int size() {
        return elementos.length;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Lista other = (Lista) obj;
        if (!Arrays.equals(elementos, other.elementos))
            return false;
        return true;
    }

    public static void main(String[] args) {
        Lista lista2 = new Lista();
        lista2.add(new Persona());

        Lista lista3 = new Lista();
        lista3.add(new Personaje("Pepe"));        

        Lista lista = new Lista();
        lista.add(5);
        lista.add(7);
        lista.add(3);
        System.out.println(lista);
        int i = 1;
        System.out.println("Elemento en la posición " + i + ": " + lista.get(i));
        if (lista.contains(7)) {
            System.out.println("Hay un 7 en la lista");            
            System.out.println("Está en el índice: " + lista.indexOf(7));
        }
        System.out.println("Tamaño de la lista: " + lista.size());
            
        Lista lista2 = new Lista();
        lista2.add(5);
        lista2.add(7);
        lista2.add(3);        

        System.out.println("Listas iguales?: " + lista.equals(lista2));

        System.out.println("BORRAMOS LA LISTA");
        lista.clear();
        System.out.println(lista);
    }
}
