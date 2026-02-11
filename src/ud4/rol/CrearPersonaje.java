package ud4.rol;

public class CrearPersonaje {
    public static void main(String[] args) {
        Personaje per1, per2, per3;

        per1 = new Personaje("Aragorn", Raza.HUMANO, 80, 80, 80, 10, 0, 50);
        per2 = new Personaje("Legolas", Raza.ELFO, 70, 100, 80, 10, 0, 60);
        per3 = new Personaje("Gimli", Raza.ENANO, 70, 100, 80, 10, 0, 60);

        System.out.println(per1.mostrar());
        System.out.println(per2.mostrar());
        System.out.println(per3.mostrar());
    }
}
