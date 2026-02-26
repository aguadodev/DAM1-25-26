package ud4.herencia.cajas;

import java.util.Random;

public class AppCajas {
    public static void main(String[] args) {
        Caja c = new Caja(100, 100, 100, Unidad.CM);
        System.out.println(c.getVolumen());
        Caja c2 = new Caja(10, 10, 10, Unidad.M);
        System.out.println(c2.getVolumen());
        c.setEtiqueta("Caja Pequeña");
        c2.setEtiqueta("Caja Grande");
        System.out.println(c);
        System.out.println(c2);

        Random rnd = new Random();
        int NUM_CAJAS = 10;
        CajaCarton[] cajasCarton = new CajaCarton[NUM_CAJAS];
        for (int i = 0; i < NUM_CAJAS; i++) {
            cajasCarton[i] = new CajaCarton(rnd.nextInt(40) + 10, rnd.nextInt(40) + 10, rnd.nextInt(40) + 10);
            System.out.println("CAJA Nº " + (i + 1));
            System.out.println(cajasCarton[i]);
            System.out.println("Superficie de cartón para la caja: " + cajasCarton[i].superficie());
            System.out.println("Superficie total para todas las cajas creadas hasta el momento: " + CajaCarton.superficieTotalCarton + " cm2");
            System.out.println();
        }

        System.out.println("Para las " + NUM_CAJAS + " cajas hará falta una superficie total de cartón de: " + CajaCarton.superficieTotalCarton / 10000 + " m2");

    }
}
