package ud5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import ud4.rol.Personaje;
import ud4.rol.Raza;

public class E1213_Sorteo {
    public static void main(String[] args) {
        Sorteo<Integer> sorteo = new Sorteo<>();
        for (int i = 1; i <= 50; i++) {
            sorteo.add(i);
        }
        Set<Integer> premiados = sorteo.premiados(5);
        System.out.println(premiados);

        // Sorteo de Personajes
        Personaje per1, per2, per3;
        per1 = new Personaje("Aragorn", Raza.HUMANO, 80, 80, 80, 10, 0, 50);
        per2 = new Personaje("Legolas", Raza.ELFO, 70, 100, 80, 10, 0, 60);
        per3 = new Personaje("Gimli", Raza.ENANO, 70, 100, 80, 10, 0, 60);
        Set<Personaje> personajes = new HashSet<>();
        personajes.add(per1);
        personajes.add(per2);
        personajes.add(per3);


        Sorteo<Personaje> sorteoPersonajes = new Sorteo<>();
        sorteoPersonajes.addAll(personajes);
        
        Set<Personaje> elegidos = sorteoPersonajes.premiados(2);
        System.out.println(elegidos);


    }
}
