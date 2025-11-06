package ud2.ejercicios.masejercicios;

import java.util.Scanner;

/**
 * @author Lunna M.
 */
public class ContarNumeros {
    public static int numDigitos(long num) {
        int cont = 0;
        if (num == 0) {
            return 1;
        }
        while (num != 0) {
            cont++; // Incrementa el contador de dígitos
            num = num / 10; // Elimina el último dígito          
        }
        return cont;
    }

    public static void main(String[] args) {

        System.out.println(numDigitos(0)); // 1
        System.out.println(numDigitos(123)); // 3
        System.out.println(numDigitos(987987987)); // 9
        System.out.println(numDigitos(123456789123456789L)); // 18

        Scanner sc = new Scanner(System.in);
        System.out.print("Inserte un número: ");
        int num = sc.nextInt();
        sc.close();

        int n = numDigitos(num);
        System.out.printf("El número %d esta compuesto por %d números.", num, n);

    }
}
