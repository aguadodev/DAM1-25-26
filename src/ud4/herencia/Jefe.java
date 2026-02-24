package ud4.herencia;

public class Jefe extends Empleado {
    String cargo;
    double bonus;


    public Jefe(String nombre, double salario, String cargo) {
        this.nombre = nombre;
        this.salario = salario;
        this.cargo = cargo;
    }

    public Jefe(){        
    }

    @Override
    public String toString() {
        return nombre + " (" + cargo + ")";
    }    


    @Override
    public void mostrarDatos() {
        System.out.println("JEFE: " +  nombre + "(" + cargo + ")");
    }

    public static void main(String[] args) {
        Jefe jefe = new Jefe();

        jefe.cargo = "Supervisor";
        jefe.nombre = "Pepe";
        jefe.salario = 2000;
    }
}
