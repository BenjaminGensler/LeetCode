/**
* Benjamin Gensler
* 11/06/2025
* 422. Valid Word Square
*/
class Solution {
    public boolean validWordSquare(List<String> words) {
        // Check if words[i][j] == words[j][i]
        for (int i = 0; i < words.size(); i++) {
            String word = words.get(i);
            for (int j = 0; j < word.length(); j++) {                
                if (j >= words.size() || i >= words.get(j).length()){
                    return false;
                }
                
                // Compare characters
                if (word.charAt(j) != words.get(j).charAt(i)) {
                    return false;
                }
            }
        }
        return true;


    }
}
