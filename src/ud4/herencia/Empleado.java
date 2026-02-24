package ud4.herencia;

import ud4.clases.Persona;

public class Empleado extends Persona {
    protected double salario;
    protected String estatura;

    public Empleado(String nombre, int edad, double estatura, double salario) {       
        super(nombre, edad, estatura);
        this.salario = salario;
    }

    public Empleado(String nombre, int edad, String estatura, double salario) {       
        this.nombre = nombre;
        this.edad = (byte) edad;
        this.estatura = estatura;
        this.salario = salario;
    }
    public Empleado() {

    }




    
    @Override
    public String toString() {
        return nombre + " (" + salario + ")";
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        /*System.out.println("- " + nombre);
        System.out.println("- " + edad);
        System.out.println("- " + estatura);*/
        System.out.println("- " + salario);
    }


    public static void main(String[] args) {
        Empleado e = new Empleado ("Sancho", 25, 1.80, 1725.49);

        System.out.println(e.nombre);  //muestra un atributo heredado
        System.out.println(e.salario); //muestra un atributo propio

        e.saludar();

        
    }

}
