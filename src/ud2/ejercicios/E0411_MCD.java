package ud2.ejercicios;

public class E0411_MCD {
    public static int mcd(int a, int b) {
        int mcd = 0;
        // Casos Base
        if (a == 0) 
            mcd = b;
        else if (b == 0)
            mcd = a;
        else if (b > a)
            mcd = mcd(a, b - a);
        else 
            mcd = mcd(a - b, b);

        return mcd;
    }

    public static void main(String[] args) {
        System.out.println(mcd(10, 25)); // 5
        System.out.println(mcd(100, 60)); // 20        
        System.out.println(mcd(26, 39)); // 13
        System.out.println(mcd(3, 5)); // ?
    }
}
