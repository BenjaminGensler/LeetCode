//1/24/25
// Benjamin Gensler
// Finding the Integer from 1 -> n that is considered the pivot point (where the sum of everything to the left of the pivot point, and everything to the right of the pivot point are equal) Return -1 if non-existant
// Ex/ n = 3, pivot point = 3 (1 + 2 = 3  & 3 = 3)     or   n = 8, pivot point = 6 (1 + 2 + 3 + 4 + 5 + 6 = 21  &  6 + 7 + 8 = 21)     or  n = 2, pivot point = -1 (non existant)
class Solution {
    public int pivotInteger(int n) {
        // getting the total sum of the values (Series formula)
        int leftCompareVal = n * (n + 1) / 2;
        int rightCompareVal = n;

        //for loop to go down the list and see if a pivot exists
        for(int i = n - 1; i >= n / 2; i--){

            // returns resulting pivot point if found
            if(leftCompareVal == rightCompareVal){
                return i + 1;
            }
            // alters the compared values for next interation
            else{
                leftCompareVal -= i + 1;
                rightCompareVal += i;
            }
        }
        // no pivot point was found
        return -1;
    }
}
