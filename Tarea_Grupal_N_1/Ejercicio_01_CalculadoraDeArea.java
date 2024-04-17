import java.util.Scanner;

public class Ejercicio_01_CalculadoraDeArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione la figura para calcular su área:");
        System.out.println("1. Círculo");
        System.out.println("2. Cuadrado");
        System.out.println("3. Triángulo");
        System.out.print("Ingrese su elección (1/2/3): ");
        int eleccion = scanner.nextInt();

        if (eleccion == 1) {
            // Cálculo del área de un círculo
            System.out.print("Ingrese el radio del círculo: ");
            double radio = scanner.nextDouble();
            double areaCirculo = Math.PI * radio * radio;
            System.out.println("El área del círculo es: " + areaCirculo);
        } else if (eleccion == 2) {
            // Cálculo del área de un cuadrado
            System.out.print("Ingrese el lado del cuadrado: ");
            double lado = scanner.nextDouble();
            double areaCuadrado = lado * lado;
            System.out.println("El área del cuadrado es: " + areaCuadrado);
        } else if (eleccion == 3) {
            // Cálculo del área de un triángulo
            System.out.print("Ingrese la base del triángulo: ");
            double base = scanner.nextDouble();
            System.out.print("Ingrese la altura del triángulo: ");
            double altura = scanner.nextDouble();
            double areaTriangulo = (base * altura) / 2;
            System.out.println("El área del triángulo es: " + areaTriangulo);
        } else {
            System.out.println("Elección no válida.");
        }

        scanner.close();
    }
}
