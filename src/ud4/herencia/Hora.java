package ud4.herencia;

public class Hora {

    private int hora;
    private int minuto;

    public Hora(int hora, int minutos) {
        setHora(hora);
        setMinuto(minutos);
    }

    public Hora() {
    }

    public void inc() {
        minuto++;

        if (minuto == 60) {
            hora++;
            minuto = 0;
        }
        if (hora == 24) {
            hora = 0;
        }
    }

    public boolean setMinuto(int minutos) {
        if (minutos >= 0 && minutos <= 59) {
            this.minuto = minutos;
            return true;
        } else {
            return false;
        }
    }

    public boolean setHora(int hora) {
        if (hora >= 0 && hora <= 23) {
            this.hora = hora;
            return true;
        } else {
            return false;
        }
    }



    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + hora;
        result = prime * result + minuto;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Hora other = (Hora) obj;
        if (hora != other.hora)
            return false;
        if (minuto != other.minuto)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d", hora, minuto);
    }

    public static void main(String[] args) {
        Hora tiempo = new Hora(23, 59);
        System.out.println(tiempo);
        tiempo.inc();
        System.out.println(tiempo);

        HoraExacta tiempo2 = new HoraExacta(12, 35, 58);

        System.out.println(tiempo2);
        tiempo2.inc();
        System.out.println(tiempo2);
    }

}
