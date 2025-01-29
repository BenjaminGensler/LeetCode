// Benjamin Gensler
// 1/29/25
// 280. Wiggle Sort
// Sort the array by going back in forth on the size of numbers num1 <= num2 >= num3 <= num4 .....
class Solution {
    public void wiggleSort(int[] nums) {
        insertionSort(nums);

        // Copy the nums array
        int[] wiggleNums = Arrays.copyOf(nums, nums.length);
        int counter = 0;
        for(int i = 0; i <= nums.length / 2 && counter < nums.length; i++){
            nums[counter] = wiggleNums[i];
            counter++;
            if(counter < nums.length){
                nums[counter] = wiggleNums[nums.length - 1 - i];
                counter++;
            }
            
        }
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
