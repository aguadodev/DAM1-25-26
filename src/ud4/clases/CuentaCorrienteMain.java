package ud4.clases;

public class CuentaCorrienteMain {
    public static void main(String[] args) {

        CuentaCorriente cc1 = new CuentaCorriente("55555555X", "Pepe");

        cc1.mostrar();

        cc1.ingresarDinero(100);

        cc1.mostrar();

        double importe = 50;
        if (cc1.sacarDinero(importe))
            System.out.println("Has sacado " + importe + " euros");
        else 
            System.out.println("No hay saldo suficiente");

        cc1.mostrar();

    }
}
