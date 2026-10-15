// ===== Java/src/main/java/leetcode/MissingNumber.java =====
package leetcode;

public final class MissingNumber {
    private MissingNumber() {} // utility class: no instances

    // LeetCode #268, approach 1: Gauss sum. Must survive n = 50,000.
    public static int bySum(int[] nums) {
        int n = nums.length;        // range is 0..n, so n values with one missing
        long expectedSum = (long) n * (n +1) /2;    // cast BEFORE multiplying: (long) n * (n + 1) / 2
        long actualSum = 0;         // long too: the array total overflows int as well
        for (int num : nums) {
            actualSum += num;
        }
        return (int) (expectedSum - actualSum);        // the difference always fits in an int
    }

    // Approach 2: XOR. Each present value cancels with its index (a ^ a = 0).
    public static int byXor(int[] nums) {
        int missing = nums.length;  // starting at n handles the "n is missing" case
        for (int i = 0; i < nums.length; i++) {
            missing ^= i;                   // fold in both i and nums[i]
            missing ^= nums[i];
        }
        return missing;
    }
}