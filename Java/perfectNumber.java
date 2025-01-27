// Benjamin Gensler
// 1/27/25
// 507. Perfect Number
// Determine if n is a perfect number (a value where all of its divisors added together equal the perfect number)
class Solution {
    public boolean checkPerfectNumber(int num) {
        // base case of 0 and 1 
        if(num == 0 || num == 1){
            return false;
        }

        // sum of all divisors
        int diviserSum = 0;
        
        // Loop to determine what values are divisor's of num
        for(int i = 1; i <= num / 2; i++){
            
            // adds the divisor to divisorSum if divisor found
            if(num % i == 0){
                diviserSum += i;
            }
        }

        // checks to see if perfect number is found
        if(diviserSum == num){
            return true;
        }

        return false;
    }
}
