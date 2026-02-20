package ud4.alumnado;

public class ExamenPenalizable extends Examen {
    double penalizacion;

    public ExamenPenalizable(String titulo) {
        super(titulo);
        this.penalizacion = 0.5;
    }

    @Override
    public int corregir(String[] respuestasUsuario) {
       int puntuacion = 0;
        for (int i = 0; i < this.preguntas.length; i++) {
            int respuestaUsuario = (respuestasUsuario[i].charAt(0) - 'a');
            if (this.preguntas[i].corregir(respuestaUsuario))
                puntuacion++;
            else 
                puntuacion -= penalizacion;
        }

        return puntuacion;        
    }

    
}
