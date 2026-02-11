package ud4.alumnado;

import ud3.strings.Util;

public class Modulo {

    byte curso;
    String codigo;
    String nombre;
    short horas;
    byte periodosSemanais;

    public Modulo(int curso, String codigo, String nombre, int horas, int periodosSemanais) {
        this.curso = (byte) curso;
        this.codigo = codigo;
        this.nombre = nombre;
        this.horas = (short) horas;
        this.periodosSemanais = (byte) periodosSemanais;
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

    public double getSesiones() {
        return horas * 60.0 / 50;
    }

    public double getPorcentajeFaltas(int porcentaje) {
        return getSesiones() * porcentaje / 100;
    }



    public static void main(String[] args) {
        Modulo[] modulos = cargarFichero("DATOS - Módulos.csv");
    }




}
