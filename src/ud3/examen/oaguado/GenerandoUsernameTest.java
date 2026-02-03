package ud3.examen.oaguado;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class GenerandoUsernameTest {
    @Test
    void testGetUsername() {
        assertEquals("msoutsout", GenerandoUsername.getUsername("María", "Souto", "Souto"));
    }

    @Test
    void testTildesEnheDieresis() {
        assertEquals("ogranmull", GenerandoUsername.getUsername("Óscar", "Graña", "Müller"));
    }

    @Test
    void testEspacios() {
        assertEquals("acosde", GenerandoUsername.getUsername("Ángel", "Cos", "de la Torre"));
    }
}
