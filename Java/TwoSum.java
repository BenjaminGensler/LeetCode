//1. Two Sum
//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//You can return the answer in any order.
class Solution {
    public int[] twoSum(int[] nums, int target) {
        //loops through nums array for every possible case
        for(int i = 0; i < nums.length; i++){
            for(int k = i+1; k < nums.length; k++){
                //checks if target is found
                if(nums[k] + nums[i] == target){
                    return new int[] {i, k};
                }
            }
        }
        // base null case
        return new int[] {-1,-1};
    }
}
