package ud4.herencia;

import ud4.clases.Persona;

public class AppHerencia {
    public static void main(String[] args) {
        Persona p = new Persona("Marta", 30, 1.7);
        p.mostrarDatos();

        Empleado e = new Empleado ("Sancho", 25, 1.80, 1725.49);
        e.mostrarDatos();


        Empleado e2 = new Empleado ("Sancho2", 25, "XXL", 1725.49);
        e.mostrarDatos();        

        
        Jefe jefe = new Jefe("Pepe", 2000, "Supervisor");
        jefe.mostrarDatos();
        jefe.bonus = 1000;

        System.out.println("SELECCIÓN DINÁMICA DE MÉTODOS");
        Persona personaComodin = p;
        personaComodin.mostrarDatos();

        personaComodin = e;
        personaComodin.mostrarDatos();

        personaComodin = jefe;
        //personaComodin.bonus = 1000; // Error: con una variable de superclase (Persona) no puedo acceder a atributos específicos de la subclse (Jefe)
        personaComodin.mostrarDatos();  // Pero con los métodos sí funciona => Polimorfismo o Selección Dinámica de Métodos.

        // Jefe jefeComodin = p; // Error


        System.out.println("ARRAY CON SELECCIÓN DINÁMICA DE MÉTODOS");
        Persona[] personas = {p, e, e2, jefe};
        for (Persona persona : personas) {
            persona.mostrarDatos();
            System.out.println();
        }

        System.out.println("\n\ntoString()");
        for (Persona persona : personas) {
            System.out.println(persona);
        }       

    }
}
