package ud3.strings;

import java.io.Console;

public class Util {

    public static String leerPassword() {
        Console cons = System.console();

        String passwd = new String(cons.readPassword());

        return passwd;
    }

}
