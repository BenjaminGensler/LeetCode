// Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.
class Solution {
    public void setZeroes(int[][] matrix) {
        int[][] zeroMatrix = new int[matrix.length][matrix[0].length];
        Boolean row = false;

        // Create a deep copy of the matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                zeroMatrix[i][j] = matrix[i][j];
            }
        }


        for(int i = 0; i < matrix.length; i++){
            for(int k = 0; k < matrix[i].length; k++){
                if(matrix[i][k] == 0){
                    row = true;
                    //sets the current column as 0's
                    for(int j = 0; j < matrix.length; j++){
                        zeroMatrix[j][k] = 0;
                    }
                }
            }
            //sets the current row as 0's
            if(row){
                for(int j = 0; j < matrix[i].length; j++){
                    zeroMatrix[i][j] = 0;
                }

                row = false;
            }
        }

        // Copy the zeroMatrix back to the original matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = zeroMatrix[i][j];
            }
        }
    }
}
