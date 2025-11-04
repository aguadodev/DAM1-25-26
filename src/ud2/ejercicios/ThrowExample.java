package ud2.ejercicios;

import ud2.Util;

public class ThrowExample {
    public static void main(String[] args) {
        System.out.println("Introduce la edad: ");
        int edad = Util.leerInt();

        try {
            checkAge(edad);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    static void checkAge(int age) throws IllegalArgumentException {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or older.");
        }
    }
}

