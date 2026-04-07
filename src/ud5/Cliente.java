package ud5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

// Clase Cliente para ejemplos posteriores.
public class Cliente implements Comparable<Cliente>{
    String dni;
    String nombre;
    LocalDate fechaNacimiento;
    
    public Cliente(String dni, String nombre, String fechaNacimiento) {
        this.dni = dni;
        this.nombre = nombre;
        DateTimeFormatter formatoFechas= DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.fechaNacimiento = LocalDate.parse(fechaNacimiento, formatoFechas);
    }

    

    public Cliente(String dni) {
        this.dni = dni;
    }



    public int getEdad() {
        return (int) fechaNacimiento.until(LocalDate.now(), ChronoUnit.YEARS);
    }

    /*@Override
    public boolean equals(Object obj) {
        return dni.equals(((Cliente)obj).dni);
    }*/



    @Override
    public String toString() {
        return "DNI: " + dni + " Nombre: " + nombre + " Edad: " + (fechaNacimiento == null? "?" : getEdad());
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((dni == null) ? 0 : dni.hashCode());
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
        Cliente other = (Cliente) obj;
        if (dni == null) {
            if (other.dni != null)
                return false;
        } else if (!dni.equals(other.dni))
            return false;
        return true;
    }

    @Override
    public int compareTo(Cliente o) {
        return o.dni.compareTo(dni);
    }
}
