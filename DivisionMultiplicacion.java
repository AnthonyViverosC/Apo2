import java.util.Scanner;

public class DivisionMultiplicacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al programa de división y multiplicación");

        System.out.print("Elija la operación (1 para multiplicación, 2 para división): ");
        int opcion = scanner.nextInt();

        if (opcion == 1) {
            System.out.print("Ingrese el primer número: ");
            double numero1 = scanner.nextDouble();
            System.out.print("Ingrese el segundo número: ");
            double numero2 = scanner.nextDouble();
            double resultado = numero1 * numero2;
            System.out.println("El resultado de la multiplicación es: " + resultado);
        } else if (opcion == 2) {
            System.out.print("Ingrese el numerador: ");
            double numerador = scanner.nextDouble();
            System.out.print("Ingrese el denominador: ");
            double denominador = scanner.nextDouble();

            if (denominador == 0) {
                System.out.println("Error: No se puede dividir por cero.");
            } else {
                double resultado = numerador / denominador;
                System.out.println("El resultado de la división es: " + resultado);
            }
        } else {
            System.out.println("Opción no válida. Debe seleccionar 1 o 2.");
        }

        
    }
}
