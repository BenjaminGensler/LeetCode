//67. Add Binary
//Given two binary strings a and b, return their sum as a binary string.
// Ex/ '11' and '101' would return '1000'
class Solution {
    // uses StringBuilder as a way to replace the string a with a new value
    public String addBinary(String a, String b) {        
        // loops through the desired string (b) to add to a
        for(int i = 1; i <= b.length(); i++){
            
            // adds the remaining of b if a is shorter than b
            if(i > a.length()){
                a = b.substring(0, b.length() - i + 1) + a;
                break;
            }
            // if the current valuei s a 1
            else if(b.charAt(b.length() - i) != '0'){
                // loops through a (right to left) adding the current 1 from b
                for(int k = a.length() - i; k >= 0; k--){
                    // changes current char in a to 0 if 1 is found
                    if(a.charAt(k) == '1'){
                        // changes the current char to 0
                        StringBuilder sb = new StringBuilder(a);
                        sb.setCharAt(k, '0');
                        a = sb.toString();
                    }
                    // sets as 1 if zero appears
                    else{
                        // changes the current char to 1
                        StringBuilder sb = new StringBuilder(a);
                        sb.setCharAt(k, '1');
                        a = sb.toString();
                        break; //from k loop
                    }

                    // adds a character if non existance
                    if(k == 0){
                        a = "1" + a;
                        break;
                    }
                }
            }
        }

        return a;
    }
}
