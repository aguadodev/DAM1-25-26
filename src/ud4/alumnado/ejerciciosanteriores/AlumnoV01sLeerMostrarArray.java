package ud4.alumnado.ejerciciosanteriores;

public class AlumnoV01sLeerMostrarArray {
    public static void main(String[] args) {
        int NUM_ALUMNOS = 1;

        AlumnoV01[] alumnos = new AlumnoV01[NUM_ALUMNOS];

        for (int i = 0; i < alumnos.length; i++) {
            alumnos[i] = AlumnoLeerMostrar.leerDatosAlumnoV01();            
        }

        System.out.println("\n\nLISTADO DE ALUMNOS");
        System.out.println("==================\n");
        for (AlumnoV01 alumno : alumnos) {
            AlumnoLeerMostrar.mostrarAlumnoV01(alumno);
            System.out.println();
        }

    }
}
