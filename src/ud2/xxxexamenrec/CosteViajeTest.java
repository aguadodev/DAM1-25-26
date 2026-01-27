package ud2.xxxexamenrec;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CosteViajeTest {
    @Test
    void testCosteViaje() {
        assertEquals(9.126, CosteViaje.costeViaje(100,(byte) 0,6), 0.01);
        assertEquals(7.175, CosteViaje.costeViaje(100,(byte) 1,5), 0.01);
        assertEquals(2.48865, CosteViaje.costeViaje(100,(byte) 2,15), 0.01);
    }
}
