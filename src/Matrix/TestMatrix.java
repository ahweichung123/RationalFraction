/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Matrix;

/**
 *
 * @author Student
 */
public class TestMatrix {
    public static void main(String args[]){
        int [][] intMatrix = new int [2][2];
        
        intMatrix[0][0] = 1;
        intMatrix[0][1] = 2;
        intMatrix[1][0] = 3;
        intMatrix[1][1] = 4;
        
        String output = "";
        for (int i = 0 ; i<intMatrix.length; i++){
            for(int j = 0; j<intMatrix[i].length; j++){
                output += intMatrix[i][j] + "";
            }
            output += "\n";
        }
        System.out.println(output);
    }
}
