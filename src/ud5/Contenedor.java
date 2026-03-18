package ud5;

class Contenedor<T> {

    private T objeto; // se inicializa a null: contenedor vacío

    public Contenedor() {
    }

    void guardar(T nuevo) {
        objeto = nuevo;
    }

    T extraer() {
        T res = objeto;
        objeto = null; // el contenedor vuelve a estar vacio
        return res;
    }

    public static void main(String[] args) {
        Contenedor<Integer> c = new Contenedor<>();
        c.guardar(7);

        Contenedor<String> cStr = new Contenedor<>();
        cStr.guardar("roca");

        Contenedor contenedor = new Contenedor();

        Double x = (Double) c.extraer(); // error de ejecución
    }

}
