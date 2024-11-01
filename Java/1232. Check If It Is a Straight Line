// given an array of coordinates determine if these point make up a straight line or not
class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        double[] point = new double[]{0,0};
        point[0] = coordinates[0][0] - coordinates[1][0];
        point[1] = coordinates[0][1] - coordinates[1][1];
        double diff = point[0] / point[1];

        for(int i = 1; i < coordinates.length - 1; i++){
            point[0] = coordinates[i][0] - coordinates[i + 1][0];
            point[1] = coordinates[i][1] - coordinates[i + 1][1];

            // Handles 0 (infinity) issue cases
            if(point[0] == 0 || point[1] == 0){
                if(Math.abs(diff) != Math.abs(point[0] / point[1])){
                    return false;
                }
            }
            // checks if the changed coordinates are invalid for a straight line
            else if(diff != point[0] / point[1]){
                return false;
            }
        }

        return true;
    }
}
