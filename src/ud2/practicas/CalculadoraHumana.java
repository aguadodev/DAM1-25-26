package ud2.practicas;

import java.util.Random;
import java.util.Scanner;

import ud2.Util;

public class CalculadoraHumana {

    /** Inicia el juego y muestra el bucle principal del programa */
    public static void main(String[] args) {
        final int MAX_ACIERTOS = 7; // Número de aciertos para ganar
        final int MAX_NUM = 200; // Número más alto que puede salir en el juego, como resultado o como operando
        int aciertos = 0;
        int operando1, operando2;

        mostrarInstrucciones();

        operando1 = generarAleatorio(MAX_NUM);
        int resultado = generarOperacion(operando1);
        int resultadoUsuario = pedirResultado();

        while (resultado == resultadoUsuario) {
            aciertos++;
            // Sigue jugando
            operando1 = resultado;
            resultado = generarOperacion(operando1);
            resultadoUsuario = pedirResultado();
        }

        if (aciertos >= MAX_ACIERTOS) {
            System.out.println("Enhorabuena!! Has conseguido " + aciertos + " aciertos");
        } else {
            System.out.println("No conseguiste los " + MAX_ACIERTOS + " aciertos necesarios");
        }

    }

    private static int generarOperacion(int operando1) {
        boolean operadorValido = false;

        do {
        int operador = generarAleatorio(4);
        switch (operador) {
            case 1: // Suma
                if (operando1 < 150) {
                    operadorValido = true;
                    // generar operando 2 para sumar

                }
                break;
            case 2: // Resta
                if (operando1 >= 50) {
                    operadorValido = true;
                    // generar operando 2 para restar
                }
                break;
            case 3: // Multiplicación
                if (operando1 < 20) {
                    operadorValido = true;
                    // generar operando 2 para multiplicar
                }              
                break;
            case 4: // División
                if (operando1 > 50 && !Util.esPrimo(operando1)) {
                    operadorValido = true;
                    // generar operando 2 para dividir
                }               
                break;
        }
    } while (!operadorValido);        


    }

    private static int pedirResultado() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    /**
     * Genera un número aleatorio entre 1 y max inclusives
     * 
     * @param max
     * @return Un número aleatorio
     */
    private static int generarAleatorio(int max) {
        Random random = new Random();
        return random.nextInt(max) + 1;
    }

    private static void mostrarInstrucciones() {
        System.out.println("Resuelve las operaciones: ");
        System.out.println();
    }

}
