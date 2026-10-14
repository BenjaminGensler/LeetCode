//28. Find the Index of the First Occurrence in a String
//Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
class Solution {
    public int strStr(String haystack, String needle) {
        int index = -1;

        // checks to see if a string is exists in another string
        for(int i = 0; i < (haystack.length() - needle.length()) + 1; i++){

            // if the currently checked string is equal to needle then set index and break
            if(haystack.substring(i, i+needle.length()).equals(needle)){
                index = i;
                break;
            }
        }

        return index;
    }
}
