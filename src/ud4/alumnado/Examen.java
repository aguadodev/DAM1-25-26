package ud4.alumnado;

import java.util.Arrays;

public class Examen {
    String titulo;
    Pregunta[] preguntas;

    public Examen(String titulo) {
        this.titulo = titulo;
    }

    public boolean addPregunta(Pregunta pregunta) {
        if (preguntas == null) {
            preguntas = new Pregunta[1];
        } else {
            for (Pregunta p : preguntas)
                if (p == pregunta)
                    return false;
            preguntas = Arrays.copyOf(preguntas, preguntas.length + 1);
        }
        preguntas[preguntas.length - 1] = pregunta;
        return true;
    }

    public int numPreguntas() {
        return preguntas.length;
    }

    @Override
    public String toString() {
        String str = "Examen: " + titulo + "\n";
        str += "=====================================\n";
        for (int i = 0; i < preguntas.length; i++) {
            str = str + (i + 1) + ". " + preguntas[i] + "\n";
        }
        return str;
    }

    

}
