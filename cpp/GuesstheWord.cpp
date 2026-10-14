// Function that acts similar to the Wordle or Mastermind game where you need to guess the correct word before you run out of guesses (Partially Solved)
/**
 * // This is the Master's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface Master {
 *     public int guess(String word) {}
 * }
 */
class Solution {
    public void findSecretWord(String[] words, Master master) {
        String curWord = words[0];
        words[0] = null;
        int similarCount = master.guess(curWord); //gives the similar letters

        //for each guess (goes by words.length due to the allowedGuesses changing but unable to access)
        for(int i = 0; i < words.length; i++){
            // System.out.println(i);
            //for each word
            for(int k = 0; k < words.length - 1; k++){

                int equalChars = 0;

                //for each character
                for(int j = 0; j < curWord.length() - 1; j++){
                    // For some reason it's better to put the check for null here rather that at beginning of each word
                    if(words[k] == null){
                        break;
                    }
                    // System.out.println(curWord + " vs " + words[k] + " " + j);
                    if(curWord.charAt(j) == words[k].charAt(j)){
                        equalChars++;
                    }

                    if(equalChars > similarCount){
                        words[k] = null;
                        continue;
                    }
                }
                if (equalChars != similarCount) {
                    words[k] = null;
                }
            }

            // making the next guess
            for (int k = 0; k < words.length; k++) {
                if (words[k] != null) {
                    curWord = words[k];
                    similarCount = master.guess(curWord);
                    words[k] = null;
                    break;
                }
            }
        }
    }
}
