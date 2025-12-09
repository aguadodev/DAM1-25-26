package ud3.arrays;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Scanner;

public class RegistroTiempos {

    public static void main(String[] args) {
        int[] tiempos = new int[0];
        Scanner sc = new Scanner(System.in);
        LocalTime horaInicial = LocalTime.now();
        System.out.println("Hora de inicio: " + horaInicial);

        String entrada;
        do {
            // Espera la entrada del usuario
            entrada = sc.nextLine();
            // Obtiene la hora actual
            LocalTime horaActual = LocalTime.now();
            System.out.println("Hora actual: " + horaActual);
            // Obitene los segundos transcurridos desde el inicio
            int segundosTranscurridos = (int) ChronoUnit.SECONDS.between(horaInicial, horaActual);
            System.out.println("Segundos transcurridos: " + segundosTranscurridos);
            // Cálculo alternativo de segundos transcurridos
            segundosTranscurridos = Math.round((horaActual.toNanoOfDay() - horaInicial.toNanoOfDay())/1000000000);             
            System.out.println("Segundos transcurridos: " + segundosTranscurridos);

            // Amplía el array e inserta al final el nuevo tiempo
            tiempos = Arrays.copyOf(tiempos, tiempos.length + 1);
            tiempos[tiempos.length - 1] = segundosTranscurridos;

        } while (!entrada.equalsIgnoreCase("F"));
        sc.close();

        System.out.println("Tiempos: " + Arrays.toString(tiempos));
        double suma = 0;
        for (int i = 0; i < tiempos.length; i++) {
            suma += tiempos[i];
        }
        double media = suma / tiempos.length;
        System.out.printf("Media de tiempos: %.2f segundos %n", media);

        int cont = 0;
        for (int i = 0; i < tiempos.length; i++) {
            if (tiempos[i] > media)
                cont++;
        }
        System.out.println("Número de registros por encima de la media: " + cont);

    }

}
