package ud3.api;

public class ClasesEnvolventes {
    public static void main(String[] args) {
        int i = 23;
        Integer num = i;

        String s = "50.80";
        float f = 4.65f;
        Float ft = 4.65f;
        ft = Float.valueOf(s);

        float datoFloat = ft;
        int n = num;

        int a = Integer.parseInt("ff", 16); 
        System.out.println (a);
        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toString(a, 2));
        System.out.println(Integer.toOctalString(a));
        System.out.println(Integer.toString(a, 8));
        System.out.println(Integer.toHexString(a));
        System.out.println(Integer.toString(a, 16));


        System.out.println("Fin de programa");
    }
    
}
