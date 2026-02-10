package ud4.clases;

import java.util.Scanner;

public class DiasSemanaMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DiaDeLaSemana ingles = DiaDeLaSemana.LUNES;

        System.out.println(ingles);

        DiaDeLaSemana sostenibilidad;
        sostenibilidad = DiaDeLaSemana.valueOf(sc.nextLine().toUpperCase());

        System.out.println("Sostenibilidad: " + sostenibilidad);

    }   
}
