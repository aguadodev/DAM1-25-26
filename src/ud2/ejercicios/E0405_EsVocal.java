package ud2.ejercicios;

/*
 * E0405_EsVocal. Crear una función que devuelva un valor booleano que indique si el carácter que se le pasa como parámetro de entrada corresponde a una vocal. 

Cómo se pueden gestionar también las minúsculas, mayúsculas, acentos y diéresis?

 */
public class E0405_EsVocal {

    static boolean esVocal(char caracter) {
        boolean esVocal = false;
        switch (caracter) {
            case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U',
            'á', 'é', 'í', 'ó', 'ú', 'Á', 'É', 'Í', 'Ó', 'Ú': 
            esVocal = true;    
        }

        return esVocal;

/* Solución con switch como expresión
        return switch (caracter) {
            case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U', 'á', 'é', 'í', 'ó', 'ú', 'Á', 'É', 'Í', 'Ó', 'Ú' -> {
                yield true;
            }
            default -> {
                yield false;
            }
        }; 
 */

    }

    public static void main(String[] args) {
        char letra = 65;
        System.out.println(esVocal(letra));
        System.out.println(esVocal('a'));
        System.out.println(esVocal('b'));
        System.out.println(esVocal('á'));
    }
}
