public class App {
    /**
     * Programa principal
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        final int MAYORIA_DE_EDAD = 18;
        /* Mensajes iniciales para el usuario
         * Saludamos al usuario y le decimos lo que vamos a hacer.
        */
        System.out.println("Hello, World!");
        System.out.print("Vamos a aprender Java. ");
        System.out.println("Comenzamos con los elementos del lenguaje");
        int edad; 
        edad = 17;
        boolean mayorDeEdad = false;  // Variable que almacena si se es mayor de edad o no

        mayorDeEdad = edad >= MAYORIA_DE_EDAD;
        
        
        String nombre = null;

        double importe = 123.56;
        char letra = 'A';


        System.out.println("Tengo " + edad + " años");
        //System.out.println(" y " + importe + " euros");
        System.out.println("La mayoría de Edad es a los " + MAYORIA_DE_EDAD + " años");
        System.out.println("Soy mayor de edad? " + mayorDeEdad);
    }
}
