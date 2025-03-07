// Benjamin Gensler
// 3/7/25
// 422. Valid Word Square
// Determine from a List of Strings if the provided word square is read the same by column/ row numbers. (Ex/ [a,b], [b] -> True (ab = ab)     Ex2/ [a,b], [a] -> False ( ab != aa)
class Solution {
    public boolean validWordSquare(List<String> words) {
        for (int i = 0; i < words.size(); i++) {
            // test string
            String test = "";

            // loop to create vertical test string
            for (int k = 0; k < words.get(i).length() && k < words.size(); k++) {
                // checks if the current word is longer than the current index
                if (words.get(k).length() > i) {
                    test += words.get(k).charAt(i);
                } else {
                    return false;
                }
            }

            // checks if test and the current word are the same
            if (!test.equals(words.get(i))) {
                return false;
            }
        }

        return true;
    }
}
