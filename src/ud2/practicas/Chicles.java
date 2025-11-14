package ud2.practicas;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * @author Eusebio Moreira Dominguez
 */

public class Chicles {
    public static void main(String[] args) {
        System.out.println(totalChicles(25, 5, 1));
        System.out.println(totalChicles(5, 5, 1));
        System.out.println(totalChicles(100, 10, 1));
        System.out.println(totalChicles(100, 0, 0));
        System.out.println(totalChicles(20, 2, 5));
        System.out.println(totalChicles(10, -1, 0));
    }

    public static int totalChicles(int chicles, int oferta, int cgratis) {

        if (chicles < 0 || oferta < 0 || cgratis < 0 || cgratis >= oferta) {
            return -1;
        }

        if (oferta == 0)
            return chicles;

        int envoltorios = chicles;
        int chiclesTotales = chicles;

        while (envoltorios / oferta > 0) {
            int chiclesNuevos = envoltorios / oferta;
            chiclesTotales += chiclesNuevos;
            envoltorios = envoltorios % oferta + chiclesNuevos;
        }

        return chiclesTotales;
    }

    @Test
    public void ChiclesRegaloTest() {
        assertEquals(31, totalChicles(25, 5, 1));
        assertEquals(6, totalChicles(5, 5, 1));
        assertEquals(111, totalChicles(100, 10, 1));
        assertEquals(-1, totalChicles(20, 2, 5));
        assertEquals(-1, totalChicles(10, -1, 0));
        assertEquals(-1, totalChicles(-1, 2, 1));
        assertEquals(-1, totalChicles(10, 1, -1));
        assertEquals(-1, totalChicles(20, 2, 2));
        assertEquals(10, totalChicles(7, 3, 1));
        assertEquals(40, totalChicles(27, 3, 1));
        assertEquals(21, totalChicles(11, 2, 1));
        assertEquals(31, totalChicles(16, 2, 1));
//        assertEquals(100, totalChicles(100, 0, 0));
//        assertEquals(100, totalChicles(100, 0, 1));
        assertEquals(0, totalChicles(0, 0, 1));
        assertEquals(0, totalChicles(0, 2, 1));
    }

}
