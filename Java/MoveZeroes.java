//Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
class Solution {
    public void moveZeroes(int[] nums) {
        int zeroCounter = 0;

        for(int i = 0; i < nums.length;){
            if(nums[i] != 0){
                i++;
                continue;
            }

            //acts as a breaking point to know that the rest of the array is all zeros
            if(i + zeroCounter >= nums.length){
                break;
            }

            for(int k = i; k < nums.length - 1; k++){
                nums[k] = nums[k + 1];
            }

            zeroCounter++;

            nums[nums.length - 1] = 0;
        }
    }
}
