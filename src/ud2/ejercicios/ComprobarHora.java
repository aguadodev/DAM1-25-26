package ud2.ejercicios;
/*
ComprobarHora. La siguiente función comprueba si una hora que se le pasa como parámetro es o no correcta. 

static void compruebaHora(int hora, int minutos, int segundos);

Implementa la función y úsala en un programa.

 */
public class ComprobarHora {


    static boolean esHoraValida(int hora, int minutos, int segundos) {
        return hora >= 0 && hora <= 23 && minutos >= 0 && minutos <= 59 && segundos >= 0
                && segundos <= 59;
    }    

    static void compruebaHoraPrint(int hora, int minutos, int segundos) {
        boolean horaCorrecta = hora >= 0 && hora <= 23 && minutos >= 0 && minutos <= 59 && segundos >= 0
                && segundos <= 59;
        if (horaCorrecta) {
            // es correcta
            System.out.println("Hora correcta");
        } else {
            // no es correcta
            System.out.println("Hora incorrecta");
        }
    }


    static int sumar (int a, int b) {
        int suma = a + b;
        return suma;
    }

    public static void main(String[] args) {
        if (esHoraValida(0, 59, 0)) {
            System.out.println("Hora correcta");
        } else {
            System.out.println("Hora incorrecta");
        }

        System.out.println(sumar(45, 56));
        
    }

}
