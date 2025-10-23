package ud2;

public class Util {

    /*
     * CARACTERES Y CADENAS
     */
    public static boolean esVocal(char caracter) {
        boolean esVocal = false;
        switch (caracter) {
            case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U',
                    'á', 'é', 'í', 'ó', 'ú', 'Á', 'É', 'Í', 'Ó', 'Ú':
                esVocal = true;
        }

        return esVocal;
    }

    /*
     * NÚMEROS: PRIMOS Y OTROS
     */
    public static boolean esPrimo(int n) {
        if (n <= 1)
            return false;

        boolean esPrimo = true;
        for (int i = 2; esPrimo && i <= n / 2; i++) {
            if (n % i == 0) {
                esPrimo = false;
            }
        }

        return esPrimo;
    }

    /*
     * FECHAS Y HORAS
     */
    public static boolean esBisiesto(int anho) {
        boolean multiplo400 = anho % 400 == 0;
        boolean multiplo100 = anho % 100 == 0;
        boolean multiplo4 = anho % 4 == 0;

        return multiplo400 || multiplo4 && !multiplo100;
    }

    public static String mostrarDiaSiguiente(int dia, int mes, int anho) {
        int diasMesActual = 0;
        dia++;

        switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12 -> diasMesActual = 31;
            case 4, 6, 9, 11 -> diasMesActual = 30;
            case 2 -> diasMesActual = esBisiesto(anho) ? 29 : 28;
        }

        if (dia > diasMesActual) {
            dia = 1;
            mes++;
            if (mes > 12) {
                mes = 1;
                anho++;
            }
        }

        return String.format("%02d/%02d/%04d", dia, mes, anho);
    }

    /*
     * FUNCIONES DE FIGURAS GEOMÉTRICAS
     */
    public static double areaCilindro(double altura, double radio) {
        return 2 * Math.PI * radio * (altura + radio);
    }

    public static double volumenCilindro(double altura, double radio) {
        return Math.PI * Math.pow(radio, 2) * altura;
    }

}
