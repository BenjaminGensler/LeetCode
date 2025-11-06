/**
* Benjamin Gensler
* 11/06/2025
* 163. Missing Ranges
*/

class Solution {
    public List<List<Integer>> findMissingRanges(int[] nums, int lower, int upper) {
        List<List<Integer>> range = new ArrayList<>();;
        if(nums.length < 1){
            range.add(Arrays.asList(lower, upper));
            return range;
        }
        // handles lowest values
        if(lower < nums[0]){
            range.add(Arrays.asList(lower, nums[0] - 1));
        }

        //handles ranges between 
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] + 1 != nums[i+1]){
                range.add(Arrays.asList(nums[i]+1, nums[i+1] - 1));
            }
        }

        if(upper > nums[nums.length - 1]){
            range.add(Arrays.asList(nums[nums.length - 1] + 1, upper));
        }

        return range;
    }
}
