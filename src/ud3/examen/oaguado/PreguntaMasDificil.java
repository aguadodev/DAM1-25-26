package ud3.examen.oaguado;

public class PreguntaMasDificil {
    static double mediaPreguntaMasDificil(double[][] notas) {

        if (notas == null || notas.length == 0 || notas[0].length == 0)
            return -1;

        double mediaPreguntaMasDificil = Double.MAX_VALUE;

        for (int c = 0; c < notas[0].length; c++) {
            double suma = 0;
            for (int f = 0; f < notas.length; f++) {
                suma += notas[f][c];
            }

            double media = suma / notas.length;

            if (media < mediaPreguntaMasDificil)
                mediaPreguntaMasDificil = media;
        }

        return mediaPreguntaMasDificil;
    }
}
