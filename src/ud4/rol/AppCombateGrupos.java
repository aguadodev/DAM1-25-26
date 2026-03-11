package ud4.rol;

import java.util.Arrays;
import java.util.Comparator;

public class AppCombateGrupos {
    public static void main(String[] args) {
        
        // Tu equipo
        Personaje[] equipoA = {
            new Personaje("A-1"),
            new Personaje("A-2"),
            new Personaje("A-3"),
        };

        // Otro equipo
        Personaje[] equipoB = {
            new Personaje("B-1"),
            new Personaje("B-2"),
            new Personaje("B-3"),
        };        
        // Presentar equipos
        System.out.println("EQUIPO A");
        imprimirEquipo(equipoA);
        System.out.println("EQUIPO B");
        imprimirEquipo(equipoB);

        /*
        REGLAS DE COMBATE
        - Los personajes vivos atacan por orden de agilidad
        - Por defecto, un personaje atacará al personaje con menos PV del otro equipo
        - Luego, se podrán elegir otras estrategias.
        - El juego termina cuando todos los personajes de un equipo han muerto
         */

        // COMPARADORES            
        Comparator<Personaje> comparadorAgilidadDesc = new Comparator<>() {
            @Override
            public int compare(Personaje o1, Personaje o2) {
                return o2.getAgilidad() - o1.getAgilidad();
            }
        }; 

        // 1. Organizar orden de ataque
        // Metemos a todos los personajes en un único array y lo ordenamos descendentemente por agilidad
        Personaje[] todos = new Personaje[equipoA.length + equipoB.length];
        for (int i = 0; i < todos.length; i++) {
            if (i < equipoA.length) 
                todos[i] = equipoA[i];
            else
                todos[i] = equipoB[i-equipoA.length];
        }
       
        Arrays.sort(todos, comparadorAgilidadDesc);

        // Inicialmente el turno corresponde al personaje en la primera posición
        int turno = 0;

        // 2. Turnos de combate
        // Cada pasada del bucle se produce un ataque
        while(alguienVive(equipoA) && alguienVive(equipoB)) {
            // Ataca el personaje que tiene el turno
            // Si está vivo
            Personaje pConTurno = todos[turno];
            if (pConTurno.estaVivo()) {
                // Comprobamos en qué equipo está
                if (pertenece(pConTurno, equipoA))
                    // Ataca al equipoB
                    atacar(pConTurno, equipoB);        
                else
                    // Ataca al equipoA
                    atacar(pConTurno, equipoA);
            }
            // Pasamos el turno al siguiente
            turno = (turno + 1) % todos.length;
        }

        // 3. Muestra equipo Ganador
        if (alguienVive(equipoA))
            System.out.println("Ganador el equipo A");
        else        
            System.out.println("Ganador el equipo B");
    }

    private static void atacar(Personaje pConTurno, Personaje[] equipo) {
        // Ataca al personaje vivo del otro equipo con menos puntos de vida
        // En el futuro se puede establecer otra estrategia                
        Comparator<Personaje> comparadorPV = new Comparator<>() {
            @Override
            public int compare(Personaje o1, Personaje o2) {
                return o1.getPv() - o2.getPv();
            }
        };  
        Arrays.sort(equipo, comparadorPV);
        for (Personaje pAtacado : equipo) {
            if (pAtacado.estaVivo()) {
                int danho = pConTurno.atacar(pAtacado);
                if (danho > 0) {
                    System.out.println(pConTurno + " ataca a " + pAtacado + " y le quita " + danho + " PV");
                    if (!pAtacado.estaVivo()) 
                        System.out.println(pConTurno.getNombre() + " MATA A " + pAtacado.getNombre() + "!!!!!!!!!");
                } else {
                    System.out.println(pAtacado + " esquiva el ataque de " + pConTurno);
                }
                return;
            }
        }
    }

    private static boolean pertenece(Personaje p, Personaje[] equipo) {
        for (Personaje personaje : equipo)
            if (p.equals(personaje))
                return true;
        return false;
    }

    private static boolean alguienVive(Personaje[] equipo) {
        for (Personaje personaje : equipo) 
            if (personaje.estaVivo())
                return true;
        return false;
    }

    private static void imprimirEquipo(Personaje[] equipo) {
        for (Personaje personaje : equipo) {
            System.out.println(personaje.mostrar());
        }
    }
}
