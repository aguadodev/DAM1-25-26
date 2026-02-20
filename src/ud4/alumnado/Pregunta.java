package ud4.alumnado;


import java.util.Arrays;

import ud3.strings.Util;

public class Pregunta {

    String enunciado;
    String[] respuestas;
    int respuestaCorrecta;

    public Pregunta(String enunciado, String[] respuestas, int respuestaCorrecta) {
        if (respuestas.length >= 2 && respuestaCorrecta < respuestas.length) {
            this.enunciado = enunciado;
            this.respuestas = respuestas;
            this.respuestaCorrecta = respuestaCorrecta;
        } else {
            throw new IllegalArgumentException("El número de respuestas o el índice de la respuesta correcta es inválido.");
        }
    }

    public boolean corregir(int respuestaEscogida) {
        return respuestaEscogida == respuestaCorrecta;
    }

    // @ TODO Revisar tras ver Herencia
    public boolean equals(Pregunta a, Pregunta b) {
        if (a.enunciado == b.enunciado && Arrays.equals(a.respuestas, b.respuestas)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        String str = "";
        str += enunciado + "\n";
        for (int i = 0; i < respuestas.length; i++) {
            str += (char) (97 + i) + ") " + respuestas[i] + "\n";
        }
        return str;
    }    


    public static Pregunta[] cargarFichero(String fichero) {
        String[] preguntasCSV = Util.readFileToStringArray(fichero);

        Pregunta[] preguntas = new Pregunta[preguntasCSV.length];

        for (int i = 0; i < preguntasCSV.length; i++) {
            String[] atributos = preguntasCSV[i].split("\t");
            String[] respuestas = new String[atributos.length - 2];
            System.arraycopy(atributos, 1, respuestas, 0, atributos.length - 2);
            preguntas[i] = new Pregunta(
                    atributos[0],
                    respuestas,
                    Integer.valueOf(atributos[atributos.length-1])
                );
        }

        return preguntas;
    }
}