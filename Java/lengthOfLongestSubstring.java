/**
* Benjamin Gensler
* 11/20/2025
* 3. Longest Substring Without Repeating Characters
*/
class Solution {
    public int lengthOfLongestSubstring(String s) {
        //contains the letter and its most recent index (i in string)
        Map<Character, Integer> letters = new HashMap<>();
        int longestLength = 0;
        int start = 0;

        //for loop through string
        for(int i = 0; i < s.length(); i++){
            char curLetter = s.charAt(i);
            //Check if letters hashmap contains letter and is within current substring
            if(letters.containsKey(curLetter) && letters.get(curLetter) >= start){
                // update longest length if needed
                start = letters.get(curLetter) + 1;
            }
            letters.put(curLetter, i);
            
            // update longest length if needed
            if( i - start + 1 > longestLength){
                longestLength = i - start + 1;
            }
        }
            
        return longestLength;
    }
}
