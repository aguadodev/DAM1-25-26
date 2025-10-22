package ud2.ejercicios;

public class TresSaludosLlamadaDesdeOtraClase {
    public static void main(String[] args) {
        // Podemos invocar el método estático tresSaludos() desde el mismo paquete sin necesidad de importar la clase
        TresSaludosFuncion.tresSaludos();
    }
}
