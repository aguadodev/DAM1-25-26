package ud4.interfaces;

import java.util.Arrays;
import java.util.Comparator;

public class Socio implements Comparable {
    int id;
    String nombre;
    String fechaSocio;
    int edad;


    public Socio(int id, String nombre, int edad, String fechaSocio) {
        this.id = id;
        this.nombre = nombre;
        this.fechaSocio = fechaSocio;
        this.edad = edad;
    }


    
    @Override
    public String toString() {
        return "Socio [id=" + id + ", nombre=" + nombre + ", edad=" + edad + ", fechaSocio=" + fechaSocio + "]";
    }



    @Override
    public int compareTo(Object o) {
        Socio otroSocio = (Socio) o;
        return id - otroSocio.id;
    }

    public static void main(String[] args) {
        Socio s1 = new Socio (3, "Anselmo", 24, "11-07-2002");
        Socio s2 = new Socio(1, "Josefa", 24, "21-11-2001");
        int resultado = s1.compareTo(s2);
        System.out.println(resultado);
        resultado = s2.compareTo(s1);
        System.out.println(resultado);  
        Socio s3 = new Socio(1, "Pepe", 20, "21-11-2001");
        resultado = s2.compareTo(s3);
        System.out.println(resultado);

        Socio[] socios = {s1, s2, s3};

        ComparaEdades comparadorPorEdades = new ComparaEdades();
        Arrays.sort(socios, comparadorPorEdades);

        Comparator<Socio> comparadorPorNombre = new Comparator<>() {
            @Override
            public int compare(Socio socio1, Socio socio2) {          
                return socio1.nombre.compareTo(socio2.nombre);
            }
        };

        Arrays.sort(socios, comparadorPorEdades.thenComparing(comparadorPorNombre.reversed()));

        Arrays.sort(socios, new Comparator<Socio>() {
            @Override
            public int compare(Socio o1, Socio o2) {
                return o1.fechaSocio.compareTo(o2.fechaSocio);
            }
        }.reversed() );

        for (Socio socio : socios) {
            System.out.println(socio);            
        }
    }

}
