package ud4.examen;

import java.time.LocalDate;
import java.util.Arrays;

public class Jugador extends Persona {
    /*
    * ATRIBUTOS
    */
    private int dorsal;
    private Posicion posicion;

    /*
    * CONTRUCTOR
     */    
    public Jugador(String dni, String nombre, LocalDate fechaNacimiento, int dorsal, Posicion posicion) {
        super(dni, nombre, fechaNacimiento);
        if (dorsal < 1 || dorsal > 99 || posicion == null)
            throw new IllegalArgumentException("Dorsal o posición incorrectos");        
        this.dorsal = dorsal;
        this.posicion = posicion;
    }

    /*
    * GETTERS
     */    
    public int getDorsal() {
        return dorsal;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    /*
    * OVERRIDES
     */
    @Override
    public String toString() {
        return dorsal + ". " + getNombre() + " (" + posicion + ", " + getEdad() + ")";
    }

    static void sort(Jugador[] jugadores) {
        Arrays.sort(jugadores, new ComparaJugadorDorsal());
    }



    

}
