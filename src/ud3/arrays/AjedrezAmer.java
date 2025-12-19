package ud3.matrices;
/**
 * @author AmerCz.
 */
public class Ajedrez {
    public static void main(String[] args) {
        char[][] tablero = inicializarTablero();
        // mostrarTablero(tablero);

        mostrarTableroConLeyenda(tablero);
    }

    static char[][] inicializarTablero() {
        char[][] nuevoTablero = {
                { 't', 'c', 'a', 'd', 'r', 'a', 'c', 't' },
                { 'p', 'p', 'p', 'p', 'p', 'p', 'p', 'p' },
                { '-', '-', '-', '-', '-', '-', '-', '-' },
                { '-', '-', '-', '-', '-', '-', '-', '-' },
                { '-', '-', '-', '-', '-', '-', '-', '-' },
                { '-', '-', '-', '-', '-', '-', '-', '-' },
                { 'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P' },
                { 'T', 'C', 'A', 'D', 'R', 'A', 'C', 'T' }
        };

        return nuevoTablero;
    }

    static void mostrarTablero(char[][] t) {
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                System.out.print(t[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void mostrarTableroConLeyenda(char[][] t) {

        int contador = 8;

        for (int i = 0; i < t.length; i++) {
            System.out.print(contador + " ");
            contador--;
            for (int j = 0; j < t.length; j++) {
                System.out.print(t[i][j]);
                System.out.print(" ");
            }
            System.out.println();

        }

        System.out.print("  ");

        for (char j2 = 'A'; j2 <= 'H'; j2++) {
            System.out.print(j2 + " ");
        }

    }

    static void mostrarTableroColoresCasillas(char[][] t) {
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                if ((i + j) % 2 == 0)
                    t[i][j] = 'B';
                else
                    t[i][j] = 'N';
            }
        }

        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                System.out.print(t[i][j] + " ");
            }
            System.out.println();
        }
    }

}
