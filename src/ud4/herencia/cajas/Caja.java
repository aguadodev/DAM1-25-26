package ud4.herencia.cajas;

public class Caja {
    /**
     * @author dario
     */
    int ancho;
    int alto;
    int fondo;
    Unidad unidad;
    String etiqueta;

    public Caja(int ancho, int alto, int fondo, Unidad unidad) {
        // @TODO Validar dimensiones correctas > 0
        // @TODO Validar Unidad válida (!null)
        // Lanzar excepción?
        this.ancho = ancho;
        this.alto = alto;
        this.fondo = fondo;
        this.unidad = unidad;
    }

    public double getVolumen() {
        if (this.unidad == Unidad.CM) {
            ancho = ancho / 100;
            alto = alto / 100;
            fondo = fondo / 100;
        }
        return ancho * alto * fondo;
    }

    public void setEtiqueta(String etiqueta) {
        // @TODO Lanzar Excepción si la etiqueta no es válida?
        if (etiqueta.length() <= 30) {
            this.etiqueta = etiqueta;
        }
    }

    @Override
    public String toString() {
        // @ Detallar: No mostrar etiquetas = null
        return "Caja [ancho=" + ancho + ", alto=" + alto + ", fondo=" + fondo + ", unidad=" + unidad + ", etiqueta="
                + etiqueta + "]";
    }

}
