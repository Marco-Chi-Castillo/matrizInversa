
package matrizinversa;

public class MatrizInversa {

    public static void main(String[] args) {
        double [][] matriz={{1,-3,2,4},{2,5,4,1},{0,-1,-2,-2},{3,-1,-4,-2}};
        determinante d = new determinante();
       try{
           System.out.println("Determinante es: " + d.determinante(0, matriz));
       }catch(Exception e){
           System.out.println("Error");
       }
    }
}
