//326. Power of Three
//Given an integer n, return true if it is a power of three. Otherwise, return false.
//An integer n is a power of three, if there exists an integer x such that n == 3^x.
class Solution {
    public boolean isPowerOfThree(int n) {
        //base case
        if(n == 1){
            return true;
        }
        // negatives
        if(n <= 0){
            return false;
        }


        //loops through continuously until either confirmed not a power of 3 or breaks through
        while(n >= 3){
            //returns false if not a power of 3
            if(n % 3 != 0){
                return false;
            }
            n /= 3;
        }

        //returns if power of three (completely divisble by 3)
        return n == 1;
    }
}
