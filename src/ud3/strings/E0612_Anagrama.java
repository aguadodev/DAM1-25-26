package ud3.strings;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

/**
 * @author Darío
 */

public class E0612_Anagrama {
    public static boolean sonAnagrama(String palabra1, String palabra2) {
        if ((palabra1.length() != palabra2.length()) || (palabra1 == palabra2))
            return false;

        char[] palabraChar1 = palabra1.toLowerCase().toCharArray();
        char[] palabraChar2 = palabra2.toLowerCase().toCharArray();

        Arrays.sort(palabraChar1);
        Arrays.sort(palabraChar2);

        return Arrays.equals(palabraChar1, palabraChar2);
    }

    @Test
    public void sonAnagramaTest() {
        assertTrue(sonAnagrama("Roma", "Amor"));

        assertTrue(sonAnagrama("roma", "amor"));
        assertFalse(sonAnagrama("roma", "rima"));
        assertTrue(sonAnagrama("roma", "mora"));
        assertTrue(sonAnagrama("roma", "ramo"));
        assertTrue(sonAnagrama("nacionalista", "altisonancia"));
        assertTrue(sonAnagrama("mary", "army"));
        assertTrue(sonAnagrama("mary", "army"));
    }    

}
