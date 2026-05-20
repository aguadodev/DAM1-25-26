package ud6.practicas;

import java.io.Serializable;
import java.time.LocalDate;

public class Entrenamiento implements Serializable {

    String deportista;
    LocalDate fecha;
    int km;
    
    public Entrenamiento(String nombre, LocalDate fecha, int km) {
        this.deportista = nombre;
        this.fecha = fecha;
        this.km = km;
    }

    @Override
    public String toString() {
        return fecha + " - " + deportista + " (" + km + " km)";
    }

}
