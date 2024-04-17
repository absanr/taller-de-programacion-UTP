
import java.util.Scanner;

public class Ejercicio_03_CalculoIGV {
    // public static void main(String[] args) {
    //     double montoTotal = 1000; // Monto total de la compra
    //     double igv = 0.18; // Tasa de IGV
    //     double montoSinIGV = montoTotal / (1 + igv);
    //     double montoIGV = montoTotal - montoSinIGV;

    //     System.out.println("Monto total: " + montoTotal);
    //     System.out.println("Monto sin IGV: " + montoSinIGV);
    //     System.out.println("IGV: " + montoIGV);
    // }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // se crea un objeto Scanner para leer la entrada desde consola
        
        System.out.println("Ingrese el monto total: ");
        double montoTotal = scanner.nextDouble(); // Lee el monto total introducido por el usuario

        double igv = 0.18; // Tasa de IGV
        double montoSinIGV = montoTotal / (1 + igv); // Calcula el monto sin IGV
        double montoIGV = montoTotal - montoSinIGV; // Calcula el IGV

        // Imprime los resultados
        System.out.printf("Monto sin IGV: %.2f\n", montoSinIGV);
        System.out.printf("IGV: %.2f\n", montoIGV);
        
        scanner.close(); // Cierra el scanner
    }
}

