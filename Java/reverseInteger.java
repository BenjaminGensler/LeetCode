// Benjamin Gensler
// 1/27/25
//7. Reverse Integer
//Reverse the order of an integer (keeping the same sign +/-)
class Solution {
    public int reverse(int x) {
        // gets a string version of x
        String stringNum = Integer.toString(x);
        // creates an array to interate through to hold the digits
        int[] intArr = new int[stringNum.length()];
        int counter = 0;
        boolean isNegative = (stringNum.charAt(0) == '-');

        // loop to add the digits to array
        for(int i = intArr.length - 1; i >= 0; i--){
            //break out if the character is not a digit
            if(stringNum.charAt(i) == '-'){ break;}
            // adds the character as an int to the int array
            intArr[counter] = Character.getNumericValue(stringNum.charAt(i));
            counter++;
        }

        // creates a long to avoid overflow issues
        long result = 0;

        // loop to create the reverse result 
        for(int i = 0; i < counter; i++){
            result = result * 10 + intArr[i];
        }

        //return 0 if overflow occurs
        if(result >= Integer.MAX_VALUE){
            return 0;
        }

        // turns it into a negative value is it's a negative
        if(isNegative){
            result *= -1;
        }

        // returns result as requested int value
        return (int) result;
    }
}
