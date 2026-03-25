package ud5;

import java.util.Arrays;

import ud4.rol.Personaje;

public class Util {

    static <U> int numeroDeNulos(U[] tabla) {
        int cont = 0;
        for (U e : tabla)
            if (e == null)
                cont++;
        return cont;
    }

    public static <U> U[] add(U e, U[] t) {
        t = Arrays.copyOf(t, t.length + 1);
        t[t.length - 1] = e;
        return t;
    }

    public static <U> boolean buscar(U e, U[] t) {
        for (U u : t) {
            if (u.equals(e)) {
                return true;
            }
        }
        return false;
    }

    // Método boolean
    public static <U> boolean buscar2(U e, U[] t) {
        for (U elemento : t) {
            if ((elemento == null && e == null) || (elemento != null && elemento.equals(e))) {
                return true;
            }
        }
        return false;
    }

    public static <U extends Comparable<U>> boolean buscar3(U e, U[] t) {
        Arrays.sort(t);
        if (Arrays.binarySearch(t, e) >= 0)
            return true;
        else
            return false;
    }

    public static <U> U[] concatenar(U[] t1, U[] t2) {
        U[] concatenado = Arrays.copyOf(t1, t1.length + t2.length);
        System.arraycopy(t2, 0, concatenado, t1.length, t2.length);
        return concatenado;
    }


    public static <U, V> Object[] concatenar2(U[] t1, V[] t2) {
        Object[] concatenado = new Object[t1.length + t2.length];
        int i = 0;
        for (U e : t1) {
            concatenado[i] = e;
            i++;
        }
        for (V e : t2) {
            concatenado[i] = e;
            i++;
        }        

        return concatenado;
    }



    public static void main(String[] args) {
        Integer[] enteros = { 4, 7, null, 2, 8, null, null, 10 };
        Integer[] enteros2 = { 4, 3, null};        
        System.out.println(numeroDeNulos(enteros));

        System.out.println("Antes: " + Arrays.toString(enteros));
        enteros = add(7, enteros);
        System.out.println("Después: " + Arrays.toString(enteros));

        System.out.println("Array concatenado: " + Arrays.toString(concatenar(enteros, enteros2)));


        // EJEMPLOS CON Personaje
        Personaje[] personajes = {
                null,
                new Personaje("Pepe"),
                null
        };

        Personaje[] personajes2 = {
                new Personaje("Marta")
        };        
        
        System.out.println(numeroDeNulos(personajes));
        System.out.println("Antes: " + Arrays.toString(personajes));
        personajes = add(new Personaje("Marta"), personajes);
        System.out.println("Después: " + Arrays.toString(personajes));

        System.out.println("Array concatenado: " + Arrays.toString(concatenar(personajes, personajes2)));

        System.out.println("Array concatenado: " + Arrays.toString(concatenar2(personajes, enteros)));


    }

}
