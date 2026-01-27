package ud2.xxxexamenrec;

import java.util.Scanner;

public class Enquisa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contEnquisas = 0;
        int contNonCurso = 0;
        int contSiCurso = 0;
        int contCiber = 0;
        int contVidexogos = 0;
        int contIA = 0;
        int contManha = 0;
        int contTarde = 0;
        int contIndiferente = 0;

        try {

            System.out.println("Queres cubrir a enquisa?\n (0=Non 1 = Sí)");
            int opcion = sc.nextInt();

            while (opcion != 0) {
                // Cubrir unha enquisa
                System.out.println(
                        "Cando remates o ciclo superior, estarías interesad@ en continuar formándote no IES Chan do Monte facendo un Curso de Especialización?\n(0=Non 1 = Sí)");
                contEnquisas++;

                opcion = sc.nextInt();
                if (opcion == 0) {
                    // No cursará
                    contNonCurso++;
                } else if (opcion == 1) {
                    contSiCurso++;
                    // Qué curso?
                    System.out.println("Cal dos tres cursos de especialización che gustaría que ofertara o centro?");
                    System.out.println("1. Ciberseguridade en contornos das tecnoloxías da información");
                    System.out.println("2. Desenvolvemento de videoxogos e realidade virtual");
                    System.out.println("3. Intelixencia artificial e big data");
                    opcion = sc.nextInt();
                    switch (opcion) {
                        case 1:
                            contCiber++;
                            break;
                        case 2:
                            contVidexogos++;
                            break;
                        case 3:
                            contIA++;
                            break;
                        default:
                            System.out.println("Opción inválida");
                    }

                    // Qué horario?
                    System.out.println("Preferirías que as clases foran pola mañá, pola tarde ou éche indiferente?");
                    System.out.println("1. Pola mañá");
                    System.out.println("2. Pola tarde");
                    System.out.println("3. Indiferente");
                    opcion = sc.nextInt();
                    switch (opcion) {
                        case 1:
                            contManha++;
                            break;
                        case 2:
                            contTarde++;
                            break;
                        case 3:
                            contIndiferente++;
                            break;
                        default:
                            System.out.println("Opción inválida");
                    }
                } else {
                    System.out.println("Opción inválida");
                }

                // Outra enquisa?
                System.out.println("Cubrir outra enquisa?\n (0=Non 1 = Sí)");
                opcion = sc.nextInt();
            }
            sc.close();



            // Mostrar Estadísticas
            if (contEnquisas > 0) {
                System.out.println("Total de enquisas cubertas: " + contEnquisas);
                System.out.printf("Non cursará espcialización: %d (%.2f %%) %n", contNonCurso,
                        100.0 * contNonCurso / contEnquisas);
                System.out.printf("Sí cursará espcialización: %d (%.2f %%) %n", contSiCurso,
                        100.0 * contSiCurso / contEnquisas);

                System.out.println("\nCursos preferidos:");
                System.out.printf("1. Ciberseguridade: %d (%.2f %%) %n", contCiber, 100.0 * contCiber / contSiCurso);
                System.out.printf("2. Videoxogos: %d (%.2f %%) %n", contVidexogos, 100.0 * contVidexogos / contSiCurso);
                System.out.printf("3. Intelixencia artificial: %d (%.2f %%) %n", contIA, 100.0 * contIA / contSiCurso);

                System.out.println("\nHorarios preferidos:");
                System.out.printf("1. Mañá: %d (%.2f %%) %n", contManha, 100.0 * contManha / contSiCurso);
                System.out.printf("2. Tarde: %d (%.2f %%) %n", contTarde, 100.0 * contTarde / contSiCurso);
                System.out.printf("3. Indiferente: %d (%.2f %%) %n", contIndiferente,
                        100.0 * contIndiferente / contSiCurso);

            } else {
                System.out.println("Non se cubríu ningunha enquisa");
            }

        } catch (Exception e) {
            System.out.println("Erro de entrada. Terminando Programa...");
        }
    }
}
