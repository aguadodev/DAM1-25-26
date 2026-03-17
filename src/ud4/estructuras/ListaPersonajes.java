package ud4.estructuras;

import java.util.Arrays;

import ud4.rol.Personaje;

public class ListaPersonajes {
    Personaje[] elementos;

    public ListaPersonajes() {
        elementos = new Personaje[0];
    }

    public boolean add(Personaje e) {
        elementos = Arrays.copyOf(elementos, elementos.length + 1);
        elementos[elementos.length - 1] = e;
        return true;
    }

    public void clear() {
        elementos = new Personaje[0];
    }

    @Override
    public String toString() {
        return Arrays.toString(elementos);
    }

    public Personaje get(int index) {
        return elementos[index];
    }

    public boolean contains(Personaje element) {
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
        ListaPersonajes lista = new ListaPersonajes();
        lista.add(new Personaje("Pepe"));
        lista.add(new Personaje("Pepe2"));
        lista.add(new Personaje("Pepe3"));
        System.out.println(lista);
        int i = 1;
        System.out.println("Elemento en la posición " + i + ": " + lista.get(i));
        if (lista.contains(new Personaje("Pepe"))) {
            System.out.println("Hay un 7 en la lista");            
            System.out.println("Está en el índice: " + lista.indexOf(new Personaje("Pepe2")));
        }
        System.out.println("Tamaño de la lista: " + lista.size());
            
        ListaPersonajes lista2 = new ListaPersonajes();
        lista2.add(new Personaje("Pepe"));
        lista2.add(new Personaje("Pepe2"));
        lista2.add(new Personaje("Pepe3"));        

        System.out.println("Listas iguales?: " + lista.equals(lista2));

        System.out.println("BORRAMOS LA LISTA");
        lista.clear();
        System.out.println(lista);
    }
}
