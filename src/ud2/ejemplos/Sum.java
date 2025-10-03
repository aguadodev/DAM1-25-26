package ud2.ejemplos;
/*
 * Programa de ejemplo que acepta 2 parámetros por consola, comprueba que se trate de números enteros y muestra la suma.
 * 
 * Para ejecutarlo, una vez compilado, habrá que utilizar el programa java.exe del JDK adecuado. 
 * Por defecto, el terminal de vscode utiliza la MVJ instalada en el sistema que puede ser distinta a la usada para compilar.
 * Si la versión de la MVJ del sistema es anterior a la del JDK que se usó para compilar dará el siguiente error:
 * "Error: LinkageError occurred while loading main class Sum
        java.lang.UnsupportedClassVersionError: Sum has been compiled by a more recent version of the Java Runtime"
 * Si se ejecuta sin argumentos dará una Excepción ArrayIndexOutOfBoundsException ala cceder al array args[]. 
 * Si no se indica la ruta de paquete adecuada también dará error:
 * Error: Could not find or load main class Sum
          Caused by: java.lang.NoClassDefFoundError: Sum (wrong name: ud2/ejemplos/Sum)
 * Finalmente, desde el terminal vscode podemos ejecutar el programa escribiendo el siguiente comando desde la carpeta "bin" del proyecto:
 * 
 * D:\Oscar\Portable\jdk-25\bin\java.exe ud2.ejemplos.Sum 5 6
 */
public class Sum {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;

        try {
            a = Integer.parseInt(args[0]);
            b = Integer.parseInt(args[1]);

        } catch (NumberFormatException ex) {

            System.out.println("One of the arguments are not number." + "Program exits.");

            return;
        }

        int sum = a + b;

        System.out.println("Sum = " + sum);
    }
}