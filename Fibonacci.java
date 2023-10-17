package Apo2;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 10; // Cambia este valor para calcular el término de Fibonacci que desees
        long resultado = calcularFibonacci(n);
        System.out.println("El término " + n + " de la secuencia de Fibonacci es: " + resultado);
    }

    public static long calcularFibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return calcularFibonacci(n - 1) + calcularFibonacci(n - 2);
        }
    }
}
