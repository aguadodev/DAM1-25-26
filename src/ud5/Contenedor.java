package ud5;

class Contenedor<T extends Number> {

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
        // c.guardar("Hola");

        Contenedor<String> cStr = new Contenedor<>();
        cStr.guardar("roca");
        //Double d = (Double) cStr.extraer(); // Error de compilación

        Contenedor contenedor = new Contenedor();
        contenedor.guardar("Hola");
        Double d = (Double) contenedor.extraer(); // Error de ejecución

        //Double x = (Double) c.extraer(); // error de ejecución
    }

}
