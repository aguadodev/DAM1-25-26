package ud3.arrays;

import java.util.Scanner;

public class Ajedrez {
    public static void main(String[] args) {
        // Crea e inicializa el tablero
        char[][] tablero = inicializarTablero();
        // Establece el turno inicial para las piezas blancas
        boolean turnoBlancas = true;

        // Mostrar tablero y leer movimiento
        mostrarTableroConLeyenda(tablero);
        System.out.println(turnoBlancas ? "Turno de BLANCAS" : "Turno de NEGRAS");
        int[] mov = leerMovimiento(); // devuelve null si el usuario se rinde.
        while (mov != null) {
            // validarMovimiento
            if (esMovimientoValido(tablero, mov, turnoBlancas)) {
                mover(tablero, mov);
                turnoBlancas = !turnoBlancas;
                // comprobarJaqueOJaqueMateOReyAhogado   
                // Mostrar tablero y leer movimiento
                mostrarTableroConLeyenda(tablero);
                System.out.println(turnoBlancas ? "Turno de BLANCAS" : "Turno de NEGRAS");                             
            }
            
            mov = leerMovimiento();
        }

        // Mensaje final: ganador/a o tablas
        if (mov == null) {
            System.out.println("Las " + (turnoBlancas ? "Blancas":"Negras") + " se han rendido.");
            System.out.println("GANAN LAS " + (turnoBlancas ? "NEGRAS":"BLANCAS"));
        }

        System.out.println("Fin de la partida!");
    }

    /**
     * 
     * @param tablero
     * @param mov
     * @param turnoBlancas
     * @return 
     */
    private static boolean esMovimientoValido(char[][] tablero, int[] mov, boolean turnoBlancas) {
        // Suponemos que el movimiento es válido
        boolean esMovimientoValido = true;
        // Valida si la casilla de origen es del mismo color que el turno
        // Valida que la casilla de destino NO sea del mismo color que el turno
        // Valida que la pieza se pueda mover al destino según:
        // - el tipo de pieza: peón, caballo, alfil, torre, dama, rey
        // - tras el movimiento, el rey no puede quedar en jaque.
        
        return esMovimientoValido;
    }    
    
    
    /**
     * Mueve una pieza del tablero, desde la casilla de origen a la de destino
     * @param tablero Tablero de ajedrez con piezas
     * @param mov Array de 4 enteros: 
     *      - índices de fila y columna de origen
     *      - índices de fila y columna de destino
     */
    private static void mover(char[][] tablero, int[] mov) {
        tablero[mov[2]][mov[3]] = tablero[mov[0]][mov[1]];
        tablero[mov[0]][mov[1]] = '-';
    }

    
    /**
     * Solicita repetidamente al usuario por teclado el movimiento a realizar:
     *      - "e2 e4", por ejemplo, para mover una pieza
     *      - "fin" para tirar el rey y rendirse
     *  Valida la entrada de modo que las coordenadas están entre a1 y h8
     * 
     * @return Array de 4 enteros con los índices de las casillas de origen y destino
     */
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

    
    /**
     * Devuelve la referencia a un tablero con las piezas colocadas al inicio de la partida.
     * @return Array de 8x8 caracteres
     */
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

    
    /**
     * Muestra el tablero de ajedrez con la leyenda de letras y números
     * @param t Tablero
     */
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
     ***********************
     * MÉTODOS ADICIONALES *
     ***********************
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
