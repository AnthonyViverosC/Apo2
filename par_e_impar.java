public class par_e_impar {
    public static void main(String[] args) {
        int n = 10; // Cambia este valor para imprimir más números si es necesario

        System.out.println("Números impares y pares hasta " + n + ":");
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " (Par)");
            } else {
                System.out.println(i + " (Impar)");
            }
        }
    }
}
