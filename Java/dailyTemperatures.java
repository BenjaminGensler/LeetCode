/**
* Benjamin Gensler
* 12/03/2025
* Monotonic Stack: Q2. Daily Temperatures
*/
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        Stack<Integer> warmer = new Stack<Integer>();
        for(int i = 0; i < n; i++){
            while(!warmer.isEmpty() && temperatures[i] > temperatures[warmer.peek()]){
                int curTemp = warmer.pop();
                temperatures[curTemp] = i - curTemp;
            }
            warmer.push(i);
        }
        
        //Fix ending pieces where higher temp never comes
        while(!warmer.isEmpty()){
            temperatures[warmer.pop()] = 0;
        }

        return temperatures;
    }
}
