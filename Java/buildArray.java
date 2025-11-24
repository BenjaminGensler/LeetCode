/**
* Benjamin Gensler
* 11/24/2025
* Q1. Build an Array With Stack Operations
*/
class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> operations = new ArrayList<String>();
        int targetIndex = 0;
        int endNumber = target[target.length - 1]; //essential in saving time in the for loop

        //for loop that runs until i is the same as the last number as target's last #
        for(int i = 1; i <= endNumber; i++){
            //Check if the current i matches the corresponding targetIndex number from target
            if(target[targetIndex] == i){
                operations.add("Push");
                targetIndex++;
            }
            //runs if current i doen't match the targetIndex in target
            //Adds and instantly removes the number
            else{
                operations.add("Push");
                operations.add("Pop");
            }
        }

        //returns the resulting List<String> of Stack operations
        return operations;
    }
}
