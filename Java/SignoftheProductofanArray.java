//Implement a function signFunc(x) that returns the product of the array:
//Return the follow:
//1 if x is positive.
//-1 if x is negative.
//0 if x is equal to 0.
//You are given an integer array nums. Let product be the product of all values in the array
class Solution {
    public int arraySign(int[] nums) {
        
        Arrays.sort(nums);

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                return 0;
            }
            else if(nums[i] > 0){
                if(i % 2 == 0){
                    return 1;
                }
                else{
                    return -1;
                }
            }
        }
        return -1;
    }
}
