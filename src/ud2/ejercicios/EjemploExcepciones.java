package ud2.ejercicios;

import java.util.Scanner;

public class EjemploExcepciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        try {
            numero = sc.nextInt();
            System.out.println(numero);
            sc.close();
            
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Error en la entrada. Escribe número int.");
        }
        

        
    }
}
