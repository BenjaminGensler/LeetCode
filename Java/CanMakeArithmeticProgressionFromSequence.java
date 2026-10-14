//A sequence of numbers is called an arithmetic progression if the difference between any two consecutive elements is the same.
//Given an array of numbers arr, return true if the array can be rearranged to form an arithmetic progression. Otherwise, return false.

class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        //sorts array for easy comparison of values
        Arrays.sort(arr);
        int diff = arr[1] - arr[0]; //difference that needs to be similar across the board

        // loop checks to make sure the difference between all numbers is the same
        for(int i = 2; i < arr.length; i++){
            if(arr[i] - arr[i-1] != diff){
                return false;
            }
        }

        return true;
    }
}
