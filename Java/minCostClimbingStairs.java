/*
* Benjamin Gensler
* 746. Min Cost climbing Stairs
* 2/5/2026
*/
class Solution {
    public int minCostClimbingStairs(int[] cost) {
        // Short enough of an array to return 0
        if(cost.length < 2){
            return 0;
        }

        int stepCost1 = 0;
        int stepCost2 = 0;

        for (int i = 2; i <= cost.length; i++) {
            int currentStepCost = Math.min(
                stepCost1 + cost[i-1], 
                stepCost2 + cost[i-2]
            );
            
            stepCost2 = stepCost1;
            stepCost1 = currentStepCost;
        }
        
        return stepCost1;

    }
}
