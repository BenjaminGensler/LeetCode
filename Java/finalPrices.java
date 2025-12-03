/**
* Benjamin Gensler
* 12/03/2025
* Monotonic Stack: Q1. Final Prices With a Special Discount in a Shop
*/
class Solution {
    public int[] finalPrices(int[] prices) {

        int n = prices.length;
        Stack<Integer> smaller = new Stack<Integer>();
        
        for(int i = 0; i < n; i++){
            while(!smaller.isEmpty() && prices[i] <= prices[smaller.peek()]){
                prices[smaller.pop()] -= prices[i];
            }
            smaller.push(i);
        }

        return prices;
    }
}
