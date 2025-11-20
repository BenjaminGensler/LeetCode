/**
* Benjamin Gensler
* 11/20/2025
* 929. Unique Email Addresses
*/
class Solution {
    public int numUniqueEmails(String[] emails) {
        // String[] realEmails = new String[emails.length];
        List<String> realEmails = new ArrayList<>();
        
        for(int i = 0; i < emails.length; i++){
            StringBuilder email = new StringBuilder(emails[i]);
            for(int k = 0; email.charAt(k) != '@'; k++){
                if(email.charAt(k) == '.'){
                    email.deleteCharAt(k);
                    k--;
                }
                else if(email.charAt(k) == '+'){
                    while(email.charAt(k) != '@'){
                        email.deleteCharAt(k);
                    }
                    k--;
                }
            }
            if(!(realEmails.contains(email.toString()))){
                realEmails.add(email.toString());
                System.out.println(email);
            }
        }
        
        return realEmails.size();
    }
}
