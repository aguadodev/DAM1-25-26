package ud4.alumnado;

public class AppExamen {
    public static void main(String[] args) {

        Examen examenUD2 = new Examen("TEST UD2 - Programación");
        
        Pregunta[] preguntas = Pregunta.cargarFichero("DATOS - PreguntasTest.tsv");

        for (int i = 0; i < preguntas.length; i++) {
            examenUD2.addPregunta(preguntas[i]);
        }

        System.out.println(examenUD2);

        // Pedir respuestas al usuario


        // Corregir y dar nota


        System.out.println("FIN");
    }
}
