import java.util.Scanner;

public class SumaResta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double numero2 = scanner.nextDouble();

        System.out.println("Seleccione una operación:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        int opcion = scanner.nextInt();

        double resultado = 0;

        switch (opcion) {
            case 1:
                resultado = numero1 + numero2;
                System.out.println("La suma es: " + resultado);
                break;
            case 2:
                resultado = numero1 - numero2;
                System.out.println("La resta es: " + resultado);
                break;
            default:
                System.out.println("Opción no válida");
        }
    }
}
