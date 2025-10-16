package ud2.ejercicios;

import java.util.Scanner;

/**
 * @author Hugo D.
 */

public class E0212 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("¿Qué día es?");
    int dia = sc.nextInt();
    System.out.println("¿Qué mes es?");
    int mes = sc.nextInt();
    System.out.println("¿Qué año es?");
    int ano = sc.nextInt();

    sc.close();

    boolean fechaValida = false;

    switch (mes) {
      case 1, 3, 5, 7, 8, 10, 12:
        fechaValida = dia >= 1 && dia <= 31;
        break;

      case 4, 6, 9, 11:
        fechaValida = dia >= 1 && dia <= 30;
        break;

      case 2:
        boolean esBisiesto = ano % 400 == 0 || ano % 4 == 0 && ano % 100 != 0;
        fechaValida = dia >= 1 && (dia <= 28 || dia == 29 && esBisiesto);
        break;
    }

    System.out.println(fechaValida ? "Fecha correcta" : "Fecha incorrecta");

  }
}
