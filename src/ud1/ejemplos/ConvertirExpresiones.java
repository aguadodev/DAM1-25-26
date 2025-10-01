package ud1.ejemplos;
public class ConvertirExpresiones {
    public static void main(String[] args) {
        /*
         * double a = 3. / 2 + 4 / 3.;
         * System.out.println("a = " + a);
         * 
         * double x = 1, y = 2;
         * double b = 1 / (x - 5) - 3 * x * y / 4;
         * System.out.println("b = " + b);
         */

        int num = 65;
        char letra = (char) num;
        System.out.println(letra);
        letra += 32;
        System.out.println(letra);
        letra++;
        letra += 1;
        letra = (char) (letra + 1);
        System.out.println(letra); // d

        int x = 100;
        double y = 20.5;
        int resultado = (int) (x + y);

        System.out.println(resultado);

        long grande = 9876543210l;
        int pequeno = (int) grande;
        System.out.printf("Grande: %d %nPequeño: %d %n%n", grande, pequeno);

        char c = 'A';
        int ascii = c;
        System.out.println(ascii);

        byte b = 120;
        byte resultado2 = (byte) (b + 10);
        System.out.println(resultado2);

        b = (byte) (-128 - 1);
        System.out.println(b);

        String numeroEnTexto = "100";
        int numero = Integer.parseInt(numeroEnTexto);
        System.out.println(numeroEnTexto + 1);
        System.out.println(numero + 1);

        int a = 5;
        double b2 = 6.4;
        float c2 = (float) b2 + a / 2.0f;
        System.out.println(c2);

        byte x2 = 50;
        int y2 = 200;
        double resultado3 = (double) (x2 + y2) / 3;
        System.out.println(resultado3);

    }
}
