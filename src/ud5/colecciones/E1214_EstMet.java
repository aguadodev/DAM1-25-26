package ud5.colecciones;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import ud5.interfaces_funcionales.CSV;
import ud5.interfaces_funcionales.CSVRead;

public class E1214_EstMet {
    static Scanner sc;
    static List<RegistroTemp> registros = new ArrayList<>();

    public static void main(String[] args) {
        sc = new Scanner(System.in);

        CSVRead<RegistroTemp> csvRead = str -> {
            String[] datos = str.split(",");
            String[] datosHora = datos[0].split(":");
            LocalTime hora = LocalTime.of(
                Integer.parseInt(datosHora[0]), 
                Integer.parseInt(datosHora[1]), 
                Integer.parseInt(datosHora[2]));
            Double temp = Double.parseDouble(datos[1]);
            return new RegistroTemp(hora, temp);
        };
        registros.addAll(CSVRead.leerCSV(csvRead, "DATOS - Temperaturas.csv"));

        int opcion = opcionMenu();
        while (opcion != 4) {
            switch (opcion) {
                case 1 : 
                    System.out.print("Temperatura en grados: ");
                    double temp = sc.nextDouble();
                    registros.add(new RegistroTemp(LocalTime.now(), temp));
                    break;
                case 2 : 
                    System.out.println(registros);
                    break;
                case 3 : 
                    Comparator<RegistroTemp> comparador = (o1, o2) -> Double.compare(o1.grados, o2.grados);

                    System.out.println("Máxima temperatura: " + Collections.max(registros, comparador));
                    System.out.println("Mínima temperatura: " + Collections.min(registros, comparador));
                    double promedio = 0;
                    for (RegistroTemp r : registros) {
                        promedio += r.grados;
                    }
                    promedio /= registros.size();
                    System.out.println("Promedio: " + promedio);
                    break;
            }    
            opcion = opcionMenu();
        }

        CSV<RegistroTemp> csvT = e -> {
                String strHora = e.hora.getHour() + ":" + e.hora.getMinute() + ":" + e.hora.getSecond();
                return strHora + "," + e.grados;
            };            

        CSV.guardarCSV(registros, csvT, "DATOS - Temperaturas.csv");
        
    }


    private static int opcionMenu() {
        System.out.println("""
                REGISTROS DE TEMPERATURAS
                1. Nuevo registro
                2. Listar registros
                3. Mostrar estadistica
                4. Salir
                """);
        return sc.nextInt();        
    }

}


class RegistroTemp {
    LocalTime hora;
    double grados;

    public RegistroTemp(LocalTime hora, double grados) {
        this.hora = hora;
        this.grados = grados;
    }

    @Override
    public String toString() {
        return "RegistroTemp [hora=" + hora + ", grados=" + grados + "]";
    }

    
    
}
