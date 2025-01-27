// Benjamin Gensler
// 1/27/25
// 258. Add Digits
// Take the number and add all the digits together. Repeat this process until you only have a single digit (0-9)
class Solution {
    public int addDigits(int num) {
        // loop to keep adding the digits until its a single digit
        while(num > 9){
            // gets a string version of num
            String stringNum = Integer.toString(num);
            // creates an array to interate through to hold the digits
            int[] intArr = new int[stringNum.length()];

            // loop to add the digits to array
            for(int i  = 0; i < intArr.length; i++){
                intArr[i] = Character.getNumericValue(stringNum.charAt(i));
            }

            // value to collect arrays digits sum
            int sum = 0;

            // loop to add all of the current digits sum
            for(int i = 0; i < intArr.length; i++){
                sum += intArr[i];
            }

            // change num value to new value
            num = sum;
        }
        
        // returns the single digit
        return num;
    }
}
