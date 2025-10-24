package ud2.practicas;

public class CalculadoraHumana {

    /** Inicia el juego y muestra el bucle principal del programa */
    public static void main(String[] args) {
        final int MAX_ACIERTOS = 7; // Número de aciertos para ganar
        final int MAX_NUM = 200;    // Número más alto que puede salir en el juego, como resultado o como operando
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
            generarOperacion(operando1);
            int resultadoUsuario = pedirResultado();
        }

        if (aciertos >= MAX_ACIERTOS) {
            System.out.println("Enhorabuena!!");
        } else {
            System.out.println("No conseguiste los " + MAX_ACIERTOS + " aciertos necesarios");
        }

    }



}
