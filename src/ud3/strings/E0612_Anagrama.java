package ud3.strings;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class E0612_Anagrama {

    public static boolean sonAnagrama(String palabra1, String palabra2) {
        // procesar


        return true;
    }

    @Test
    public void sonAnagramaTest() {
        assertTrue(sonAnagrama("roma", "amor"));
        assertFalse(sonAnagrama("roma", "rima"));
        assertTrue(sonAnagrama("roma", "mora"));
        assertTrue(sonAnagrama("roma", "ramo"));
        assertTrue(sonAnagrama("nacionalista", "altisonancia"));
        assertTrue(sonAnagrama("mary", "army"));
        assertTrue(sonAnagrama("mary", "army"));
        

    }

}
