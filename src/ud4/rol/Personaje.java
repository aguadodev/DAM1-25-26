package ud4.rol;

public class Personaje {
    private String nombre;
    private Raza raza;
    private int fuerza;
    private int agilidad;
    private int constitucion;
    private int nivel;
    private int experiencia;
    private int pv;


    public Personaje(String nombre, Raza raza, int fuerza, int agilidad, int constitucion, int nivel, int experiencia,
            int pv) {
        if (fuerza <= 0 || agilidad <= 0 || constitucion <= 0 || nivel <= 0 || pv <= 0 || experiencia < 0 || raza == null)
            throw new IllegalArgumentException("No se puede crear el personaje: parámetros incorrectos");

        this.nombre = nombre;
        this.raza = raza;

        this.fuerza = fuerza;
        this.agilidad = agilidad;
        this.constitucion = constitucion;
        this.nivel = nivel;
        this.pv = pv;

        this.experiencia = experiencia;

    }

    public String mostrar() {
        String info = "";
        info += nombre;
        info += " (" + raza + ")";
        return info;
    }

    

}
