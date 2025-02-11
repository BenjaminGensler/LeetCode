// Benjamin Gensler
// 2/10/25
// 1910. Remove All Occurrences of a Substring
// remove all instances of the string part from string s in order from left to right. Another one may occur while switching them so always get the first occurance to avoid error (Using .replace will break it in 2 cases)

class Solution {
    public String removeOccurrences(String s, String part) {
        // handle base case of part not in s
        if(!s.contains(part)){
            return s;
        }
        

        while(s.contains(part)){
            //finds first occurance of part index
            int index = s.indexOf(part);

            // removes the first part of s
            s = s.substring(0, index) + s.substring(index + part.length());
        }
        return s;
    }
}
