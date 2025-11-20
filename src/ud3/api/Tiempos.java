package ud3.api;

import java.time.LocalDate;
import java.time.Period;
import java.time.chrono.ChronoLocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.Scanner;

public class Tiempos {
    public static void main(String[] args) {
        LocalDate hoy = LocalDate.now();
        // LocalDate hoy = LocalDate.of(2026, 2, 2);

        System.out.println(hoy);
        DateTimeFormatter formatoLocal = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(hoy.getDayOfMonth() + "/" + hoy.getMonthValue() + "/" + hoy.getYear());
        System.out.println(hoy.format(formatoLocal));

        Scanner sc = new Scanner(System.in);
        System.out.print("Cuándo empiezan las vacaciones? (dd/mm/aaaa): ");
        String fechaTexto = sc.nextLine();
        LocalDate vacaciones = LocalDate.parse(fechaTexto, formatoLocal);
        //LocalDate vacaciones = LocalDate.of(2025, 12, 19);

        System.out.println(vacaciones);

        if (hoy.isAfter(vacaciones)) {
            System.out.println("Estamos de vacaciones");
            long dias = vacaciones.until(hoy, ChronoUnit.DAYS);
            System.out.println("Llevamos... " + dias + " días de vacaciones");
        } else {
            System.out.println("Aún no estamos de vacaciones");
            /*
             * int diaHoy = hoy.getDayOfYear();
             * int diaVacaciones = vacaciones.getDayOfYear();
             * int dias = diaVacaciones - diaHoy;
             */

            // toEpochDay
            long dias = vacaciones.toEpochDay() - hoy.toEpochDay();

            System.out.println("Faltan... " + dias + " días");
        }
    }
}
