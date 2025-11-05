package ud2.ejercicios.masejercicios;

import ud2.Util;

public class EP0211 {
    public static void main(String[] args) {
        System.out.print("Introduce un número entero de 4 cifras para ver si es capicúa: ");
        int n = Util.leerInt();

        // Comprueba que el número tiene 3 (o 4) cifras?

        boolean esCapicua = false;

        if (n < 1000 && n > 99) {
            // Separa las cifras de un número de 3 cifras
            int unidades = n % 10;
            int centenas = n / 100;
            esCapicua = unidades == centenas;
        } else if (n < 10000 && n > 999) {
            // Para 4 cifras
            int unidades = n % 10;
            int decenas = n / 10 % 10;
            int centenas = n / 100 % 10;
            int uMillar = n / 1000;
            // Compara las cifras
            esCapicua = unidades == uMillar && centenas == decenas;
        }

        // Salida
        System.out.println(esCapicua ? "Es capicúa" : "NO es capicúa");

    }
}
