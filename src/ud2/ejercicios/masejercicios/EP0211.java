package ud2.ejercicios.masejercicios;

import ud2.Util;

public class EP0211 {

    static long invertirNumero(long n) {
        long numInvert = 0;
        while (n % 10 != 0) { // Mientras el último dígito de n sea distinto de 0
            numInvert = numInvert * 10 + n % 10; // Construye (acumula) el número invertido
            n = n / 10; // Elimina el último dígito de n
        }
        return numInvert;
    }


    public static boolean esCapicua(long n) {
        long nInvertido = invertirNumero(n);
        return n == nInvertido;
    }
    
    public static boolean esCapicuaR(long n) {
        if (n == 0) 
            return true;

        int numDigitos = Util.numDigitos(n);

        int primerDigito = (int)(n / Math.pow(10, numDigitos - 1));
        int ultimoDigito = (int) (n % 10);
        long numeroRestante = (long)(n % Math.pow(10, numDigitos - 1) / 10);

        return primerDigito == ultimoDigito && esCapicuaR(numeroRestante);
    }    

    public static void main(String[] args) {
        System.out.println(esCapicuaR(12301));
        System.out.println(esCapicuaR(12321)); // True
        System.out.println(esCapicuaR(12345)); //False
        System.out.println(esCapicuaR(12345678987654321L)); //True
        System.out.println(esCapicuaR(123456789987654321L)); //True
        System.out.println(esCapicuaR(123456789687654321L)); //False
        System.out.println(esCapicuaR(0)); //True
        System.out.println(esCapicuaR(98)); //False
        System.out.println(esCapicuaR(121)); //True


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
