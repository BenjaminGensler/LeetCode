// Benjamin Gensler
// 1/29/25
// 268. Missing Number
// The given arrays have all the numbers from 0 - n. Determine which of the numbers is missing. (I decided to use insertionSort() to sort the array
class Solution {
    public int missingNumber(int[] nums) {
        //Sorting the array (insertion sort)
        insertionSort(nums);

        // loop to check each number in order
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != i){
                return i;
            }
        }

        //returns the last number (n)
        return nums.length;
    }

    private static void insertionSort(int[] nums){
        // exit function if array is empty or has only one element
        if(nums.length <= 1){
            return;
        }

        // Loop to sort the array
        for (int i = 1; i < nums.length; i++) {
            int holder = nums[i];
            int k = i - 1;

            // Shift elements to the right
            while (k >= 0 && nums[k] > holder) {
                nums[k + 1] = nums[k];
                k--;
            }

            // Place holder in current position
            nums[k + 1] = holder;
        }
    }
}
