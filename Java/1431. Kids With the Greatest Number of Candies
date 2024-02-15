import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n = candies.length;
        int largest = 0;
        List<Boolean> resultingCandies = new ArrayList<>();
        int curIndex = 0;

        //find largest candy from all kids
        for (int candy : candies) {
            if (candy > largest) {
                largest = candy;
            }
        }

        //fill bool list
        for (int candy : candies) {
            if (candy + extraCandies >= largest) {
                resultingCandies.add(true);
                curIndex++;
            }
            else {
                resultingCandies.add(false);
                curIndex++;
            }
        }

        return resultingCandies;
    }
}
