package ud5.colecciones;

import java.io.*;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Socio implements Comparable<Socio> {

    // Atributos
    private String dni;
    private String nombre;
    private LocalDate fechaAlta;

    // Constructor
    public Socio(String dni, String nombre, LocalDate fechaAlta) {
        this.dni = dni;
        this.nombre = nombre;
        this.fechaAlta = fechaAlta;
    }

    // Getters y setters
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(LocalDate fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    // Método antigüedad (en años)
    public int antiguedad() {
        return Period.between(fechaAlta, LocalDate.now()).getYears();
    }

    // equals basado en dni
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Socio)) return false;
        Socio socio = (Socio) obj;
        return Objects.equals(dni, socio.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni);
    }

    // Comparable basado en dni
    @Override
    public int compareTo(Socio otro) {
        return this.dni.compareTo(otro.dni);
    }

    // toString
    @Override
    public String toString() {
        return dni + "," + nombre + "," + fechaAlta;
    }

    // =========================
    // MÉTODOS ESTÁTICOS CSV
    // =========================

    // Cargar socios desde CSV
    public static List<Socio> cargarDesdeCSV(String fichero) {
        List<Socio> lista = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fichero))) {
            String linea;

            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");

                String dni = partes[0];
                String nombre = partes[1];
                LocalDate fechaAlta = LocalDate.parse(partes[2]);

                lista.add(new Socio(dni, nombre, fechaAlta));
            }

        } catch (IOException e) {
            System.out.println("Error al leer fichero: " + e.getMessage());
        }

        return lista;
    }

    // Guardar socios en CSV
    public static void guardarEnCSV(String fichero, List<Socio> socios) {

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fichero))) {

            for (Socio s : socios) {
                bw.write(s.toString());
                bw.newLine();
            }

        } catch (IOException e) {
            System.out.println("Error al escribir fichero: " + e.getMessage());
        }
    }
}
