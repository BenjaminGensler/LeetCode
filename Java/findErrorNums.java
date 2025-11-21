/**
* Benjamin Gensler
* 11/21/2025
* Set Mismatch
*/
class Solution {
    public int[] findErrorNums(int[] nums) {
        Set<Integer> existingNums = new HashSet<>(); // O(1)
        int sum = nums.length * (nums.length + 1) / 2;;
        int extraNum = 0;
        // int n = nums.length;
        for(int i = 0; i < nums.length; i++){
            //if the number isn't already accounted for
            if(!existingNums.contains(nums[i])){
                existingNums.add(nums[i]);
                sum -= nums[i];
            }
            else{
                extraNum = nums[i];
            }
        }
        int[] result = {extraNum, sum};
        return result;
    }
}
