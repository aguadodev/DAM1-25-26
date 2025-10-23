package ud2.ejercicios.estructurascontrol;

import java.time.LocalTime;

public class BosDiasTardesNoites {
    public static void main(String[] args) {
        int horaActual = LocalTime.now().getHour();
        horaActual = 7;

        if (horaActual >= 7 && horaActual <= 13) {
            System.out.println("Bos días");
        } else if (horaActual >= 14 && horaActual <= 20) {
            System.out.println("Boas tardes");
        } else {
            System.out.println("Boas Noites");
        }

    }
}
