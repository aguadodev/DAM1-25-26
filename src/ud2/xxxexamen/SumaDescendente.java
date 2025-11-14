package ud2.xxxexamen;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class SumaDescendente {
    static int sumaDescendente(int n) {
        int sumaDescendente = 0;

        // Cálculos
        for (int divisor = 10; (n * 10) / divisor > 0; divisor *= 10) {
            sumaDescendente += n % divisor;
        }

        return sumaDescendente;
    }

    @Test
    public void testSumaDescendente() {
        assertEquals(5242, sumaDescendente(4578));
        assertEquals(5252, sumaDescendente(5083));
        assertEquals(1107, sumaDescendente(999));
        assertEquals(108, sumaDescendente(99));
        assertEquals(9, sumaDescendente(9));
        assertEquals(44444+4444+444+44+4, sumaDescendente(44444));        
        assertEquals(5444444+444444+44444+4444+444+44+4, sumaDescendente(5444444));         

        assert sumaDescendente(4321) == 4321 + 321 + 21 + 1;
        assert sumaDescendente(100) == 100 + 0 + 0;
        assert sumaDescendente(7) == 7;
        assert sumaDescendente(0) == 0;
        assert sumaDescendente(12345) == 12345 + 2345 + 345 + 45 + 5;
    }    
    
}
