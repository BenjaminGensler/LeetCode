class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {

        // Checks if bottom points for rec2 are both less than the top points of rec1
        if(rec2[0] < rec1[2] && rec2[1] < rec1[3]){

            //Checks if top points for rec2 are both greater than than the bottom points of rec1
            if(rec2[2] > rec1[0] && rec2[3] > rec1[1]){
                // overlap found
                return true;
            }
        }

        // NO overlap found
        return false;

        
    }
}
