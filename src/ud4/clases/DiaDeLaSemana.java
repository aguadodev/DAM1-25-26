package ud4.clases;

import java.util.Arrays;

public enum DiaDeLaSemana {
    LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO;

    @Override
    public String toString() {
        return this.ordinal() + ". " + this.name();
    }    


    
    public static void main(String[] args) {
        DiaDeLaSemana dia = DiaDeLaSemana.LUNES;
        dia = DiaDeLaSemana.JUEVES;
        String diaStr = "MARTES";
        Integer numero = Integer.valueOf("2");
        dia = DiaDeLaSemana.valueOf(diaStr);
        System.out.println(dia.toString());
        System.out.println(dia.name());
        System.out.println(dia.ordinal());
        System.out.println(dia.compareTo(DiaDeLaSemana.DOMINGO));
        System.out.println(Arrays.toString(DiaDeLaSemana.values()));
    }
}
