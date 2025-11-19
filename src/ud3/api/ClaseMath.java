package ud3.api;

public class ClaseMath {
    static double random(double min, double max) {
/*        double f = Math.random()/Math.nextDown(1.0);
        double x = min*(1.0 - f) + max*f;
        return x;*/
        double random = Math.random();
        random *= max - min;
        random += min;
        return random;
    }

    public static void main(String[] args) {

        double rnd = random(-360, 360);
        System.out.println("Número: " + rnd);
        double sqrt = Math.sqrt(rnd);
        System.out.println("Raíz cuadrada: " + sqrt);
        long round = Math.round(rnd);
        System.out.println("Redondeo (round): " + round);
        double floor = Math.floor(rnd);
        System.out.println("Redondeo (floor): " + floor);
        double ceil = Math.ceil(rnd);
        System.out.println("Redondeo (ceil): " + ceil);
        double abs = Math.abs(rnd);
        System.out.println("Valor absoluto (abs): " + abs);

        double pow = Math.pow(rnd, 3);
        System.out.println("Potencia (pow): " + pow);
        double log = Math.log(rnd);
        System.out.println("Logaritmo (log): " + log);
        double sin = Math.sin(rnd);
        System.out.println("Seno (sin): " + sin);
        double cos = Math.cos(rnd);
        System.out.println("Coseno (cos): " + cos);

        double rnd2 = random(-360, 360);
        double rnd3 = random(-360, 360);
        System.out.println("rnd2: " + rnd2);
        System.out.println("rnd3: " + rnd3);
        double mayor = Math.max(Math.max(rnd, rnd2), rnd3);
        System.out.println("Mayor: " + mayor);
        double menor = Math.min(Math.min(rnd, rnd2), rnd3);
        System.out.println("Menor: " + menor);




        /* PRUEBAS DE GENERACIÓN DE NÚMEROS ALEATORIOS 
        for (int i = 0; i < 10000; i++) {
            double rnd = random(-360, 360);
            if (rnd < -360 || rnd >= 360)
                System.out.println("Número fuera de rango");
            if (rnd == -360 || rnd == 360) 
                System.out.println(rnd);
        }

//        System.out.println(random(-360, 360));
        for (int i = 0; i < 1000; i++) {
            double rnd = random(100, 200);
            System.out.println(rnd);
            if (rnd < 100 || rnd >= 200)
                System.out.println("Número fuera de rango");
        }       
                */        
        
    }

}
