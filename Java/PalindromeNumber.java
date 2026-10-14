//9. Palindrome Number
//Given an integer x, return true if x is a palindrome, and false otherwise.
class Solution {
    public boolean isPalindrome(int x) {
        // String version of x to compare values
        String xStr = Integer.toString(x);
        
        // right side counter
        int k = xStr.length() - 1;

        // loops through the string from left to right to see if palindrome
        for(int i = 0; i < xStr.length()/2; i++, k--){

            // if found not as palindrome then false
            if(!(xStr.charAt(i) == xStr.charAt(k))){
                return false;
            }
        }
        //if exiting loop, then palindrome 
        return true;
    }
}
