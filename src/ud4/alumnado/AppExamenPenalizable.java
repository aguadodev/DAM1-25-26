package ud4.alumnado;

import java.util.Scanner;

public class AppExamenPenalizable {
    public static void main(String[] args) {

        ExamenPenalizable examenUD2 = new ExamenPenalizable("TEST UD2 - Programación");
        
        Pregunta[] preguntas = Pregunta.cargarFichero("DATOS - PreguntasTest.tsv");

        for (int i = 0; i < preguntas.length; i++) {
            examenUD2.addPregunta(preguntas[i]);
        }

        System.out.println(examenUD2);

        // Pedir respuestas al usuario
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\nEscribe las respuestas correctas separadas por espacios. Ejemplo \"d b c c b\": ");
        String entrada = sc.nextLine();
        String[] respuestasStr = entrada.toLowerCase().split(" ");
        
        // Corregir y dar nota
        System.out.println("Puntuación: " + examenUD2.corregir(respuestasStr));

        System.out.println("FIN");
    }
}
