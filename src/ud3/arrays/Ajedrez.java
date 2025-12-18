package ud3.arrays;

import java.util.Scanner;

public class Ajedrez {
    public static void main(String[] args) {
        char[][] tablero = inicializarTablero();
        boolean turnoBlancas = true;
        boolean fin = false;

        mostrarTableroConLeyenda(tablero);
        System.out.println(turnoBlancas ? "Turno de BLANCAS" : "Turno de NEGRAS");
        int[] mov = leerMovimiento();
        while (!fin) {
            // validarMovimiento
            mover(tablero, mov);
            turnoBlancas = !turnoBlancas;
            // comprobarJaqueOJaqueMate
            mostrarTableroConLeyenda(tablero);
            System.out.println(turnoBlancas ? "Turno de BLANCAS" : "Turno de NEGRAS");
            mov = leerMovimiento();
        }

        // Mensaje final: ganador/a o tablas

        System.out.println("Fin de la partida!");
    }

    private static void mover(char[][] tablero, int[] mov) {
        tablero[mov[2]][mov[3]] = tablero[mov[0]][mov[1]];
        tablero[mov[0]][mov[1]] = '-';
    }

    private static int[] leerMovimiento() {
        Scanner sc = new Scanner(System.in);
        Boolean entradaValida = false;
        int[] movimiento = null;
        do {
            System.out.print("Movimiento? Ejemplo \"e2 e4\"  o  \"fin\" para rendirte: ");
            String entrada = sc.nextLine();
            if (entrada.equalsIgnoreCase("fin"))
                return null;

            try {
                char columnaOrigen = entrada.charAt(0); // columnaOrigen e
                char filaOrigen = entrada.charAt(1); // filaOrigen 2
                char columnaDestino = entrada.charAt(3); // columnaDestino e
                char filaDestino = entrada.charAt(4); // filaDestino 4

                int cOrigen = columnaOrigen - 'a';
                int fOrigen = 7 - (filaOrigen - '1');
                int cDestino = columnaDestino - 'a';
                int fDestino = 7 - (filaDestino - '1');
                
                if (cOrigen >= 0 && cOrigen < 8 
                    && fOrigen >= 0 && fOrigen < 8 
                    && cDestino >= 0 && cDestino < 8 
                    && fDestino >= 0 && fDestino < 8 
                )
                
                movimiento = new int[4];
                movimiento[0] = fOrigen;
                movimiento[1] = cOrigen;
                movimiento[2] = fDestino;
                movimiento[3] = cDestino;
                
                entradaValida = true;
    
            } catch (Exception e) {
                System.out.println("Entrada inválida");
            }


        } while (!entradaValida);        
        return movimiento;
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

    static void mostrarTableroConLeyenda(char[][] t) {
        System.out.println();

        System.out.println("    a b c d e f g h");
        System.out.println("    ---------------");
        for (int i = 0; i < t.length; i++) {
            System.out.print(8 - i + " | ");
            for (int j = 0; j < t[i].length; j++) {
                System.out.print(t[i][j]);
                System.out.print(' ');
            }

            System.out.print("| " + (8 - i));
            System.out.println();
        }
        System.out.println("    ---------------");
        System.out.println("    a b c d e f g h");

        System.out.println();
    }

    /*
     * MÉTODOS ADICIONALES
     */

    static void mostrarTablero(char[][] t) {
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                System.out.print(t[i][j]);
                System.out.print(' ');
            }
            System.out.println();
        }
    }

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

    public static void mostrarTableroConLeyenda2(char[][] t) {

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

}
