// Benjamin Gensler
// 3/26/25
// 35. Search Insert Position
// Find the target value are return its index. If the index is not found then return the closest index.
class Solution {
    public int searchInsert(int[] nums, int target) {
        return recBinarySearch(nums, 0, nums.length - 1, target);
    }

    public int recBinarySearch(int[] nums, int start, int end, int target) {
        // was unable to find the given target
        if (start > end) {
            return start;
        }

        // collect middle position
        int mid = (start + end) / 2;

        // target is found
        if (nums[mid] == target) {
            return mid;
        }

        // recall with left half of nums
        if (nums[mid] > target) {
            return recBinarySearch(nums, start, mid - 1, target);
        }

        // recall with right half of nums
        return recBinarySearch(nums, mid + 1, end, target);
    }
}
