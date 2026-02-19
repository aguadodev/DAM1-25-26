package ud4.alumnado;

import java.util.Arrays;

import ud3.strings.Util;

public class Modulo {

    byte curso;
    String codigo;
    String nombre;
    short horas;
    byte periodosSemanais;
    Alumno[] alumnos; // Alumnado matriculado

    public Modulo(int curso, String codigo, String nombre, int horas, int periodosSemanais) {
        this.curso = (byte) curso;
        this.codigo = codigo;
        this.nombre = nombre;
        this.horas = (short) horas;
        this.periodosSemanais = (byte) periodosSemanais;
    }


    
    @Override
    public String toString() {
        return nombre;
    }



    public String mostrar() {
        String str = "";
        str += nombre + "\n";
        str += "Alumnado matriculado: ";
        if (!hayAlumnado())
            str += "No hay alumnado matriculado";
        else
            str += Arrays.toString(alumnos);
        return str;
    }

    public boolean hayAlumnado() {
        return alumnos != null && alumnos.length > 0;
    }


    public boolean estaMatriculado(Alumno a){
        if (alumnos == null)
            return false;
        for (Alumno alumno : alumnos) {
            if (alumno == a)
                return true;
        }
        return false;
    }

    public boolean matricula(Alumno a) {
        // Comprueba que el alumno no está ya matriculado
        // El método devuelve true si se ha podido matricular y false en caso contrario.
        if (estaMatriculado(a))
            return false;
        
        if (alumnos == null) {
            alumnos = new Alumno[1];
        } else {            
            alumnos = Arrays.copyOf(alumnos, alumnos.length + 1);
        }
        alumnos[alumnos.length - 1] = a;
        
        // Añadir el módulo al array de módulos del objeto Alumno
        if (a.modulos == null) {
            a.modulos = new Modulo[1];
        } else {            
            a.modulos = Arrays.copyOf(a.modulos, a.modulos.length + 1);
        }
        a.modulos[a.modulos.length - 1] = this;    
        return true;            
    }



    public double getSesiones() {
        return horas * 60.0 / 50;
    }

    public double getPorcentajeFaltas(int porcentaje) {
        return getSesiones() * porcentaje / 100;
    }


    public static Modulo[] cargarFichero(String fichero) {
        String[] modulosCSV = Util.readFileToStringArray(fichero);

        Modulo[] modulos = new Modulo[modulosCSV.length];

        for (int i = 0; i < modulosCSV.length; i++) {
            String[] atributos = modulosCSV[i].split(",");
            modulos[i] = new Modulo(
                    Byte.valueOf(atributos[0]),
                    atributos[1],
                    atributos[2],
                    Short.valueOf(atributos[3]),
                    Byte.valueOf(atributos[4]));
        }

        return modulos;
    }

}
