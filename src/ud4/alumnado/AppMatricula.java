package ud4.alumnado;


public class AppMatricula {
    public static void main(String[] args) {
        // Carga datos en arrays de módulos y alumnos desde ficheros CSV
        Modulo[] modulos = Modulo.cargarFichero("DATOS - Módulos.csv");
        Alumno[] alumnos = Alumno.cargarFichero("DATOS - Alumnos.csv");

        // @TODO Muestra repetidamente un menú de opciones mientras no se seleccione Salir.
        System.out.println("MENÚ");
        // Listar Módulos
        // Listar Alumnado
        // Matricular 
        // Desmatricular
        // Mostrar Módulo
        // Mostrar Alumno
        // Crear Alumno Nuevo
    }
}
