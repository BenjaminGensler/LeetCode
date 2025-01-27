// Benjamin Gensler
// 1/27/25
// 509. Fibonacci Number
// Determine the F(n) for the Fibonacci Sequence

class Solution {
    public int fib(int n) {
        // values of x = F(0) and y = F(1)
        int x = 0;
        int y = 1;
        
        // loop to calculate the Fibonnacci sequence number F(n)
        for(int i = 0; i < n; i++){
            int curNum = x + y;
            x = y; 
            y = curNum;
        }

        // returns x (avoids excess code for base case 0)
        return x;
    }
}
