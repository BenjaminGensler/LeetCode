//387. First Unique Character in a String
//Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
class Solution {
    public int firstUniqChar(String s) {
        int index = -1; //value to hold first unique char position
        Boolean isUnique = false; //boolean to confirm if unique char exists

        //loops through letters char by char
        for(int i = 0; i < s.length(); i++){
            for(int k = 0; k < s.length(); k++){
                //makes sure no repeating values (not the same value and not same char)
                if(i != k && s.charAt(i) == (s.charAt(k))){
                    break;
                }
                //if reaches end of string then first unique
                if(k == s.length() - 1){
                    isUnique = true;
                    break;
                }
            }

            //if unique value found then sets index
            if(isUnique){
                index = i;
                break;
            }
        }

        //returns index
        return index;
    }
}
