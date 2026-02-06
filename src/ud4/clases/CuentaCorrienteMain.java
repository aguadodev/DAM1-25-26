package ud4.clases;

public class CuentaCorrienteMain {
    public static void main(String[] args) {


        CuentaCorriente cc = new CuentaCorriente("11111111A", "Paco", 200);

        cc.mostrar();

        cc.setGestor(new Gestor("Ana", "666666666"));

        cc.mostrar();


        cc.setNombreTitular("Paquete");
        cc.setDni("88888888D");
        // cc.saldo = 5000;

        CuentaCorriente cc1 = new CuentaCorriente("55555555X", "Pepe");

        cc1.mostrar();

        cc1.ingresarDinero(100);

        cc1.mostrar();

        double importe = 50;
        if (cc1.sacarDinero(importe))
            System.out.println("Has sacado " + importe + " euros");
        else 
            System.out.println("No hay saldo suficiente");

        cc1.mostrar();

    }
}
