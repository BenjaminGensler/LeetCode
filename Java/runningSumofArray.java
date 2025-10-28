// Benjamin Gensler
// 10/28/2025
// 1480. Running Sum of 1d Array
class Solution {
    public int[] runningSum(int[] nums) {
        // starts at the second value so it can add the previous value before it
        for(int i = 1; i < nums.length; i++){
            // adds the previous value which is equal to the sum up to that point in the array
            nums[i] += nums[i - 1];
        }

        // return the altered nums array
        return nums;
    }
}
