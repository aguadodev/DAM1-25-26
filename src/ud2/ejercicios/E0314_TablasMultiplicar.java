package ud2.ejercicios;

public class E0314_TablasMultiplicar {
    public static void main(String[] args) {

        for (int n = 1; n <= 10; n++) {
            System.out.println();
            System.out.println("Tabla de multiplicar del número " + n);
            System.out.println("=================================");

            // Mostrar la tabla de multiplicar de n
            for (int i = 1; i <= 10; i++) {
                System.out.printf("%d x %d = %d %n", n, i, n * i);
            }
        }

    }
}
