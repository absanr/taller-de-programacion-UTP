// Code Author: Celeste

import java.util.Scanner;

public class Ejercicio_02_CalculadoraHipotenusa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese la longitud del primer cateto:");
        double a = input.nextDouble();

        System.out.println("Ingrese la longitud del segundo cateto:");
        double b = input.nextDouble();

        double c = Math.sqrt((a * a) + (b * b));

        System.out.println("La longitud de la hipotenusa es: " + c);

        input.close();
    }
}
