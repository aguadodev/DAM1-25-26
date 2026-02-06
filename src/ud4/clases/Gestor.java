package ud4.clases;

public class Gestor {
    public String nombre;
    public final String telefono;
    double importeMaximo;

    public Gestor(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.importeMaximo = 10000;
    }

    public void mostrar(){
        System.out.println("GESTOR/A: " + nombre + " (" + telefono + ")");
    }

}
