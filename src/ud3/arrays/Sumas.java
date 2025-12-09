package ud3.arrays;

import java.util.Arrays;

/**
 * @author Adam
 */

public class Sumas {
    public static void main(String[] args) {
        int tabla[] = { 1, 4, 5, -2 };
        System.out.println(Arrays.toString(sumas(tabla)));

    }

    static int[] sumas(int t[]) {

        int ntabla[] = new int[3];
        int resSuma = 0;
        int resSumaPos = 0;
        int resSumaNeg = 0;

        for (int i = 0; i < t.length; i++) {
            resSuma += t[i];
            if (t[i] > 0) {
                resSumaPos += t[i];
            } else if (t[i] < 0) {
                resSumaNeg += t[i];
            }
        }
        ntabla[0] = resSuma;
        ntabla[1] = resSumaPos;
        ntabla[2] = resSumaNeg;
        return ntabla;
    }
}
