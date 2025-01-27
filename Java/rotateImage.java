// Benjamin Gensler
// 1/27/25
// 48. Rotate Image
// rotate the matrix by 90 degrees (Original versions is n x n matrix)
// The below allows for m x n matrix rotation for future proofing
class Solution {
    public void rotate(int[][] matrix) {
        int[][] newMatrix = new int[matrix[0].length][matrix.length];
        
        //value to act as a counter for newMatrix (will be altered while in in loop along with x)
        int y = matrix[0].length - 1;

        // loop to assign matrix values to newMatrix index at 90 degrees
        for(int i = 0; i < matrix.length; i++){
            // x counter for newMatrix
            int x = 0;
            for(int k = 0; k < matrix[0].length; k++){
                // System.out.println(matrix[i][k]);
                newMatrix[x][y] = matrix[i][k];
                
                x++;
            }
            y--;
        }

        // Setting the newMatrix Values to matrix
        for(int i = 0; i < newMatrix.length; i++){
            for(int k = 0; k < newMatrix[0].length; k++){
                matrix[i][k] = newMatrix[i][k];
            }
        }
    }
}
