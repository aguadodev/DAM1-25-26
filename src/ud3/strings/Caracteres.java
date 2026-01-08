package ud3.strings;

public class Caracteres {
    public static void main(String[] args) {
        char c = 'a';
        System.out.println(c);
        c = 97;
        System.out.println(c);
        c = '\u0061';
        System.out.println(c);
        c++;
        System.out.println(c);
        c++;
        System.out.println(c);

        int e = 'a'; // asigna un carácter 'a' una variable int
        System.out.println(e); // muestra 97

        e = '\u0062'; // asigna un carácter 'b' una variable int
        System.out.println(e); // muestra 98

        char ch = 97; // asigna un entero a una variable char
        System.out.println(ch); // muestra 'a'

        char ch2 = 'a';
        System.out.println((int) ch2); // muestra 97

        int n = 97;
        System.out.println((char) n); // muestra 'a'
        ch2 = (char) n;

        char ch3 = 'h' + 'A' - 'a';
        System.out.println(ch3); // muestra 'H'

        System.out.println(pasarAMayusculas('m'));        

    }

    static char pasarAMayusculas(char letra) {
        return (char) (letra + 'A' - 'a');
    }


}
