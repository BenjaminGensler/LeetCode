// Benjamin Gensler
// 1/27/25
//231. Power of Two
// Find out if n is a power of two or not (returning a boolean)
class Solution {
    public boolean isPowerOfTwo(int n) {
        // if-else statements for base cases
        // base case n = 1
        if(n == 1){
            return true;
        }
        // base case 0 / negatives
        else if(n <= 0){
            return false;
        }
        // base case odd number
        else if(n % 2 != 0){
            return false;
        }

        // loop that continues to divide n until the value is 2 (true power of 2) or turns odd (false)
        while(n % 2 != 1){
            if(n == 2){
                return true;
            }

            n /= 2;
        }

        // Not a power of two
        return false;
    }
}
