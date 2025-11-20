package ud3.api;

import java.util.Random;

public class ClaseRandom {
    public static void main(String[] args) {
        Random rnd = new Random();

        for (int i = 0; i < 10; i++) {
            int random = rnd.nextInt(10, 100);
            System.out.println(random);
        }
    }
}
