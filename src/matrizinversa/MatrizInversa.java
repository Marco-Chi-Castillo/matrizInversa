package matrizinversa;

public class MatrizInversa {

    public static void main(String[] args) {
        double[][] matriz = {{2, 3, 4, 6, 3}, {5, 6 , -2, 1, -2}, {-6, -3, 1, 9, 4}, {8, 6, 4, 2, 3}, {-7, 5, 7, -4, -2}};
        //double[][] matriz = {{1, -3, 2, 4}, {2, 5, 4, 1}, {0, -1, 8, -2}, {3, -1, -4, -2}};
        //double[][] matriz = {{2, 3, 4}, {1, -2, 10}, {-6, 8, 4}};
        //double[][] matriz = {{1, 2}, {4, 6}};
        /**
         * Sigue la formula para la matriz inversa que es:
         * A-1 = 1/determinante(adjunta(A))T
         */
        
        determinante deter = new determinante();
        adjunta ad = new adjunta();
        transpuestaMatriz trans = new transpuestaMatriz();
        
        PanelMatriz ventana = new PanelMatriz();
        ventana.setVisible(true);
        
        try {

            double determinante = deter.determinante(0, matriz); //saca determinante
            double[][] adjunta = ad.adjuntaMatriz(matriz); //saca la adjunta
            double[][] transpuesta = trans.transpuesta(adjunta); //transpuesta de la adjunta
            
            System.out.println("Matriz Original\n");
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz.length; j++) {
                    System.out.print(matriz[i][j] + "\t");
                }
                System.out.println("");
            }

            if (determinante != 0) {
                System.out.println("Matriz Inversa\n");
                for (int i = 0; i < transpuesta.length; i++) {
                    for (int j = 0; j < transpuesta.length; j++) {
                        System.out.print(transpuesta[i][j] / determinante + "\t");
                    }
                    System.out.println("");
                }
            }else{System.out.println("No existe Inversa");}

        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
