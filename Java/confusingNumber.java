/**
* Benjamin Gensler
* 11/06/2025
* 1056. Confusing Number
*/
class Solution {
    public boolean confusingNumber(int n) {
        String str = String.valueOf(n);
        StringBuilder rotated = new StringBuilder();

        for(int i = str.length() - 1; i >= 0; i--){
            char c = str.charAt(i);
            //Add the confusing 180 equivalent number
            if (c == '0') rotated.append('0');
            else if (c == '1') rotated.append('1');
            else if (c == '6') rotated.append('9');
            else if (c == '8') rotated.append('8');
            else if (c == '9') rotated.append('6');
            //None of the crazy numbers found
            else return false;
        }

        // Change the stringBuilder to a String and check if Palindrome
        if(str.equals(rotated.toString())){
            return false;
        }

        // Valid confusing number found
        return true;
    }
}
