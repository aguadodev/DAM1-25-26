package ud2.ejercicios.masejercicios;

public class EP0316_Triangulo {
    public static void main(String[] args) {
        dibujaTriangulo(4);
        dibujaTriangulo(10);
    }

    public static void dibujaTriangulo(int n) {
        for (int i = 1; i <= n; i++) {
            // Imprimir espacios
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            // Imprimir asteriscos
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // Salto de línea
            System.out.println();
        }
    }
}
