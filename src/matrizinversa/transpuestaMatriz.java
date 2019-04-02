package matrizinversa;

public class transpuestaMatriz {
    /**
     * 
     * @param matriz  en este caso la matriz adjunta
     * @return retorna la inversa de una matriz
     */
    public double[][] transpuesta(double[][] matriz) {
        determinante dt = new determinante();
        double[][] temporalTranspuesta = new double[matriz.length][matriz.length];

        for (int i = 0; i < temporalTranspuesta.length; i++) {
            for (int j = 0; j < temporalTranspuesta.length; j++) {
                temporalTranspuesta[i][j] = matriz[j][i];
            }
        }
        return temporalTranspuesta;
    }
}
