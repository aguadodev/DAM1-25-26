package ud1.ejercicios;
import java.util.Scanner;

/*
 * E0106_Media. Crea una aplicación que calcule la media aritmética de tres notas enteras. Ten en cuenta que la media puede tener decimales. 
 */

 /**
  * @Author Marco
  */
public class E0106_Media {
    public static void main(String[] args) {
        byte num1;
        byte num2;
        byte num3;
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Dame la primera nota: ");
        num1 = sc.nextByte();

        System.out.print("Dame la segunda nota: ");
        num2 = sc.nextByte();

        System.out.print("Dame la tercera nota: ");
        num3 = sc.nextByte();
        
        sc.close();

        double suma = num1 + num2 + num3;
        double resultado = suma / 3;

        System.out.println("tu media es de " + resultado);
    }
}
