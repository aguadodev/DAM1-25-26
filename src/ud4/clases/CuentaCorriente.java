package ud4.clases;

public class CuentaCorriente {
    private String dni;
    private String nombreTitular;
    private double saldo;
    private Gestor gestor;

    private static String banco = "Banco DAM";

    // Constructores
    public CuentaCorriente(String dni, String nombreTitular, double saldo) {
        if (saldo < 0) {
            throw new IllegalArgumentException("El saldo al crear una cuenta no puede ser negativo");
        }
        this.dni = dni;
        this.nombreTitular = nombreTitular;
        this.saldo = saldo;
    }

    public CuentaCorriente(String dni, double saldo) {
        this(dni, "", saldo);
    }

    public CuentaCorriente(String dni, String nombre) {
        this(dni, nombre, 0);
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
        if (gestor != null)
            gestor.mostrar();
    }

    // GETTERS Y SETTERS

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public static String getBanco() {
        return banco;
    }

    public static void setBanco(String banco) {
        CuentaCorriente.banco = banco;
    }

    public Gestor getGestor() {
        return gestor;
    }

    public void setGestor(Gestor gestor) {
        this.gestor = gestor;
    }

    public static boolean transferencia(CuentaCorriente ccOrigen, CuentaCorriente ccDestino, double importe) {
        if (ccOrigen.saldo >= importe) {
            ccDestino.saldo += importe;
            ccOrigen.saldo -= importe;
            return true;
        }
        
        return false;
    }

    public boolean transferir(CuentaCorriente ccDestino, double importe) {
        if (saldo >= importe) {
            ccDestino.saldo += importe;
            saldo -= importe;
            return true;
        }
        
        return false;
    }

}
