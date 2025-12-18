package ud3.arrays;

public class Ajedrez {
    public static void main(String[] args) {
        char[][] tablero = inicializarTablero();
        mostrarTablero(tablero);
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

    void mostrarTableroConLeyenda(char[][] t) {
        
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
    
    





    /*
    MÉTODOS ADICIONALES
     */

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
                    tablero[i][j] = '-';
                }
                if (i == 6) {
                    tablero[i][j] = 'P';
                }
            }
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
