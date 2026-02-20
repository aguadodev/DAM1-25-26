package ud4.alumnado;

import java.util.Arrays;

public class Examen {
    protected String titulo;
    protected Pregunta[] preguntas;

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

    public int corregir(String[] respuestasUsuario) {
        int puntuacion = 0;
        for (int i = 0; i < this.preguntas.length; i++) {
            int respuestaUsuario = (respuestasUsuario[i].charAt(0) - 'a');
            if (this.preguntas[i].corregir(respuestaUsuario))
                puntuacion++;
        }

        return puntuacion;
    }

    public int corregir(int[] respuestasUsuario) {
        int puntuacion = 0;
        for (int i = 0; i < this.preguntas.length; i++) {
            if (this.preguntas[i].corregir(respuestasUsuario[i]))
                puntuacion++;
        }

        return puntuacion;
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
