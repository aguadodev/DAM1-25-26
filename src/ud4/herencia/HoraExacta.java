package ud4.herencia;

public class HoraExacta extends Hora {

    private int segundo;

    public HoraExacta(int hora, int minutos, int segundos) {
        super(hora, minutos);
        setSegundo(segundos);
    }

    public boolean setSegundo(int segundo) {
        if (segundo >= 0 && segundo <= 59) {
            this.segundo = segundo;
            return true;
        }
        return false;
    }

    public void inc() {
        segundo++;
        if (segundo == 60) {
            super.inc();
            segundo = 0;
        }
    }

    @Override
    public String toString() {
        return String.format("%s:%02d", super.toString(), segundo);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + segundo;
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
        HoraExacta other = (HoraExacta) obj;
        if (segundo != other.segundo)
            return false;
        return super.equals(obj);
    }    
}
