//14. Longest Common Prefix
//Write a function to find the longest common prefix string amongst an array of strings. If there is no common prefix, return an empty string "".
class Solution {
    public String longestCommonPrefix(String[] strs) {
        //value to hold common prefix
        String cPre = strs[0];
        
        //runs through the list of strings
        for(int i = 1; i < strs.length; i++){
            //word to compare with common prefix (cPre)
            String curWord = strs[i];
            String commonStr = "";
            //runs through each letters in the current string
            for(int k = 0; k < cPre.length() && k < curWord.length(); k++){
                // adds to commonStr the char if equal
                if((cPre.charAt(k) == curWord.charAt(k))){
                    commonStr += cPre.charAt(k);
                }
                // breaks out of not equal letters
                else{
                    break;
                }
            }

            cPre = commonStr;
        }

        //returns common prefix
        return cPre;
    }
}
