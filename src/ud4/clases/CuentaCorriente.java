package ud4.clases;

public class CuentaCorriente {
    String dni;
    String nombreTitular;
    double saldo;

    // Constructores
    CuentaCorriente(String dni, String nombre) {
        this.dni = dni;
        this.nombreTitular = nombre;
        saldo = 0;
    }

    public boolean sacarDinero(double importe) {
        if (importe <= this.saldo) {
            // saco dinero
            saldo -= importe;
            return true;
        } else {
            // No hay saldo
            return false;
        }
    }

    public void ingresarDinero(double importe) {
        saldo += importe;
    }

    public void mostrar() {
        System.out.println("CUENTA CORRIENTE");
        System.out.println("================");
        System.out.println("Titular: " + nombreTitular + " (" + dni + ")");
        System.out.println("Saldo = " + saldo + " euros)");
    }

}
