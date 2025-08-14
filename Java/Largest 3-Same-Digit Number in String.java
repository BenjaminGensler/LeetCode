class Solution {
    public String largestGoodInteger(String num) {
        String largest3StringNumber = "";
        
        for(int i = 0; i < num.length() - 2; i++){
            if(num.charAt(i) == num.charAt(i+1) && num.charAt(i) == num.charAt(i+2)){
                if(largest3StringNumber == "" || largest3StringNumber.charAt(0) < num.charAt(i)){
                    largest3StringNumber = num.substring(i, i + 3);
                }
            }
        }

        return largest3StringNumber;
    }
}
