import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class HoraLocal {
    public static void main(String[] args) {
        LocalTime horaActual; // Declaro una variable de tipo LocalTime
        
        horaActual = LocalTime.now(); // Obtengo la hora local

        System.out.println("Hora actual: " + horaActual);

        LocalDate fechaActual = LocalDate.now();

        System.out.println("Fecha actual: " + fechaActual);

        System.out.println("Fecha y hora actuales: " + LocalDateTime.now());



    }
}
