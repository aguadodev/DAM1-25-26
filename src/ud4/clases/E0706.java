package ud4.clases;

import java.util.Scanner;

public class E0706 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una hora indicando horas, minutos y segundos en líneas distintas: ");
        int horas = sc.nextInt();
        int minutos = sc.nextInt();
        int segundos = sc.nextInt();
        System.out.println("Introduce el número n de horas siguientes que inrán incrementándose segundo a segundo:");
        int n = sc.nextInt();

        Hora hora = new Hora(horas, minutos, segundos);

        hora.mostrar();

        for (int i = 0; i < n; i++) {
            hora.incSegundo();
            hora.mostrar();
        }
    }
}
