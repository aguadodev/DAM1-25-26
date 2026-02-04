package ud4.alumnado;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import ud3.strings.Util;

public class AlumnosLeerMostrarCSV {
    public static void main(String[] args) {

        String[] alumnosCSV = Util.readFileToStringArray("alumnos.csv");

        Alumno[] alumnos = new Alumno[alumnosCSV.length];

        for (int i = 0; i < alumnosCSV.length; i++) {
            String[] atributos = alumnosCSV[i].split(",");
            alumnos[i] = new Alumno();
            alumnos[i].nombre = atributos[0];
            alumnos[i].apellido1 = atributos[1];
            alumnos[i].apellido2 = atributos[2];
            alumnos[i].fechaNacimiento = LocalDate.parse(atributos[3], DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            alumnos[i].notaProgramacion = Double.parseDouble(atributos[4]);
            alumnos[i].notaContornos = Double.parseDouble(atributos[5]);
        }


        Alumno.setCentroEducativo("");

        System.out.println("\n\nLISTADO DE ALUMNOS del " + Alumno.centroEducativo);
        System.out.println("==================================\n");
        for (Alumno alumno : alumnos) {
            //AlumnoLeerMostrar.mostrarAlumno(alumno);
            alumno.mostrar();
            System.out.println();
        }

    }
}
