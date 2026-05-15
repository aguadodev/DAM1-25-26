package ud6.ficherosbinarios;

import java.io.Serializable;

import ud4.rol.Personaje;

public class Partida implements Serializable {
    
    int[][] mapa = {
        {1, 0, 1, 0, 0, 0, 0, 0, 1},
        {1, 0, 0, 1, 0, 1, 0, 0, 0},
        {1, 0, 0, 0, 0, 0, 1, 0, 1},
        {0, 1, 0, 1, 0, 1, 0, 0, 0},
        {1, 0, 1, 0, 1, 0, 1, 0, 1},
        {0, 1, 0, 0, 0, 0, 0, 0, 0},
        {1, 0, 0, 1, 1, 1, 1, 1, 1},
        {0, 1, 0, 0, 0, 0, 0, 0, 0},
    };

    int[] posInicio = {0, 1};
    int[] posFin = {7, 7};

    int[] posJugador = {0, 1};

    Personaje personaje = new Personaje("Pepe");
    
}
