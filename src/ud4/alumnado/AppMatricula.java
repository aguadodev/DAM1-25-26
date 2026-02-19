package ud4.alumnado;


public class AppMatricula {
    public static void main(String[] args) {
        Modulo[] modulos = Modulo.cargarFichero("DATOS - Módulos.csv");

        System.out.println(modulos[0].mostrar());

        Alumno alumno = new Alumno("Pepe", "A", "B");
        System.out.println(alumno.mostrar());

        modulos[0].matricula(alumno);

        System.out.println(modulos[0].mostrar());

        System.out.println(alumno.mostrar());

    }
}
