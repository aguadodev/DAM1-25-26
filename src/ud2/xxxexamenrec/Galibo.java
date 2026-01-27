package ud2.xxxexamenrec;

import java.util.Scanner;

public class Galibo {
    public static void main(String[] args) {
        int maximaAlturaTotal = 800;
        System.out.println(
                "Gálibo. Introduce número de puentes (máximo 100), número de carriles de cada uno (máximo 5) y altura de cada carril (entre 200 y 800).");
        Scanner sc = new Scanner(System.in);

        int numPuentes = sc.nextInt();

        if (numPuentes > 0 && numPuentes <= 100) {
            for (int i = 0; i < numPuentes; i++) {
                // Para cada puente calculo la altura máxima con que lo puedo atravesar
                int maximaAlturaPuente = 200;
                int numCarriles = sc.nextInt();
                if (numCarriles > 0 && numCarriles <= 5) {
                    for (int j = 0; j < numCarriles; j++) {
                        int altura = sc.nextInt();
                        if (altura >= 200 && altura <= 800) {
                            // Actualizo la altura máxima hasta el momento
                            if (altura > maximaAlturaPuente)
                                maximaAlturaPuente = altura;
                        } else {
                            System.out.println("Altura incorrecta");
                            return;
                        }
                    }
                } else {
                    System.out.println("Número de carriles incorrecto");
                    return;
                }

                // Actualizar la altura total si está limitada por este puente.
                if (maximaAlturaPuente < maximaAlturaTotal)
                    maximaAlturaTotal = maximaAlturaPuente;


            }

            System.out.println(maximaAlturaTotal);

        } else {
            System.out.println("Número de puentes incorrecto");
            return;
        }        
        sc.close();
    }
}
