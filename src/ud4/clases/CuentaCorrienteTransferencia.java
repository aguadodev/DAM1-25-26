package ud4.clases;

public class CuentaCorrienteTransferencia {
    public static void main(String[] args) {
        CuentaCorriente c1 = new CuentaCorriente("Pepe", "99999999Z", 100);
        CuentaCorriente c2 = new CuentaCorriente("Marta", "77777777X", 50);

        c1.mostrar();
        c2.mostrar();

        // Método estático para transferencia entre 2 cuentas
        if (CuentaCorriente.transferencia(c1, c2, 75))
            System.out.println("Transferencia realizada!");
        else
            System.out.println("No hay suficiente saldo en la cuenta de origen");

        if (c1.transferir(c2, 75))
            System.out.println("Transferencia realizada!");
        else
            System.out.println("No hay suficiente saldo en la cuenta de origen");

        c1.mostrar();
        c2.mostrar();

        c2.transferir(c1, 50);

    }
}
