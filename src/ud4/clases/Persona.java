package ud4.clases;

public class Persona {
    // Atributos
    protected String nombre;
    protected byte edad;
    protected double estatura;
    // final String dni;

    // Métodos

    public void mostrarDatos() {
        System.out.println("- " + nombre);
        System.out.println("- " + edad);
        System.out.println("- " + estatura);
    }

    public void saludar() {
        System.out.println("Hola, me llamo " + nombre);
    }

    public void cumplirAños() {
        edad++;
    }

    protected void crecer(double incremento) {
        estatura += incremento;
    }


    
    @Override
    public String toString() {
        return nombre + " (" + edad + ")";
    }





    // constructor sobrecargado: solo asigna el nombre
    public Persona(String nombre) {
        this(nombre, 0, 0);
    }

    public Persona(String nombre, int edad, double estatura) {
        if (nombre.equals("") || edad < 0 || estatura < 0)
            throw new IllegalArgumentException();
        this.nombre = nombre;
        this.edad = (byte) edad;
        this.estatura = estatura;
    }

    public Persona() {
        edad = 18;
        estatura = 1.7;
    }

    public static void main(String[] args) {
        Persona p = new Persona("");
        p.nombre = "Pepe";
        p.edad = 7;
        p.estatura = 1.7;

        Persona claudia = new Persona("", 8, 1.20);
        Persona persona = new Persona("Paco");

        p.saludar();
        claudia.saludar();
        persona.saludar();

        System.out.println("Fin de programa");
    }

}
