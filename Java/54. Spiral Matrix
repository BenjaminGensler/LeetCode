//Take the matrix and add the values in a clockwise spiral order. (Some matrix x and y values are larger than one another)

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int x = 0;
        int x2 = matrix.length - 1;
        int y = 0;
        int y2 = matrix[0].length - 1;

        // List to return the spiral order
        List<Integer> nums = new ArrayList<>();

        while (x <= x2 && y <= y2) {
            // Adds the top row of the spiral
            for (int i = y; i <= y2; i++) {
                nums.add(matrix[x][i]);
            }
            x++;

            // Adds the right column of the spiral
            for (int i = x; i <= x2; i++) {
                nums.add(matrix[i][y2]);
            }
            y2--;

            // Adds the bottom row of the spiral
            if (x <= x2) {
                for (int i = y2; i >= y; i--) {
                    nums.add(matrix[x2][i]);
                }
                x2--;
            }

            // Adds the left column of the spiral
            if (y <= y2) {
                for (int i = x2; i >= x; i--) {
                    nums.add(matrix[i][y]);
                }
                y++;
            }
        }

        return nums;
    }
}
