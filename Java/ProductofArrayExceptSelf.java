//Benjamin Gensler
//2/19/2024
//238. Product of Array Except Self
//Creating a product array while avoid the current locations number:
// Ex/ [1,2,3,4] -> [24,12,8,6]  (12 = 1 * 3 * 4   (skips the 2) )

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] newNums = new int[nums.length];

        // Copy elements from the original array to the new array
        for (int i = 0; i < nums.length; i++) {
            newNums[i] = nums[i];
        }

        // Creation of the desired product array
        for (int i = 0; i < nums.length; i++) {
            int product = 1;
            for (int k = 0; k < nums.length; k++) {
                //skip the number if on the current one
                if(k == i){
                    continue;
                }
                
                product *= nums[k];
            }
            newNums[i] = product;
        }

        return newNums;
    }
}
