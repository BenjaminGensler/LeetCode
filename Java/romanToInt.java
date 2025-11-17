/**
* Benjamin Gensler
* 11/17/2025
* 13. Roman to Integer
*/
class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> romans = new HashMap<>();
        romans.put('M', 1000);
        romans.put('D', 500);
        romans.put('C', 100);
        romans.put('L', 50);
        romans.put('X', 10);
        romans.put('V', 5);
        romans.put('I', 1);
        int sum = 0;

        for(int i = 0; i < s.length() - 1; i++){
            int x = romans.get(s.charAt(i));
            int y = romans.get(s.charAt(i + 1));

            if(x >= y){
                sum += x;
            }
            else{
                sum -= x;
            }
        }

        sum += romans.get(s.charAt(s.length() - 1));

        return sum;
    }
}
