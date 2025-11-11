package ud2.practicas;

import java.util.Scanner;

/**
 * @author Fran e Ismael
 */

public class Supermercado {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        devolverCambio(126.67);
        boolean nuevoCliente = true;

        while (nuevoCliente) {
            System.out.println("=== NUEVO CLIENTE ===");
            double total = leerProductos();

            pagarCompra(total);

            nuevoCliente = preguntarNuevoCliente();
        }
        sc.close();
    }

    private static boolean preguntarNuevoCliente() {
        // repetir o salir
        System.out.print("¿Atender a otro cliente? (s/n): ");
        String respuesta = sc.nextLine().toLowerCase();
        return respuesta.equals("n") ? false : true;
    }

    private static void pagarCompra(double total) {
        boolean metodoPagoValido = false;
        while (!metodoPagoValido) {
            // elegir método de pago
            System.out.print("¿Método de pago (0-tarjeta / 1-efectivo)? ");
            int metodoPago = sc.nextInt();

            switch (metodoPago) {
                case 0:
                    System.out.println("Pago con tarjeta realizado correctamente.");
                    metodoPagoValido = true;
                    break;

                case 1:
                    System.out.print("Introduce el importe pagado por el cliente: ");
                    double pagado = sc.nextDouble();
                    double cambio = pagado - total;
                    if (cambio >= 0) {
                        System.out.printf("Cambio a devolver: %.2f €%n", cambio);
                        sc.nextLine();
                        metodoPagoValido = true;
                        // Devolver cambio
                        devolverCambio(cambio);
                    } else {
                        System.out.println("Importe insuficiente.");
                    }
                    break;

                default:
                    System.out.println("Método de pago no válido.");
            }
        }
    }



    private static void devolverCambio(double cambio) {
        System.out.println("Aquí devolveremos el cambio desglosado...");
        int euros = (int) cambio;
        int centimos = (int) ((cambio - euros) * 100);

        int billetes50 = euros / 50;
        euros %= 50;
        int billetes20 = euros / 20;
        euros %= 20;
        int billetes10 = euros / 10;
        euros %= 10;
        int billetes5 = euros / 5;
        euros %= 5;
        int monedas2 = euros / 2;
        int monedas1 = euros % 2;

        int centimos50 = centimos / 50;
        centimos %= 50;
        int centimos20 = centimos / 20;
        centimos %= 20;
        int centimos10 = centimos / 10;
        centimos %= 10;
        int centimos5 = centimos / 5;
        centimos %= 5;
        int centimos2 = centimos / 2;
        int centimos1 = centimos % 2;

        String cambioStr = "";
        cambioStr += billetes50 > 0 ? billetes50 + " billetes de 50\n" : "";
        cambioStr += billetes20 > 0 ? billetes20 + " billetes de 20\n" : "";
        cambioStr += billetes10 > 0 ? billetes10 + " billetes de 10\n" : "";
        cambioStr += billetes5 > 0 ? billetes5 + " billetes de 5\n" : "";
        cambioStr += monedas2 > 0 ? monedas2 + " monedas de 2 euros\n" : "";
        cambioStr += monedas1 > 0 ? monedas1 + " moneda de 1 euro\n" : "";

        cambioStr += centimos50 > 0 ? centimos50 + " monedas de 50 céntimos\n" : "";
        cambioStr += centimos20 > 0 ? centimos20 + " monedas de 20 céntimos\n" : "";
        cambioStr += centimos10 > 0 ? centimos10 + " monedas de 10 céntimos\n" : "";
        cambioStr += centimos5 > 0 ? centimos5 + " monedas de 5 céntimos\n" : "";
        cambioStr += centimos2 > 0 ? centimos2 + " monedas de 2 céntimos\n" : "";
        cambioStr += centimos1 > 0 ? centimos1 + " moneda de 1 céntimo\n" : "";

        System.out.println(cambioStr);
    }



    private static double leerProductos() {
        double total = 0;
        // introducir productos
        boolean nuevoProducto = true;
        while (nuevoProducto) {
            System.out.print("Introduce el precio del producto (0 o negativo para terminar): ");
            double precio = sc.nextDouble();

            if (precio > 0) {
                System.out.print("Introduce la cantidad de unidades: ");
                int cantidad = sc.nextInt();
                total += precio * cantidad;
            } else {
                nuevoProducto = false;
            }
        }

        System.out.printf("Importe total de la compra: %.2f €%n", total);
        sc.nextLine();
        return total;
    }
}
