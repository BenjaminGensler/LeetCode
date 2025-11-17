/**
* Benjamin Gensler
* 11/17/2025
* 1137. N-th Tribonacci Number
*/
class Solution {
    public int tribonacci(int n) {
        if(n < 1) return 0;
        // values of x = tF(0) and y = tF(1) and z = tF(2)
        int x = 0;
        int y = 0;
        int z = 1;
        
        // loop to calculate the Tribonacci sequence number tF(n)
        for(int i = 0; i < n - 1; i++){
            int curNum = x + y + z;
            x = y; 
            y = z;
            z = curNum;
        }

        // returns z (avoids excess code for base case 0)
        return z;
    }
}
