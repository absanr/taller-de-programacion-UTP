import java.util.Scanner;

public class Ejercicio_04_ConvertidorDolaresASoles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double TIPO_CAMBIO = 3.48;

        // Pedir al usuario que ingrese la cantidad en dólares
        System.out.print("Ingrese la cantidad en dólares: ");
        double dolares = scanner.nextDouble();

        // Convertir dólares a soles
        double soles = dolares * TIPO_CAMBIO;

        // Mostrar el resultado
        System.out.println(dolares + " dólares son " + soles + " soles.");

        scanner.close();
    }
}
