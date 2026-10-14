//determine based on the line of customers bills (starting at 0 bills) in the current order if you will have enough bills to give the proper change back to serve everyone
class Solution {
    public boolean lemonadeChange(int[] bills) {
        int fives = 0;
        int tens = 0;

        for(int i = 0; i < bills.length; i++){
            if(bills[i] == 5){
                fives++;
            }

            //bill 10 case
            else if(bills[i] == 10){
                if(fives > 0){  //removes a 5 and adds a 10
                    fives--;
                    tens++;
                    continue;
                }
                return false;
            }

            //bill 20 case
            else{
                if(tens > 0 && fives > 0){  //removes 1 of each bill
                    tens--;
                    fives--;
                    continue;
                }
                else if(fives > 2){ //removes correct number of 5's
                    fives -= 3;
                    continue;
                }
                //returns false if change is impossible
                return false;
            }
        }

        return true;
    }
}
