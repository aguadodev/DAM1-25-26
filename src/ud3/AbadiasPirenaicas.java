package ud3;

import java.util.Arrays;

/**
 * @author Samuel
 */
public class AbadiasPirenaicas {

    static int[] getMontanasAbadias(int[] montanasCordillera) {

        int[] montanasValidas = new int[0];
        int alturaMaxima = 0; // Nivel del mar
        // Recorro las montañas de derecha a izquierda guardándolas si su altura es
        // mayor que la máxima encontrada hasta el momento
        for (int i = montanasCordillera.length - 1; i >= 0; i--) {
            if (montanasCordillera[i] > alturaMaxima) {
                alturaMaxima = montanasCordillera[i];
                montanasValidas = Arrays.copyOf(montanasValidas, montanasValidas.length + 1);
                montanasValidas[montanasValidas.length - 1] = i + 1;
            }
        }

        // Ordeno resultado
        Arrays.sort(montanasValidas);
        return montanasValidas;
    }

    static int[] getMontanasAbadias2(int[] MontanasCordillera) {
        int abadias = 0;
        int[] montañasValidas = new int[MontanasCordillera.length];
        boolean detenerse = false;
        for (int i = 0; i < MontanasCordillera.length; i++) {
            detenerse = false;
            if (i == MontanasCordillera.length - 1) {
                montañasValidas[abadias] = i + 1;
                abadias++;
                detenerse = true;
            } else {
                for (int j = i + 1; j < MontanasCordillera.length && !detenerse; j++) {
                    if (MontanasCordillera[i] <= MontanasCordillera[j]) {
                        detenerse = true;
                    }
                }
                if (!detenerse) {
                    montañasValidas[abadias] = i + 1;
                    abadias++;
                }
            }

        }
        montañasValidas = Arrays.copyOf(montañasValidas, abadias);

        return montañasValidas;
    }

    public static void main(String[] args) {
        int[] montañas = { 3500, 3400, 3200, 3000, 3100 };
        System.out.println(Arrays.toString(getMontanasAbadias(montañas)));
        int[] montañas2 = { 4000, 3500, 3500, 3200 };
        System.out.println(Arrays.toString(getMontanasAbadias(montañas2)));
        int[] montañas3 = { 3000, 3500, 3200, 3400, 3200 };
        System.out.println(Arrays.toString(getMontanasAbadias(montañas3)));
        int[] montañas4 = { 3500, 3000, 4000 };
        System.out.println(Arrays.toString(getMontanasAbadias(montañas4)));
    }
}
