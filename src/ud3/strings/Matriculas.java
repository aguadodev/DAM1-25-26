package ud3.strings;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class Matriculas {
    boolean esMatriculaValida(String matricula) {
        return true;
    }

    @Test
    void esMatriculaValidaTest() {
        assertTrue(esMatriculaValida("9876XYZ"));
        assertTrue(esMatriculaValida("5678XYZ"));
        assertTrue(esMatriculaValida("1234BBB"));
        assertTrue(esMatriculaValida("9999BBZ"));
        assertTrue(esMatriculaValida("9999BBD"));
        assertTrue(esMatriculaValida("9999ZZZ"));

        assertFalse(esMatriculaValida("1234ABC"));
        assertFalse(esMatriculaValida("1234AEI"));
        assertFalse(esMatriculaValida("ABCD123"));
        assertFalse(esMatriculaValida("1234ÑYZ"));
        assertFalse(esMatriculaValida("123"));
        assertFalse(esMatriculaValida("1234BBBB"));
        assertFalse(esMatriculaValida("12A4BBB"));
        assertFalse(esMatriculaValida("12.4BBB"));
        assertFalse(esMatriculaValida("1234BAB"));
        assertFalse(esMatriculaValida("1234BB."));
        assertFalse(esMatriculaValida("1234B5B"));
        assertFalse(esMatriculaValida("1234BúB"));
        assertFalse(esMatriculaValida("1234BÚB"));
        assertFalse(esMatriculaValida("1234BñB"));
        assertFalse(esMatriculaValida("1234BbB"));

        assertFalse(esMatriculaValida(""));
        assertFalse(esMatriculaValida(null));
    }

}
