// Benjamin Gensler
// 2/10/25 (Daily question)
// 3174. Clear Digits
// remove all digits from a string (If a digit is removed then remove the char to the left of the digit if one exists)
class Solution {
    public String clearDigits(String s) {
        // Create a StringBuilder for easy alterations of s
        StringBuilder sb = new StringBuilder(s);
        int i = 0;
        // loop through sb to look for digits
        while(i < sb.length()){
            // check if char is digit (0-9)
            if(sb.charAt(i) >= '0' && sb.charAt(i) <= '9'){
                sb.deleteCharAt(i);
                // remove the left character if one exists
                if(i > 0) {
                    sb.deleteCharAt(i - 1);
                    i--; //reduce i since left character was removed
                }
            }
            //increment i if no digit found
            else {
                i++;
            }
        }

        //convert Stringbuilder to String
        return sb.toString();
    }
}
