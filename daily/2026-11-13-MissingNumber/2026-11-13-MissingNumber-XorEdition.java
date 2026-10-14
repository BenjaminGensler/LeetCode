class Solution {
    public int missingNumber(int[] nums) {
        int numlength = nums.length;
        int sum = numlength;

        // loop to determine add/remove numbers from sum - either will remove the duplicates if already added to sum
        for(int i = 0; i < numlength; i++){
            sum ^= i;
            sum ^= nums[i];
        }

        // return the missing number based off sum xor approach
        return sum;
    }
}