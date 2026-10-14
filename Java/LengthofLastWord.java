//58. Length of Last Word
//Given a string s consisting of words and spaces, return the length of the last word in the string. A word is a maximal substring consisting of non-space characters only.

class Solution {
    public int lengthOfLastWord(String s) {
        // Love the joyboy reference for Ex/ 3
        
        int wordLength = 0;
        Boolean wordFound = false;
        
        // loops through to tell how long the last word is
        for(int i = s.length() - 1; i >= 0; i--){
            // returns the length of the last word
            if(s.charAt(i) == ' ' && wordFound == true){
                return wordLength;
            }

            // check if word is found and then increase
            if(s.charAt(i) != ' '){
                wordFound = true;
                wordLength++;
            }
        }

        return wordLength;
    }
}
