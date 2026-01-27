package ud2.xxxexamenrec;

public class CosteViaje {

    static double costeViaje(double km, byte tipoCombustible, double consumoMedio) {
        double costeViaje = 0;

        final double GASOLINA = 1.521;
        final double DIESEL = 1.435;
        final double ELECTRICIDAD = 0.16591;

        double precio = 0;

        switch (tipoCombustible) {
            case 0:
                precio = GASOLINA;
                break;
            case 1:
                precio = DIESEL;
                break;
            case 2:
                precio = ELECTRICIDAD;
                break;
        }

        costeViaje = consumoMedio * (km / 100.0) * precio;

        return costeViaje;

    }

}
