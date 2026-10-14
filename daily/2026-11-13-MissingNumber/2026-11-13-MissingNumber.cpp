class Solution {
public:
    int missingNumber(vector<int>& nums) {
        //sum of nums by length
        int numLength = nums.size();
        int sum = numLength * (numLength + 1 ) / 2;

        int sumTotal = 0;
        // loop to collect the current sum
        for(int i = 0; i < numLength; i++){
            sumTotal += nums[i];
        }

        //return the missing number by erasing the resulting sum from the ideal sum
        return sum - sumTotal;
    }
};