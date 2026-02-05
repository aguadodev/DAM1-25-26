package ud4.clases;

public class Persona {
    // Atributos
    String nombre;
    byte edad;
    double estatura;
    // final String dni;

    // Métodos
    void saludar() {
        System.out.println("Hola, me llamo " + nombre);
    }

    void cumplirAños() {
        edad++;
    }

    void crecer(double incremento) {
        estatura += incremento;
    }

    // constructor sobrecargado: solo asigna el nombre
    Persona(String nombre) {
        this(nombre, 0, 0);
    }

    public Persona(String nombre, int edad, double estatura) {
        if (nombre.equals("") || edad < 0 || estatura < 0)
            throw new IllegalArgumentException();
        this.nombre = nombre;
        this.edad = (byte) edad;
        this.estatura = estatura;
    }

    Persona() {
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
