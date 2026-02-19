package ud4.alumnado;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

import ud3.strings.Util;

public class Alumno {
    String nombre;
    String apellido1;
    String apellido2;
    LocalDate fechaNacimiento;
    Modulo[] modulos; // Módulos en los que el alumno está matriculado
    private static String centroEducativo = "IES Chan do Monte";

    public Alumno(String nombre, String apellido1, String apellido2) {

        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
    }

    public static void setCentroEducativo(String nuevoCentro) {
        if (nuevoCentro != null && !nuevoCentro.isEmpty())
            centroEducativo = nuevoCentro;
    }

    public static String getCentroEducativo() {
        return centroEducativo;
    }

    @Override
    public String toString() {
        return getUsername();
    }

    public String mostrar() {
        String str = "Ficha de Alumno/a \n";
        str += "================= \n";
        str += "Nombre: " + this.nombre + " \n";
        str += "Apellido1: " + apellido1 + " \n";
        str += "Apellido2: " + apellido2 + " \n";
        str += "Nombre de usuari@: " + getUsername() + " \n";
        if (fechaNacimiento != null) {
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            str += "Fecha de Nacimiento: " + fechaNacimiento.format(formato) + " \n";
        }
        if (modulos == null) {
            str += "Aún no está matriculado en ningún módulo \n";
        } else {
            str += "Módulos en que está matriculado: " + Arrays.toString(modulos) + " \n";
        }
        return str;
    }

    public void getIniciales() {
        String inicales = nombre.substring(0, 1) + apellido1.substring(0, 1)
                + apellido2.substring(0, 1);
        System.out.println(inicales.toUpperCase());
    }

    public String getUsername() {
        // Genera el nombre de usuario
        String username = "";
        username += nombre.charAt(0);

        int i = 0;
        while (i < apellido1.length() && i < 4 && apellido1.charAt(i) != ' ') {
            username += apellido1.charAt(i);
            i++;
        }

        i = 0;
        while (i < apellido2.length() && i < 4 && apellido2.charAt(i) != ' ') {
            username += apellido2.charAt(i);
            i++;
        }

        username = username.toLowerCase();

        username = username.replace('á', 'a');
        username = username.replace('é', 'e');
        username = username.replace('í', 'i');
        username = username.replace('ó', 'o');
        username = username.replace('ú', 'u');
        username = username.replace('ü', 'u');
        username = username.replace('ñ', 'n');

        return username;
    }

    public static Alumno[] cargarFichero(String fichero) {
        String[] alumnosCSV = Util.readFileToStringArray(fichero);

        Alumno[] alumnos = new Alumno[alumnosCSV.length];

        for (int i = 0; i < alumnosCSV.length; i++) {
            String[] atributos = alumnosCSV[i].split(",");
            alumnos[i] = new Alumno(
                    atributos[0],
                    atributos[1],
                    atributos[2]);
        }

        return alumnos;
    }

    public boolean matricula(Modulo modulo) {
        return modulo.matricula(this);
    }

}
