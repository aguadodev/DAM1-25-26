package ud4.alumnado;


public class AppMatriculaEjemplo {
    public static void main(String[] args) {
        Modulo[] modulos = Modulo.cargarFichero("DATOS - Módulos.csv");

        System.out.println(modulos[0].mostrar());

        Alumno alumno = new Alumno("Pepe", "A", "B");
        System.out.println(alumno.mostrar());

        System.out.println("\n Matriculando ... \n");

        modulos[0].matricula(alumno);
        if (modulos[0].matricula(alumno))
            System.out.println("Matriculado de nuevo");
        else 
            System.out.println("No es posible matricularlo");
        
        
        alumno.matricula(modulos[1]);

        System.out.println("Después de matricular... \n");

        System.out.println(modulos[0].mostrar());

        System.out.println(alumno.mostrar());

    }
}
