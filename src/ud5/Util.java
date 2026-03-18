package ud5;

import ud4.rol.Personaje;

public class Util {

static <U> int numeroDeNulos(U[] tabla) {
    int cont = 0;
    for (U e : tabla)
        if (e == null)
            cont++;
    return cont;
}

static int numeroDeNulos(Integer[] tabla) {
    int cont = 0;
    for (Integer e : tabla)
        if (e == null)
            cont++;
    return cont;
}

static int numeroDeNulos(Personaje[] tabla) {
    int cont = 0;
    for (Personaje e : tabla)
        if (e == null)
            cont++;
    return cont;
}



}
