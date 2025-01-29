// Benjamin Gensler
// 1/29/25
//252. Meeting Rooms
// Determine if there as any overlap between the intervals and return false is overlap occurs

class Solution {
    public boolean canAttendMeetings(int[][] intervals) {
        //nested for loop checking each combination for meetings
        for(int i = 0; i < intervals.length - 1; i++){
            for(int k = i + 1; k < intervals.length; k++){
                // checks if the current intervals are valid
                if(intervals[i][1] <= intervals[k][0] || intervals[i][0] >= intervals[k][1]){
                    // no overlap found
                    continue;
                }

                // overlap found
                return false;

            }
        }
        return true;
    }
}
