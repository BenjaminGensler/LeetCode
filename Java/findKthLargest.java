//215. Kth Largest Element in an Array
//find the kth largest number in an array
class Solution {
    public int findKthLargest(int[] nums, int k) {
      //sorting the given aray from largest to smallest
        Arrays.sort(nums);

        //returning the kth largest number
        return nums[nums.length - k];
    }
}
