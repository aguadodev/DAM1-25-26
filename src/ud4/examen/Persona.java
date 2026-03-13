package ud4.examen;

import java.time.LocalDate;
import java.time.Period;

public class Persona implements Comparable {
    /*
    * ATRIBUTOS
    */
    private String dni;
    private String nombre;
    private LocalDate fechaNacimiento;
    
    /*
    * CONTRUCTOR
     */
    public Persona(String dni, String nombre, LocalDate fechaNacimiento) {
        if (dni == null || dni == "" || nombre == null || nombre == "")
            throw new IllegalArgumentException();
        this.dni = dni;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    /*
    * GETTERS
     */
    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public int getEdad() {
        return Period.between(fechaNacimiento, LocalDate.now()).getYears();
    }

    /*
    * OVERRIDES
     */
    @Override
    public String toString() {
        return nombre;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Persona other = (Persona) obj;
        if (dni == null) {
            if (other.dni != null)
                return false;
        } else if (!dni.equals(other.dni))
            return false;
        return true;
    }

    @Override
    public int compareTo(Object o) {
        Persona p = (Persona) o;
        return nombre.compareTo(p.nombre);
    }

    

    



    



    

    

}
