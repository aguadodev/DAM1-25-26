package ud4.examen;

import java.util.Arrays;
import java.util.Comparator;

public class Equipo {
    /*
     * ATRIBUTOS
     */
    private String nombre;
    private String colorCamiseta;
    private Jugador[] jugadores;

    /*
     * CONTRUCTOR
     */
    public Equipo(String nombre, String colorCamiseta) {
        if (nombre == null || nombre.isBlank() || colorCamiseta == null || colorCamiseta.isBlank())
            throw new IllegalArgumentException("Parámetros vacíos");
        this.nombre = nombre;
        this.colorCamiseta = colorCamiseta;
        jugadores = new Jugador[0];
    }

    /*
     * GETTERS
     */
    public String getNombre() {
        return nombre;
    }

    public String getColorCamiseta() {
        return colorCamiseta;
    }

    public Jugador[] getJugadores() {
        return jugadores;
    }

    /*
    * OTROS MÉTODOS
     */      
    public boolean add(Jugador jugador) {
        if (jugador == null || jugadores.length == 4)
            return false;

        for (Jugador j : jugadores) {
            if (j.equals(jugador) || j.getDorsal() == jugador.getDorsal())
                return false;
        }

        jugadores = Arrays.copyOf(jugadores, jugadores.length + 1);
        jugadores[jugadores.length - 1] = jugador;
        return true;
    }

    /*
     * OVERRIDES
     */
    @Override
    public String toString() {
        String str = nombre;
        str += "\nColor camiseta:\n- " + colorCamiseta;
        str += "\nJugadores:\n";

        ComparaJugadorDorsal cDorsal = new ComparaJugadorDorsal();
        ComparaJugadorPosicion cPos = new ComparaJugadorPosicion();

        Arrays.sort(jugadores, cPos.thenComparing(cDorsal));

        for (Jugador jugador : jugadores) {
            str += "- " + jugador + "\n";
        }

        return str;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Equipo other = (Equipo) obj;
        Comparator ComparaJugadorDorsal = new ComparaJugadorDorsal();
        Arrays.sort(jugadores);
        Arrays.sort(other.jugadores);

        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        if (!Arrays.equals(jugadores, other.jugadores))
            return false;
        return true;
    }

}
