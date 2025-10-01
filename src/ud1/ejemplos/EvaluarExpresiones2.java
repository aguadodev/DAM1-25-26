package ud1.ejemplos;
public class EvaluarExpresiones2 {
    public static void main(String[] args) {
        int resultado = 10;
        resultado += 5 - 3 * 2;

        boolean resultado1 = 4 + 5 > 10 - 3;

        boolean resultado2 = 5 > 3 && 8 < 6 || 3 == 3;

        int resultado3 = (4 + 3) * 2 - 6 / 3;

        int a = 10, b = 20;
        int resultado4 = a > b ? a : b;

        int x = 5;
        int resultado5 = ++x * 2;

    System.out.println("Resultado = " + resultado);        
    System.out.println("Resultado1 = " + resultado1);        
    System.out.println("Resultado2 = " + resultado2);        
    System.out.println("Resultado3 = " + resultado3);        
    System.out.println("Resultado4 = " + resultado4);        
    System.out.println("Resultado5 = " + resultado5);        

    }
}
