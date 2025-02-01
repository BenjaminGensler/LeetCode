// Benjamin Gensler
// 1/31/25
// 1833. Maximum Ice Cream Bars
// Determine what the amount of ice cream bars is that can be purchased with the given amount of coins. The cost can vary.
class Solution {
    public int maxIceCream(int[] costs, int coins) {
        // sort the array to purchase the lowest priced bars first
        Arrays.sort(costs);
        int count = 0; //counter for bars purchased

        // loops through array
        for(int i = 0; coins > 0 && i < costs.length; i++){
            coins -= costs[i];  // remove cost of coins

            //check to see if we have enough coins to purchase next bar
            if(coins >= 0){
                count++;
            }
            else{
                break;
            }

        }

        return count;
    }
}
