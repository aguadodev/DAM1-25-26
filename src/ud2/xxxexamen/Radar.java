package ud2.xxxexamen;

import java.util.Scanner;

public class Radar {

    public static void main(String[] args) {
        try {
            int contCoches = 0;
            int contMultas = 0;
            double velocidadMediaTotal = 0;
            double sumaVelocidadesMedias = 0;
            double velocidadMaximaTotal = 0;
            Scanner sc = new Scanner(System.in);
            System.out.println("Radar de control de velocidad de tramo");
            System.out.println("--------------------------------------");
            System.out.print("Distancia del tramo (km): ");
            int distancia = sc.nextInt();
            System.out.print("Velocidad máxima permitida (km/h): ");
            int velocidadMaximaPermitida = sc.nextInt();
            System.out.println("Introduce los tiempos en segundos en recorrer el tramo (0 o negativo para terminar):");

            // Lectura anticipada
            int segundos = sc.nextInt();
            while (segundos > 0) {
                // Procesar tiempo
                contCoches++;
                double velocidadMedia = distancia / (segundos / 3600.);
                System.out.printf("Velocidad media: %.2f km/h %n", velocidadMedia);
                if (velocidadMedia > velocidadMaximaPermitida * 1.2) {
                    System.out.println("Multa grave con retirada de puntos");
                    contMultas++;
                } else if (velocidadMedia > velocidadMaximaPermitida) {
                    System.out.println("Multa por exceso de velocidad");
                    contMultas++;
                } else {
                    System.out.println("Dentro del límite de velocidad");
                }

                // Actualizar Velocidad Máxima registrada?
                if (velocidadMedia > velocidadMaximaTotal) {
                    velocidadMaximaTotal = velocidadMedia;
                }

                // Sumar velocidades para la media
                sumaVelocidadesMedias += velocidadMedia;

                // Nueva lectura
                segundos = sc.nextInt();
            }

            sc.close();

            if (contCoches > 0) {
                velocidadMediaTotal = sumaVelocidadesMedias / contCoches;
                System.out.println("Estadísticas finales:");
                System.out.println("---------------------");
                System.out.println("Total de coches controlados: " + contCoches);
                System.out.printf("Velocidad media de todos los coches: %.2f km/h %n", velocidadMediaTotal);
                System.out.printf("Velocidad máxima registrada: %.2f km/h %n", velocidadMaximaTotal);
                System.out.println("Total de multas impuestas: " + contMultas);
            }

        } catch (Exception e) {
            System.out.println("Error en el programa. Fin.");
        }

    }

}
