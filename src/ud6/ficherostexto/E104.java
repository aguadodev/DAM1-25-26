package ud6.ficherostexto;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class E104 {
    public static void main(String[] args) {
        try (BufferedWriter out = new BufferedWriter(new FileWriter("Quijote.txt")); 
             BufferedWriter out2 = new BufferedWriter(new FileWriter("Quijote.txt"));
             BufferedWriter out3 = new BufferedWriter(new FileWriter("Quijote.txt")); 
             BufferedWriter out4 = new BufferedWriter(new FileWriter("Quijote.txt"))             
            ) {
        


        } catch (Exception e) {
            
        }
    }
}
