//Given a string s, check if it can be constructed by taking a substring of it and appending multiple copies of the substring together.
class Solution {
    public boolean repeatedSubstringPattern(String s) {

        for(int i = 0; i < s.length() / 2; i++){
            //if statement that skips the interation if not possible for repetition
            if(s.length() % (i+1) != 0){
                continue;
            }
            String copyS = s;

            copyS = copyS.replaceAll(copyS.substring(0,i+1), "");
            System.out.println(copyS);

            if(copyS.equals("")){
                return true;
            }
        }

        return false;
    }
}
