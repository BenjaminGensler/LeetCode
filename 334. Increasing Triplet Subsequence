//Benjamin Gensler
//2/13/2024
//Finding a set of triplets, going from lowest possible number so far and up
class Solution {
    public boolean increasingTriplet(int[] nums) {
        //Used Integer.MAX_VALUE
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        //the following finds the first set of rising triplets possible
        for (int num : nums) {
            //finds the lowest number so far
            if (num <= first) {
                first = num;
            //if not the lowest number then see if it's the second lowest number'
            } else if (num <= second) {
                second = num;
            } else {
                // Found the third increasing number
                return true;
            }
        }

        // No increasing triplet found
        return false;
    }
}

