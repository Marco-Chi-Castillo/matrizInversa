package matrizinversa;

public class determinante {
    /**
     *
     * @param i fila que tomaremos de la matriz
     * @param matriz matriz a calcular
     */
    public double determinante(int i, double[][] matriz) {
        //Calculo de matriz 2x2
        if (matriz.length == 2) {
            double determinante = matriz[0][0] * matriz[1][1] - matriz[0][1] * matriz[1][0];
            return determinante;
        } else {
            double determinante = 0;
            for (int index = 0; index < matriz.length; index++) {
                double[][] temporal = this.subMatriz(i, index, matriz);
                determinante = determinante + Math.pow(-1, i + index)
                        * matriz[i][index] * this.determinante(i, temporal);
            }
            return determinante;
        }
    }

    /**
     *
     * @param i fila de la matriz original
     * @param index indice del for que recorre a la matriz
     * @param matriz original
     * @return
     */
    private double[][] subMatriz(int i, int index, double[][] matriz) {

        double[][] temporal = new double[matriz.length - 1][matriz.length - 1];
        int contador1 = 0;
        int contador2 = 0;

        for (int a = 0; a < matriz.length; a++) {
            if (a != i) {
                contador2 = 0;
                for (int b = 0; b < matriz.length; b++) {
                    if (b != index) {
                        temporal[contador1][contador2] = matriz[a][b];
                        contador2++; //columna
                    }
                }
                contador1++; //fila
            }
        }
        return temporal;
    }
}
