package ud2.practicas;

import java.util.Random;
import java.util.Scanner;

import ud2.Util;

public class CalculadoraHumana {
    static Scanner sc = new Scanner(System.in);
    static final int MAX_NUM = 500; // Número más alto que puede salir en el juego, como resultado o como operando

    /** Inicia el juego y muestra el bucle principal del programa */
    public static void main(String[] args) {
        final int MAX_ACIERTOS = 7; // Número de aciertos para ganar
        int aciertos = 0;
        int operando1;

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

        sc.close();
    }
    /**
     * Imprime la operación válida generada
     * Devuelve el resultado que deberá acertar el usuario.
     * @param operando1
     * @return
     */
    private static int generarOperacion(int operando1) {
        int resultado = 0;
        boolean operadorValido = false;

        do {
        int operador = generarAleatorio(4);
        switch (operador) {
            case 1: // Suma
                if (operando1 < 150) {
                    operadorValido = true;
                    // generar operando 2 para sumar
                    int operando2 = 10 + generarAleatorio(MAX_NUM - 10 - operando1);
                    System.out.print(operando1 + " + " + operando2 + " = ");
                    resultado = operando1 + operando2; 
                }
                break;
            case 2: // Resta
                if (operando1 >= 50) {
                    operadorValido = true;
                    // generar operando 2 para restar
                    int operando2 = 5 + generarAleatorio(operando1 - 10);                    
                    System.out.print(operando1 + " - " + operando2 + " = ");
                    resultado = operando1 - operando2;
                }
                break;
            case 3: // Multiplicación
                if (operando1 < 20) {
                    operadorValido = true;
                    // generar operando 2 para multiplicar
                    int operando2 = generarAleatorio(MAX_NUM / operando1);  
                    resultado = operando1 * operando2;                    
                    System.out.print(operando1 + " * " + operando2 + " = ");
                }              
                break;
            case 4: // División
                if (operando1 > 50 && !Util.esPrimo(operando1)) {
                    operadorValido = true;
                    // generar operando 2 para dividir
                    int operando2;
                    do {
                        operando2 = 1 + generarAleatorio(operando1 / 2);  
                    } while (operando1 % operando2 != 0);
                    
                    resultado = operando1 / operando2;                    
                    System.out.print(operando1 + " / " + operando2 + " = ");                    
                }               
                break;
        }
    } while (!operadorValido);        

    return resultado;
    }

    private static int pedirResultado() {       
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
