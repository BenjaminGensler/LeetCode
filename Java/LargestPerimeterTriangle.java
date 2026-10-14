//Finding the largest perimeter for a triangle based on the numbers given and returning the perimeter
class Solution {
    public int largestPerimeter(int[] nums) {
        // Sort the array to find largest perimeter easier
        Arrays.sort(nums);

        // starts at the largest values first
        for (int i = nums.length - 1; i >= 2; i--) {
            // Check if the three larger numbers form a valid triange (this will also give the largest area)
            if (nums[i] < nums[i - 1] + nums[i - 2]) {
                // Return the perimeter of the valid triangle
                return nums[i] + nums[i - 1] + nums[i - 2];
            }
        }

        // If no valid triangle is found, return 0
        return 0;
    }
}
