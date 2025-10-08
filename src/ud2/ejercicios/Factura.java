package ud2.ejercicios;
/**
 * @author Santi
 */

public class Factura {
    
    public static void main(String[] args) {
        int precio = 20;
        int unidades = 7;
        final double IVA = 0.21;
        final int UMBRAL_DESCUENTO = 100;
        final double PORCENTAJE_DESCUENTO = 0.05;

        double precioFinal = precio * unidades * (1 + IVA);

        System.out.printf("El precio final de los productos es de: %.2f %n", precioFinal);

        if (precioFinal > UMBRAL_DESCUENTO) {
            precioFinal *= (1 - PORCENTAJE_DESCUENTO);
            System.out.printf("El precio final con descuento es de: %.2f %n", precioFinal);
        }
    }
}
