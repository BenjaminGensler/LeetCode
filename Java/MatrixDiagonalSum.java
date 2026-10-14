//returns the sum of all the number in the diagonal lines (X pattern)
class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        for(int i = 0; i < mat.length; i++){
            //adds the values from left to right
            sum+=mat[i][i] + mat[i][mat.length - i - 1];
        }

        // removes the additional middle number if length is odd
        if(mat.length % 2 != 0){
            sum -= mat[(mat.length / 2)][(mat.length / 2)]; // if length is 3 subtracts mat[1][1]
        }

        return sum;
    }
}
