// Benjamin Gensler
// 268. Missing Number
// Return the missing number of the non-sorted array
// Time coplexity O(n)
class Solution {
    public int missingNumber(int[] nums) {
        //sum of numbers formula S=n(n+1)/2
        int numlength = nums.length;
        int sum = (numlength * (numlength +1)) /2;

        int resultingSum = 0;
        // loop to determine sum of current array
        for(int i = 0; i < numlength; i++){
            resultingSum+=nums[i];
        }

        // return the missing number based off sum - resulting sum of array 
        return sum - resultingSum;
    }
}