package ud3;

/**
 * @author Samuel
 */
public class Ajedrez {

    static void mostrarTablero(char[][] tablero) {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // En el propio ARRAY
    static void inicializarTablero(char[][] tablero) {
        char[] fila0 = { 't', 'c', 'a', 'd', 'r', 'a', 'c', 't' };
        char[] fila8 = { 'T', 'C', 'A', 'D', 'R', 'A', 'C', 'T' };
        tablero[0] = fila0;
        tablero[7] = fila8;

        for (int i = 1; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if (i == 1) {
                    tablero[i][j] = 'p';
                } else if (i > 1 && i < 6) {
                    tablero[i][j] = '·';
                }
                if (i == 6) {
                    tablero[i][j] = 'P';
                }
            }
        }
        mostrarTablero(tablero);
    }

    static void mostrarTableroColoresCasillas(char[][] tablero) {

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if ((i + j) % 2 == 0) {
                    tablero[i][j] = 'B';
                } else {
                    tablero[i][j] = 'N';
                }
            }
        }

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        char[][] tablero = new char[8][8];
        inicializarTablero(tablero);
    }
}
