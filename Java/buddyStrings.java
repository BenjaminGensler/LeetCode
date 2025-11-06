/**
* Benjamin Gensler
* 11/06/2025
* 859. Buddy Strings
*/
class Solution {
    public boolean buddyStrings(String s, String goal) {
        //Check to see if the length of s and goal are the same or not or if they are the same string (cant switch values)
        if(!(s.length() == goal.length()) || s.length() == 1){
            return false;
        }
        
         // if they are the same try and find two letters that are the same
        if(s.equals(goal)){
            for(int i = 0; i <= s.length() - 2; i++){
                for(int j = i + 1; j <= s.length() - 1; j++){ // Change: j = i + 1
                    if(s.charAt(i) == s.charAt(j)){
                        return true;
                    }
                }
            }
            return false; // Add return false for no duplicates case
        }
        
        // Move this logic outside the if block for different strings
        for(int i = 0; i <= s.length() - 2; i++){
            for(int j = i + 1; j <= s.length() - 1; j++){
                if((s.charAt(i) != goal.charAt(i)) && (s.charAt(j) != goal.charAt(j))){
                    // if you can switch them and then s = goal then true else false
                    char[] sArray = s.toCharArray();
                    char temp = sArray[i];
                    sArray[i] = sArray[j];
                    sArray[j] = temp;
                    String newS = new String(sArray);
                    return newS.equals(goal);
                }
            }
        }
        return false;
    }
}
