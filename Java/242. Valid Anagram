//Given two strings s and t, return true if t is an anagram of s, and false otherwise.

class Solution {
    public boolean isAnagram(String s, String t) {
        //change s and t to arrays and sorted them by char
        char[] arrS = s.toCharArray();
        Arrays.sort(arrS);
        char[] arrT = t.toCharArray();
        Arrays.sort(arrT);

        if(arrS.length > arrT.length || arrT.length > arrS.length){
            return false;
        }

        for(int i = 0; i < arrS.length; i++){
            if(arrS[i] != arrT[i]){
                return false;
            }
        }

        return true;
    }
}
