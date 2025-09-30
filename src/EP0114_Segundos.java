import java.util.Scanner;

/*
 * EP0114_Segundos. Convertir un número de horas, minutos y segundos introducidos por teclado en un número total de segundos.
 */

/**
 * @author Javier R.
 */

public class EP0114_Segundos {
    public static void main(String[] args) {
        int horas, minutos, segundos, totalSegundos;
        Scanner sc = new Scanner(System.in);

        System.out.print("Indique número de horas: ");
        horas = sc.nextInt();
        System.out.print("Indique número de minutos: ");
        minutos = sc.nextInt();
        System.out.print("Indique número de segundos: ");
        segundos = sc.nextInt();
        sc.close();

        totalSegundos = segundos + minutos * 60 + horas * 3600;
        
        System.out.println("El número total de segundos es de: " + totalSegundos);
    }
}
