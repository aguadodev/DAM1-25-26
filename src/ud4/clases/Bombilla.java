package ud4.clases;

public class Bombilla {
    private boolean interruptor;

    private static boolean interruptorGeneral;
    
    boolean estaEncendida() {
        return interruptor && interruptorGeneral;
    }

    boolean getInterruptor() {
        return interruptor;
    }

    void encender() {
        interruptor = true;
    }

    void apagar() {
        interruptor = false;
    }

    static void encenderInterruptorGeneral() {
        interruptorGeneral = true;
    }

    static void apagarInterruptorGeneral() {
        interruptorGeneral = false;
    }    

    static boolean interruptorGeneralEncendido() {
        return interruptorGeneral;
    }

    public static void main(String[] args) {
        Bombilla b1 = new Bombilla();

        b1.encender();
        Bombilla.encenderInterruptorGeneral();
        
        System.out.println("Interruptor General encendido?: " + Bombilla.interruptorGeneralEncendido());      
        System.out.println("Interruptor de la bombilla encendido?: " + b1.getInterruptor());        


        System.out.println("Bombilla encendida?: " + b1.estaEncendida());

    }

}
