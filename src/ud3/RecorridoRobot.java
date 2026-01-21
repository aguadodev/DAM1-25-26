package ud3;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class RecorridoRobot {
    public static void main(String[] args) {
        String[] mapa = {
                "  Z       ",
                " *        ",
                "  *  *    ",
                "          ",
                " A        "
        };


    }

    static boolean recorridoRobot(String[] mapa, String instrucciones) {
        return true;
    }

    @Test
    void recorridoRobotTest() {
        String[] mapa = {
                "  Z       ",
                " *        ",
                "  *  *    ",
                "          ",
                " A        "
        };        
        assertTrue(recorridoRobot(mapa, "AALARAARAA"));
        assertTrue(recorridoRobot(mapa, "RAALAAAALA"));
        assertFalse(recorridoRobot(mapa, "ARALA"));
        assertFalse(recorridoRobot(mapa, "LAA"));
    }    
}
