//205. Isomorphic Strings
//Given two strings s and t, determine if they are isomorphic.
//Two strings s and t are isomorphic if the characters in s can be replaced to get t.
//All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.

class Solution {
    public boolean isIsomorphic(String s, String t) {
        // Map to help compare values
        Map<Character, Character> letters = new HashMap<>();
        // Set to track already mapped characters in t
        Set<Character> mappedChars = new HashSet<>();
        boolean isoMorphicPossible = true;

        // Loop through the words
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
            System.out.println(t.charAt(i));
            // Adds letter from s as key and t as value if it doesn't exist
            if (!letters.containsKey(s.charAt(i)) && !mappedChars.contains(t.charAt(i))) {
                letters.put(s.charAt(i), t.charAt(i));
                mappedChars.add(t.charAt(i));
            }

            //checks if the value contained in letters is equal to the value
            else if(letters.containsKey(s.charAt(i)) && letters.get(s.charAt(i)).equals(t.charAt(i))){
                continue;
            }
            else {
                isoMorphicPossible = false;
                System.out.println("Uh-Oh");
                break;
            }
        }
        return isoMorphicPossible;
    }
}
