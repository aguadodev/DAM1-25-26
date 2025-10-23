package ud2.ejercicios.estructurascontrol;

import java.util.Scanner;

public class E0210_DiasMes {
    public static void main(String[] args) {
        System.out.println("Número de Mes (1-12): ");
        Scanner sc = new Scanner(System.in);
        int mes = sc.nextInt();
        sc.close();
        
        int dias = switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12 -> {
                yield 31;
            }
            case 4, 6, 9, 11 -> {
                yield 30;
            }
            case 2 -> {
                yield 28;
            }

            default -> {
                yield -1;
            }
        };

        if (dias == -1)
            System.out.println("Número de mes incorrecto");
        else
            System.out.println("Días: " + dias);
    }
}
