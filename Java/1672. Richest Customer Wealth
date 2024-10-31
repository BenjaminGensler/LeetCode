//The largest Wealth between each customer accounts[i] needs to be returned. each customer has multiple accounts accounts[i][k]

class Solution {
    public int maximumWealth(int[][] accounts) {
        int largestWealth = 0;
        for(int i = 0; i < accounts.length; i++){
            int curWealth = 0;
            for(int k = 0; k < accounts[i].length; k++){
                curWealth += accounts[i][k];
            }

            // assigning new largest Wealth found
            if(curWealth > largestWealth){
                largestWealth = curWealth;
            }
        }

        return largestWealth;
    }
}
