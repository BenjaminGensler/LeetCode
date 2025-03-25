// Benjamin Gensler
// 3/25/25
// 703. Kth Largest Element in a Stream
// return the kth largest element in a string of numbers. This will be changed for each add(val) function call and will then need the kth element returned.
class KthLargest {
    List<Integer> nums = new ArrayList<>();;
    int k;

    public KthLargest(int k, int[] nums) {
        this.k = k; // set the value of k

        // sort the array
        Arrays.sort(nums);

        // add the elements to the list
        for (int num : nums) {
            this.nums.add(num);
        }
    }
    
    public int add(int val) {
        // add the element to the list
        nums.add(val);

        // sort the list
        Collections.sort(nums);

        // return the kth largest element
        return nums.get(nums.size() - k);
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */
