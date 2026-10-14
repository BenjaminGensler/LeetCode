// 125. Valid Palindrome
// A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers. Given a string s, return true if it is a palindrome, or false otherwise.
class Solution {
    public boolean isPalindrome(String s) {
        // setting all letters as lowercase
        s = s.toLowerCase();

        // using the '.replaceAll' method to remove non lower case letters or numbers
        s = s.replaceAll("[^a-z0-9]", "");

        // loop through k, comparing characters from left to right
        for(int k = 0; k < s.length() /2; k++){
            if(s.charAt(k) != s.charAt(s.length() - (k + 1))){
                return false;
            }
        }

        return true;
    }
}
