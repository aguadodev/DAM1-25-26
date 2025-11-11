package ud2.xxxexamen;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author Oscar
 */
public class Bombillas {
    public static String causaFinBombilla(int horas, int encendidos, int duracion) {
        if (duracion > 10 || horas <= 0 || encendidos <= 0 || duracion <= 0)
            return "ERROR";

        String resultado = "";
        if (encendidos * duracion < horas) {
            resultado = "ENCENDIDOS";
        } else if (encendidos * duracion == horas) {
            resultado = "ENCENDIDOS + HORAS";
        } else {
            resultado = "HORAS";
        }

        return resultado;
    }

    public static void main(String[] args) {
        System.out.println(causaFinBombilla(1000, 200, 10));
        System.out.println(causaFinBombilla(1000, 100, 1));
        System.out.println(causaFinBombilla(1000, 100, 10));
        System.out.println(causaFinBombilla(100, 100, 100));
        System.out.println(causaFinBombilla(100, -10, 100));
        System.out.println(causaFinBombilla(100, 100, 0));
    }

    @Test
    public void causaFinBombillaTest() {
        assertEquals("ERROR", causaFinBombilla(100, 100, 100));
        assertEquals("ERROR", causaFinBombilla(1000, -10, 10));
        assertEquals("ERROR", causaFinBombilla(0, 10, 10));
        assertEquals("ERROR", causaFinBombilla(1000, 10, 0));
        assertEquals("ENCENDIDOS", causaFinBombilla(500, 400, 1));
        assertEquals("HORAS", causaFinBombilla(1000, 10000, 1));
        assertEquals("HORAS", causaFinBombilla(1000, 200, 10));
        assertEquals("HORAS", causaFinBombilla(2000, 700, 3));
        assertEquals("ENCENDIDOS", causaFinBombilla(2000, 600, 3));
        assertEquals("ENCENDIDOS", causaFinBombilla(1000, 100, 1));
        assertEquals("ENCENDIDOS", causaFinBombilla(1000, 100, 9));
        assertEquals("ENCENDIDOS + HORAS", causaFinBombilla(1000, 100, 10));
    }

}
