/**
* Benjamin Gensler
* 11/24/2025
* Q2. Evaluate Reverse Polish Notation
*/
class Solution {
    public int evalRPN(String[] tokens) {
        //handles base case of length 0
        if(tokens.length <= 1){
            return Integer.parseInt(tokens[0]);
        }

        Stack<Long> nums = new Stack<>();

        for(String token: tokens){
            //check for operators
            if(token.equals("+") || token.equals("-") || 
               token.equals("*") || token.equals("/")){
                long num2 = nums.pop();
                long num1 = nums.pop();
                switch(token){
                    case "+":
                        nums.push(num1 + num2);
                        break;
                    case "-":
                        nums.push(num1 - num2);
                        break;
                    case "*":
                        nums.push(num1 * num2);
                        break;
                    case "/":
                        nums.push(num1 / num2);
                        break;
                }
            }
            //if not an operator, it is a number(push to long stack)
            else{
                nums.push(Long.parseLong(token));
            }
        }
        return (int)(long)nums.pop();
    }
}
