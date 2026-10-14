class Solution {
    //universal list of vowels (capitals included)
    char[] vowels = {'a','e','i','o','u','A','E','I','O','U'};

    public String reverseVowels(String s) {
        
        //creates char list of the input String
        char[] word = s.toCharArray();

        int curRight = s.length() - 1;
        char placeholder;

        //loop going left to right
        for(int i = 0; i <= curRight; i++) {
            
            if(checkVowel(word[i])) {
                //loop going right to left
                for(int j = curRight; j >= i; j--) {
                    if(checkVowel(word[j])) {
                        //reverses current char in words
                        placeholder = word[j];
                        word[j] = word[i];
                        word[i] = placeholder;

                        // re assigns curRight to avoid error
                        curRight = j - 1;
                        break;
                    }
                }
            }
        }
        //combines the char[] to a String
        return new String(word);
    }

    //function to check if current character is a vowel or not
    public boolean checkVowel(char c) {
        for (int i = 0; i < vowels.length; i++) {
            if (c == vowels[i]) {
                return true;
            }
        }
        return false;
    }
};
