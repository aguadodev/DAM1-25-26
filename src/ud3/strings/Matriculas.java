package ud3.strings;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class Matriculas {
    boolean esMatriculaValida2(String matricula) {
        // Early return
        if (matricula == null || matricula.length() != 7)
            return false;

        // Comprueba que los 4 primeros caracteres son números
        for (int i = 0; i < 4; i++) {
            if (!Character.isDigit(matricula.charAt(i)))
                return false;
        }

        // Comprueba que los 3 últimos caracteres son letras válidas
        for (int i = 4; i < 7; i++) {
            String letrasValidas = "BCDFGHJKLMNPRSTVWXYZ";

            char letra = Character.toUpperCase(matricula.charAt(i));

            if (letrasValidas.indexOf(letra) == -1) {
                return false;
            }
            
        }

        return true;
    }

    boolean esMatriculaValida(String matricula) {
        return matricula != null && matricula.toUpperCase().matches("[0-9]{4}[BCDFGHJKLMNPRSTVWXYZ]{3}");
    }

    

    @Test
    void esMatriculaValidaTest() {
        assertFalse(esMatriculaValida(null));
        assertFalse(esMatriculaValida(""));

        assertTrue(esMatriculaValida("9876XYZ"));
        assertTrue(esMatriculaValida("5678XYZ"));
        assertTrue(esMatriculaValida("1234BBB"));
        assertTrue(esMatriculaValida("9999BBZ"));
        assertTrue(esMatriculaValida("9999BBD"));
        assertTrue(esMatriculaValida("9999ZZZ"));
        assertTrue(esMatriculaValida("1234BbB"));        

        assertFalse(esMatriculaValida("123"));
        assertFalse(esMatriculaValida("1234BBBB"));

        assertFalse(esMatriculaValida("ABCD123"));        
        assertFalse(esMatriculaValida("12A4BBB"));
        assertFalse(esMatriculaValida("12.4BBB"));        

        assertFalse(esMatriculaValida("1234BB."));
        assertFalse(esMatriculaValida("1234B5B"));

        assertFalse(esMatriculaValida("1234ABC"));
        assertFalse(esMatriculaValida("1234AEI"));
        assertFalse(esMatriculaValida("1234ÑYZ"));
        assertFalse(esMatriculaValida("1234BAB"));
        assertFalse(esMatriculaValida("1234BúB"));
        assertFalse(esMatriculaValida("1234BÚB"));
        assertFalse(esMatriculaValida("1234BñB"));
    }


    int comparaMatriculas(String m1, String m2) {
        String m1Aux = m1.substring(4, 7) + m1.substring(0,4);
        String m2Aux = m2.substring(4, 7) + m2.substring(0,4);

        return m1Aux.compareToIgnoreCase(m2Aux);
    }

    @Test
    void comparaMatriculasTest() {
        assertEquals(comparaMatriculas("1234BBB", "1234BBB"), 0);        
        assertEquals(comparaMatriculas("1234BBB", "1234BBC"), -1);        
        assertEquals(comparaMatriculas("1234BBC", "1234BBB"), 1);        
        assertEquals(comparaMatriculas("1234BBB", "1233BBB"), 1);        
        assertEquals(comparaMatriculas("1234BBB", "1235BBB"), -1);        

    }

}
