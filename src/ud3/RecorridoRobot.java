package ud3;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class RecorridoRobot {

    static boolean recorridoRobot(String[] mapa, String instrucciones) {
        char direccion = 'W';
        int fila = 0;
        int columna = 0;

        // Buscar posición inicial 'A'
        for (int i = 0; i < mapa.length; i++) {
            int posicionA = mapa[i].indexOf('A');
            if (posicionA != -1) {
                fila = i;
                columna = posicionA;
            }
        }

        for (int i = 0; i < instrucciones.length(); i++) {
            switch (instrucciones.charAt(i)) {
                case 'A':
                    switch (direccion) {
                        case 'W': fila--; 
                                  if (fila < 0) return false; // Se salió del mapa
                                  break;
                        case 'S': fila++;
                                  if (fila > mapa.length - 1) return false; // Se salió del mapa
                                  break;                        
                        case 'A': columna--; 
                                  if (columna < 0) return false; // Se salió del mapa
                                  break;
                        case 'D': columna++; 
                                  if (columna > mapa[fila].length() - 1) return false; // Se salió del mapa
                                  break;
                    }
                    if (mapa[fila].charAt(columna) == '*')
                            return false; // Pisó una mina
                    break;
                case 'L':
                    switch (direccion) {
                        case 'W': direccion = 'A'; break;
                        case 'S': direccion = 'D'; break;
                        case 'A': direccion = 'S'; break;
                        case 'D': direccion = 'W'; break;
                    }                    
                    break;
                case 'R':
                    switch (direccion) {
                        case 'W': direccion = 'D'; break;
                        case 'S': direccion = 'A'; break;
                        case 'A': direccion = 'W'; break;
                        case 'D': direccion = 'S'; break;
                    }                                        
                    break;
            }
        } // for

        return mapa[fila].charAt(columna) == 'Z';
    }

    @Test
    void recorridoRobotTest() {
        String[] mapa = {
                "  Z       ",
                " *        ",
                "  *  *    ",
                "          ",
                " A        "
        };        
        assertTrue(recorridoRobot(mapa, "AALARAARAA"));
        assertTrue(recorridoRobot(mapa, "RAALAAAALA"));
        assertFalse(recorridoRobot(mapa, "ARALA"));
        assertFalse(recorridoRobot(mapa, "LAA"));
    }    
}
