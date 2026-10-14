/*
* Benjamin Gensler
* '412. FizzBuzz, LeetCode'
* 11/15/2022
* Redone on 10/28/2025
*/

class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> arr = new ArrayList<>(n);

        for(int i = 1; i <= n; i++){
            // divisble by both 3 and 5 (ex/ 15, 30, etc.)
            if(i%3==0 && i%5==0){
                arr.add("FizzBuzz");
            }
            // divisble only by 3 (ex/ 3, 6, 9, etc.)
            else if(i%3==0){
                arr.add("Fizz");
            }
            // divisble only by 5 (ex/ 5, 10, 20, etc.)
            else if(i%5==0){
                arr.add("Buzz");
            }
            // not disible by 3 or 5
            else{
                arr.add(String.valueOf(i));
            }
        }
        
        // return the result List<String>
        return arr;
    }
}
