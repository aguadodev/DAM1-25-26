package ud3.strings;

public class E0607 {
    public static void main(String[] args) {
        String texto = """
                                La programación es el proceso de crear un conjunto de instrucciones que le dicen a una computadora como realizar algún tipo de tarea. Pero no solo la acción de escribir un código para que la computadora o el software lo ejecute. Incluye, además, todas las tareas necesarias para que el código funcione correctamente y cumpla el objetivo para el cual se escribió.[1]​

                En la actualidad, la noción de programación se encuentra muy asociada a la creación de aplicaciones de informática y videojuegos. En este sentido, es el proceso por el cual una persona desarrolla un programa, valiéndose de una herramienta que le permita escribir el código (el cual puede estar en uno o varios lenguajes, como C++, Java y Python, entre muchos otros) y de otra que sea capaz de “traducirlo” a lo que se conoce como lenguaje de máquina, que puede "comprender" el microprocesador.[2]​
                                """;

        System.out.println(contarOcurrencias(texto, "Programación"));

    }

    static int contarOcurrencias(String frase, String palabra) {
        int contador = 0;

        //...
        
        return contador;
    }
}
