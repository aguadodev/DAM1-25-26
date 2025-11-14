package ud2.xxxexamen;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

/**
 * @author Óscar
 */
public class MinutosTranscurridos {
    static int minutosTranscurridos(int horaA, int minutoA, int horaB, int minutoB) {
        if (horaA < 0 || horaA > 23 || minutoA < 0 || minutoA > 59 || 
            horaB < 0 || horaB > 23 || minutoB < 0 || minutoB > 59)
            return -1;

        // Cálculos
        return Math.abs(horaA * 60 + minutoA - (horaB * 60 + minutoB));
    }

    @Test
    public void testMinutosTranscurridos() {
        assertEquals(-1, minutosTranscurridos(24, 10, 10, 20));
        assertEquals(-1, minutosTranscurridos(10, 60, 10, 20));
        assertEquals(-1, minutosTranscurridos(10, 10, 24, 20));
        assertEquals(-1, minutosTranscurridos(10, 10, 10, 60));
        assertEquals(190, minutosTranscurridos(13, 20, 10, 10));
        assertEquals(170, minutosTranscurridos(13, 10, 10, 20));
        assertEquals(190, minutosTranscurridos(10, 10, 13, 20));
        assertEquals(170, minutosTranscurridos(10, 20, 13, 10));
        assertEquals(70, minutosTranscurridos(11, 20, 10, 10));
        assertEquals(50, minutosTranscurridos(11, 10, 10, 20));
        assertEquals(70, minutosTranscurridos(10, 10, 11, 20));
        assertEquals(50, minutosTranscurridos(10, 20, 11, 10));
        assertEquals(0, minutosTranscurridos(10, 10, 10, 10));
        assertEquals(10, minutosTranscurridos(10, 20, 10, 10));
        assertEquals(10, minutosTranscurridos(10, 10, 10, 20));


        assert minutosTranscurridos(10, 30, 11, 0) == 3;
        assert minutosTranscurridos(12, 0, 12, 0) == 0;
        assert minutosTranscurridos(5, 15, 4, 45) == 30;
        assert minutosTranscurridos(25, 0, 10, 0) == -1; // Invalid hour
        assert minutosTranscurridos(10, 60, 11, 0) == -1; // Invalid minute
    }

    static int minutosTranscurridos2(int horaA, int minutoA, int horaB, int minutoB) {
        if (horaA < 0 || horaA > 23 || minutoA < 0 || minutoA > 59 || 
            horaB < 0 || horaB > 23 || minutoB < 0 || minutoB > 59)
            return -1;

        int minutosTranscurridos = 0;
        // Cálculos
        if (horaA > horaB) {
            minutosTranscurridos += (horaA - horaB) * 60;
            minutosTranscurridos += (minutoA - minutoB);
        } else if (horaB > horaA) {
            minutosTranscurridos += (horaB - horaA) * 60;
            minutosTranscurridos += (minutoB - minutoA);
        } else {
            if (minutoA > minutoB) {
                minutosTranscurridos = minutoA - minutoB;
            } else {
                minutosTranscurridos = minutoB - minutoA;
            }
        }

        return minutosTranscurridos;
    }


}
