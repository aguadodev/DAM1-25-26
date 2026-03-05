package ud4;

import ud4.herencia.Hora;
import ud4.herencia.HoraExacta;

public class AppHoras {
    public static void main(String[] args) {
        HoraExacta hora = new HoraExacta(23, 59, 59);
        System.out.println(hora);
        hora.inc();
        System.out.println(hora);
        Hora h = hora;
        h.inc();
        System.out.println(h);

        HoraExacta hora2 = new HoraExacta(0, 1, 0);
        System.out.println(hora.equals(hora2)); 

        
        Hora hora3 = new Hora(0, 1);
        System.out.println(hora2.equals(hora3));
        System.out.println(hora3.equals(hora2));
  
        
    }
}
