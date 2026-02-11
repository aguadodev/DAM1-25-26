package ud4.alumnado;

public class ModulosFaltas {
    public static void main(String[] args) {
        Modulo[] modulos = Modulo.cargarFichero("DATOS - Módulos.csv");

        System.out.printf("%73s \t %s \t %s \t %s %n", "Módulo", "Ses", "6%", "4%");
        System.out.println("====================================================================================================");
        for (Modulo modulo : modulos) {
            System.out.printf("%73s \t %.1f \t %.1f%% \t %.1f%% %n", 
            modulo.nombre,
            modulo.getSesiones(),
            modulo.getPorcentajeFaltas(6),
            modulo.getPorcentajeFaltas(4));
        }
        
    }
}
