// Finding the longest streak of squares in an array Ex/ [1,2,3,4,5,6,7,8] has a square streak sub array of [2,4,8] ... Output = 3

class Solution {
    public int longestSquareStreak(int[] nums) {
        int longestStreak = -1;
        
        //if not possible to even determine if there is a square streak
        if(nums.length < 2){
            return -1;
        }

        //sort array
        Arrays.sort(nums);

        // Create a HashSet from the array (as long to avoid exceeding Integer.MAX_VALUE)
        Set<Long> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add((long) num);
        }

        for(int i = 0; i < nums.length; i++){
            int curStreak = -1;
            int k = i;
            long prevNum = nums[i]; //set as long to avoid values larger than (Integer.MAX_VALUE)

            // checks if the next square exists and not just the number 1 (helps to avoid infinite loop)
            while(numSet.contains(prevNum * prevNum) && prevNum != 1){    //change from long to int to avoid type conflict
                prevNum *= prevNum;
                curStreak++;
                System.out.println("CurStreak: " + curStreak + "Now looking for " + (prevNum * prevNum));
            }
            
            //determines if they found a new streak
            if(curStreak > longestStreak - 2 && curStreak != -1){
                longestStreak = curStreak + 2;
            }
        }

        return longestStreak;
    }
}
