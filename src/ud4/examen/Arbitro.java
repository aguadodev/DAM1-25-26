package ud4.examen;

public class Arbitro extends Persona{

    public Arbitro(String dni, String nombre) {
        super(dni, nombre, null);
    }

    public String getNumeroColegiado() {
        String str = getNombre().split(" ")[0];
        str += getDni().substring(getDni().length() - 4, getDni().length() - 1);
        return str;
    }

    @Override
    public String toString() {
        return getNumeroColegiado();
    }



    


}
