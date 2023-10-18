import javax.swing.JOptionPane;

public class eval {
    public static void main(String[] args) {
        String asignaturas[] = new String[5];
        asignaturas[0] = "calculo";
        asignaturas[1] = "apo";
        asignaturas[2] = "algebra";
        asignaturas[3] = "cloud";
        asignaturas[4] = "mecanica";

        double notas[] = new double[5];
        for (int i = 0; i < 5; i++) {
            boolean inputValido = false;
            do {
                            
                try {
                    notas[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la nota para " + asignaturas[i]));
                    inputValido = true;
                            
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Por favor, ingrese un número válido para la nota de " + asignaturas[i]);
                }
            } while (!inputValido);
        }

        String reporte = "Reporte de notas\n";

        for (int i = 0; i < 5; i++) {
            reporte += asignaturas[i] + " : " + notas[i] + "\n";
        }

        JOptionPane.showMessageDialog(null, reporte);
    }
}