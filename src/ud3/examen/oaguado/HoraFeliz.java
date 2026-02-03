package ud3.examen.oaguado;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class HoraFeliz {
    public static void main(String[] args) {
        // Genera la hora feliz
        Random rnd = new Random();
        int hora = rnd.nextInt(24);
        int minuto = rnd.nextInt(60);
        System.out.printf("Hora Feliz: %02d:%02d %n%n", hora, minuto);
        LocalTime horaFeliz = LocalTime.of(hora, minuto);

        // Obtiene la hora actual
        LocalTime horaActual = LocalTime.now();
        System.out.println("Hora Actual: " + horaActual.format(DateTimeFormatter.ofPattern("HH:mm")));

        // Compara
        if (horaActual.isBefore(horaFeliz)) {
            System.out.println("Aún no ha empezado la hora feliz.");
            int minutosRestantes = (horaFeliz.toSecondOfDay() - horaActual.toSecondOfDay()) / 60;
            System.out.println("Faltan " + minutosRestantes + " minutos (completos).");
        } else if (horaActual.isAfter(horaFeliz.plusMinutes(60))) {
            System.out.println("Ya ha terminado la hora feliz");
        } else {
            System.out.println("¡¡¡Estamos en la Hora Feliz!!!");
        }
    }
}
