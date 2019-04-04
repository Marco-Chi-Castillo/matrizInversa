package matrizinversa;

import javax.swing.JOptionPane;

public class MatrizInversa {

    public double[][] matrizinver(double[][] matriz, int n) {

        determinante deter = new determinante();
        adjunta ad = new adjunta();
        transpuestaMatriz trans = new transpuestaMatriz();

        double determinante = deter.determinante(0, matriz); //saca determinante
        double[][] adjunta = ad.adjuntaMatriz(matriz); //saca la adjunta
        double[][] transpuesta = trans.transpuesta(adjunta); //transpuesta de la adjunta
        double[][] inversaMatriz = new double[n][n];
        try {
            
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz.length; j++) {
                    System.out.print(matriz[i][j] + "\t");
                }
                System.out.println("");
            }

            if (determinante != 0) {
               
                for (int i = 0; i < transpuesta.length; i++) {
                    for (int j = 0; j < transpuesta.length; j++) {
                        System.out.print(transpuesta[i][j]/determinante + "\t");
                        inversaMatriz[i][j] = transpuesta[i][j]/determinante;
                    }
                    System.out.println("");
                }
            } else {
                JOptionPane.showMessageDialog(null, "No existe Inversa");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error");
        }
        return inversaMatriz;
    }

}