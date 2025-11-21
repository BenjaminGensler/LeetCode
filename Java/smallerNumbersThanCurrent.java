/**
* Benjamin Gensler
* 11/21/2025
* How Many Numbers Are Smaller Than the Current Number
*/
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        // creates an array to be ordered for use in filling the hashtable
        int[] orderedNums = nums.clone();
        Arrays.sort(orderedNums);
        //holds the size difference where the number is the key and the smaller numbers count is the value
        HashMap<Integer, Integer> numsSmallerRatio = new HashMap<>();
        
        for(int i = 0; i < orderedNums.length; i++){
            if(!numsSmallerRatio.containsKey(orderedNums[i])){
                numsSmallerRatio.put(orderedNums[i], i);
            }
        }

        //Alters the original nums to apply the count for numbers smaller than the given number
        for(int i = 0; i < nums.length; i++){
            nums[i] = numsSmallerRatio.get(nums[i]);
        }

        return nums;
    }
}
