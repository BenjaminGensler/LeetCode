// Benjamin Gensler
// 2/10/25
//3151. Special Array I
// Given an array of numbers find out if the array is special or not (Check to see if the parity (even/odd) between each pair is the same or not
class Solution {
    public boolean isArraySpecial(int[] nums) {
        // loops through nums to compair pairs in nums
        for(int i = 0; i < nums.length - 1; i++){
            //checks first pair can be checks
            if(i <= nums.length - 2){
                //checks parity (-/+) of nums[i] & nums[i + 1]
                if(nums[i] % 2 == nums[i + 1] % 2){
                    return false;
                }
            }
        }
        // all pairs are not the same parity (-/+)
        return true;
    }
}
