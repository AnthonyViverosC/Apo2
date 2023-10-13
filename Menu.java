package Clases;

import javax.swing.JOptionPane;

public class Menu {

    public static void main(String[] args) {
        int op = 0;
        while (op != 3) {
            system.out.print("");
            op = Integer.parseInt(JOptionPane.showInputDialog(
                    "-----BIENVENIDO AL MENU-----\nSeleccione una opción:\n1. Pedir números hasta 0 y sumarlos\n2. Pedir 10 números y calcular el promedio\n3. Salir"));

            try {
                switch (op) {
                    case 1:
                        int suma = 0;
                        int n = 1;
                        while (n != 0) {
                            n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numeros"));
                            suma += n;
                        }
                        JOptionPane.showMessageDialog(null, "La suma es " + suma);
                        break;

                    case 2:
                        int sumaP = 0;
                        for (int i = 1; i <= 10; i++) {
                            int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número " + i));
                            sumaP += num;
                        }
                        double promedio = sumaP / 10.0;
                        JOptionPane.showMessageDialog(null, "El Promedio de notas es de " + promedio);
                        break;

                    case 3:
                        JOptionPane.showMessageDialog(null, "Saliste");
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "Opción no válida");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Opción no válida");
            }
        }
    }
}