// 883. Projection Area of 3D Shapes
// Given a grid of a list of cubes determine the area of the projections of the cubes given 3 walls (floor, left wall, right wall)
// Benjamin Gensler
// 12/19/2024

class Solution {
    public int projectionArea(int[][] grid) {
        int buttonArea = 0;
        int leftArea = 0;
        int[] rightProjectRows = new int[grid[0].length];

        for(int i = 0; i < grid.length; i++){
            int leftItem = 0;
            for(int k = 0; k < grid[0].length; k++){
                //skip this cube if empty
                if(grid[i][k] == 0){
                    continue;
                }
                // add to base projection area if cube exists
                buttonArea++;

                //if the current cube is larger than the last on left projection
                if(leftItem < grid[i][k]){
                    leftItem = grid[i][k];
                }

                // if current cube is larger than current record on right projection
                if(rightProjectRows[k] < grid[i][k]){
                    rightProjectRows[k] = grid[i][k];
                }
            }
            leftArea += leftItem;
        }
        //collect leftArea and buttonArea together
        buttonArea += leftArea;


        // add the right projections area
        for(int i = 0 ; i < rightProjectRows.length; i++){
            buttonArea += rightProjectRows[i];
        }

        // return total projection Area
        return buttonArea;
    }
}
