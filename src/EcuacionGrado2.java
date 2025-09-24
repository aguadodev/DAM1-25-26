import java.util.Scanner;
/** 
 * EcuacionGrado2.
La fórmula para calcular las raíces de una ecuación de segundo grado  es:

Convierte esta fórmula en una expresión algorítmica en Java para calcular ambas soluciones (x1 y x2), asumiendo que a, b, y c son variables de tipo double.
 */

/** 
 * @Author Ignacio MR
 */
public class EcuacionGrado2 {
    public static void main(String[] args) throws Exception {

        //Abrimo Variables
        double a;
        double b;
        double c;

        //Recogemos datos
        Scanner sc = new Scanner(System.in);
        System.out.print("Dame el número 'a': ");
        a = sc.nextDouble();
        System.out.print("Dame el número 'b': ");
        b = sc.nextDouble();
        System.out.print("Dame el número 'c': ");
        c = sc.nextDouble();
        sc.close();
        
        //Operamos datos
        
        double sqrt = Math.sqrt(Math.pow(b, 2) - 4 * a * c);

        double x1 = (-b + sqrt) / (2 * a);
        double x2 = (-b - sqrt) / (2 * a);

        // Configuramos la salida condicionada al cálculo de la raíz cuadrada
        String salida = Double.isNaN(sqrt) ? "No hay solución real" : "Soluciones (x1, x2): " + x1 + ", " + x2;

        System.out.println(salida);
    }
}
