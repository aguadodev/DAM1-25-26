package ud3;
/**
 * @author Darío
 */

public class Ajedrez {
    public static void main(String[] args) {
        char[][] tablero = inicializarTablero();
        mostrarTableroConLeyenda(tablero);
    }

    static char[][] inicializarTablero() {
        char[][] nuevoTablero = {
            {'t', 'c', 'a', 'd', 'r', 'a', 'c', 't'},
            {'p', 'p', 'p', 'p', 'p', 'p', 'p', 'p'},
            {'-', '-', '-', '-', '-', '-', '-', '-'},
            {'-', '-', '-', '-', '-', '-', '-', '-'},
            {'-', '-', '-', '-', '-', '-', '-', '-'},
            {'-', '-', '-', '-', '-', '-', '-', '-'},
            {'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P'},
            {'T', 'C', 'A', 'D', 'R', 'A', 'C', 'T'}
        };

        return nuevoTablero;
    }
    
    static void mostrarTablero(char[][] t) {
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                System.out.print(t[i][j]);
                System.out.print(' ');
            }
            System.out.println();
        }
    }

    static void mostrarTableroConLeyenda(char[][] t) {
        System.out.println("  A B C D E F G H");
        for (int i = 0; i < t.length; i++) {
            System.out.print(8-i+" ");
            for (int j = 0; j < t[i].length; j++) {
                System.out.print(t[i][j]);
                System.out.print(' ');
            }
            
            System.out.print("" + (8-i));
            System.out.println();
        }
        System.out.println("  a b c d e f g h");
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
