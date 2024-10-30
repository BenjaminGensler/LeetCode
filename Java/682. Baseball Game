//Function where you score a game based on strange rules and returns the sum of all scores
// + - adds the previous 2 scores
// D - adds the last scores * 2
// C - invalidates the previous scores
// Any Number - Added to the record of scores

class Solution {
    public int calPoints(String[] operations) {
        int[] record = new int[operations.length];
        int k = -1;

        // loops through operations
        for(int i = 0; i < operations.length; i++){
            // Creates a values that is the sum of the last 2 values
            if(operations[i].equals("+")){
                k++;
                record[k] = record[k-1] + record[k-2];
            }
            //creates a values 2 times as large as the last
            else if(operations[i].equals("D")){
                k++;
                record[k] = record[k-1] * 2;
            }
            //invalidates the previous value
            else if(operations[i].equals("C")){
                record[k] = 0;
                k--;
            }
            //adds the plain number
            else{
                k++;
                record[k] = Integer.parseInt(operations[i]);
            }
        }

        //adds the sum of the values in record
        int sum = 0;
        while(k >= 0){
            sum+= record[k];
            k--;
        }
        return sum;
    }
}
