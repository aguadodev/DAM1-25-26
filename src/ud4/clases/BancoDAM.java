package ud4.clases;

import java.util.Arrays;
import java.util.Scanner;

public class BancoDAM {
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        CuentaCorriente cuentas[] = new CuentaCorriente[0];

        int opcion = getOpcion();

        while (opcion != 0) {
            switch (opcion) {
                case 1: 
                    System.out.print("Nombre del titular: ");
                    String titular = sc.nextLine();
                    System.out.print("DNI del titular: ");
                    String dni = sc.nextLine();
                    cuentas = Arrays.copyOf(cuentas, cuentas.length + 1);
                    cuentas[cuentas.length - 1] = new CuentaCorriente(dni, titular);
                break;
                case 2: break;
                case 3: break;
                case 4: break;
                case 0: break;
            }

            opcion = getOpcion();

        }
    }

    private static int getOpcion() {
        System.out.println("\nMENÚ DE BANQUER@");
        System.out.println("================");
        System.out.println("1. Crear Cuenta");
        System.out.println("2. Ingresar dinero");
        System.out.println("3. Sacar dinero");
        System.out.println("4. mostrar TODAS las cuentas");
        System.out.println("0. salir");
        int opcion = sc.nextInt();
        sc.nextLine();
        return opcion;
    }
}
