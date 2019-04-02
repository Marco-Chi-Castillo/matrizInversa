
package matrizinversa;

public class adjunta {
    /**
     * 
     * @param matriz matriz original 
     * @return adjunta para la operacion de cada valor.
     */
    public double [][]adjuntaMatriz(double [][] matriz){
        determinante dt = new determinante();
        double [][] temporalAdjunta = new double[matriz.length][matriz.length];
        
        for(int i = 0; i < temporalAdjunta.length; i++){
            for(int j = 0; j < temporalAdjunta.length; j++){
                
                double [][]temporal = dt.subMatriz(i, j, matriz);
                double elementoAdjunto = Math.pow(-1, i+j) * dt.determinante(0, temporal);
                temporalAdjunta[i][j] = elementoAdjunto;
                        
            }
        }
       return temporalAdjunta;
    }
}
