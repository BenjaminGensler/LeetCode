/**
* Benjamin Gensler
* 11/17/2025
* 70. Climbing Stairs
*/
class Solution {
    public int climbStairs(int n) {
        // Same thing as a Fibonacchi sequence
        // values of x = F(0) and y = F(1)
        int x = 0;
        int y = 1;
        
        // loop to calculate the Fibonnacci sequence number F(n)
        for(int i = 0; i < n; i++){
            int curNum = x + y;
            x = y; 
            y = curNum;
        }

        return y;
    }
}
