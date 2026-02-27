
package ud4.herencia.orquesta;

// Clase abstracta Instrumento 
abstract class Instrumento {
    protected Nota[] melodia;
    protected int numNotas;
    protected int MAX_NUM_NOTAS = 100;

    public Instrumento() {
        melodia = new Nota[MAX_NUM_NOTAS]; 
        numNotas = 0;
    }

    public void add(Nota n) {
        if (numNotas < MAX_NUM_NOTAS) {
            melodia[numNotas] = n;
            numNotas++;
        }
    }

    public abstract void interpretar();
}

// Subclase Piano
class Piano extends Instrumento {
    @Override
    public void interpretar() {
        System.out.print("Piano interpreta: ");
        for (int i = 0; i < numNotas; i++) {
            System.out.print(melodia[i] + " ");
        }
        System.out.println();
    }
}

// Subclase Guitarra 
class Guitarra extends Instrumento {
    @Override
    public void interpretar() {
        System.out.print("Guitarra interpreta: ");
        for (int i = 0; i < numNotas; i++) {
            System.out.print(melodia[i] + " ");
        }
        System.out.println();
    }
}

// Subclase Flauta 
class Flauta extends Instrumento {
    @Override
    public void interpretar() {
        System.out.print("Flauta interpreta: ");
        for (int i = 0; i < numNotas; i++) {
            System.out.print(melodia[i] + " ");
        }
        System.out.println();
    }
}

// Programa principal
public class Orquesta {
    public static void main(String[] args) {

        Instrumento piano = new Piano();
        piano.add(Nota.DO);
        piano.add(Nota.MI);
        piano.add(Nota.SOL);

        Instrumento guitarra = new Guitarra();
        guitarra.add(Nota.MI);
        guitarra.add(Nota.SOL);
        guitarra.add(Nota.SI);

        Instrumento flauta = new Flauta();
        flauta.add(Nota.DO);
        flauta.add(Nota.RE);
        flauta.add(Nota.MI);

        // Crear la orquesta (colección de instrumentos)
        Instrumento[] orquesta = { piano, guitarra, flauta };

        System.out.println("--- INICIO DEL CONCIERTO ---");
        for (Instrumento inst : orquesta) {
            inst.interpretar();
        }
    }
}