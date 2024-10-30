//An array is monotonic if it is either monotone increasing or monotone decreasing.
//An array nums is monotone increasing if for all i <= j, nums[i] <= nums[j]. An array nums is monotone decreasing if for all i <= j, nums[i] >= nums[j].
//Given an integer array nums, return true if the given array is monotonic, or false otherwise.

class Solution {
    public boolean isMonotonic(int[] nums) {
        int k = 0;

        //base case
        if(nums.length == 1){
            return true;
        }

        // used to help determine the direction to check (avoids issues in cases like [1,1,0])
        while(nums[k] == nums[k + 1]){
            k++;
            if(k == nums.length - 1){
                return true;
            }
        }

        // decreasing
        if(nums[k] > nums[k+1]){
            for(int i = 1; i < nums.length; i++){
                if(nums[i-1] < nums[i]){
                    return false;
                }
            }
        }

        // increasing
        else{
            for(int i = 1; i < nums.length; i++){
                if(nums[i-1] > nums[i]){
                    return false;
                }
            }
        }

        //returns true if either for the for loops 
        return true;
    }
}
