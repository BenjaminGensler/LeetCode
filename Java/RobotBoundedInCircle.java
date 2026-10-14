//With a string of 'instrtuctions' you need to go through the commands of the robot and determine if the robot will ever return to the original location or run away
// The commands consist of G (forward), L (turn left), and R (turn right)

//I used a comparison of rise and run to determine if the the robot will reach the rotation based on the different in x,y values between 2 rotations of instructions
class Solution {
    public boolean isRobotBounded(String instructions) {
        int dirCounter = 0; //starting position of North (0) ["North", "East", "South", "West"] 0,1,2,3
        int x = 0;
        int y = 0;
        int x2 = 0;
        int y2 = 0;

        //for loop to run the words twice
        for(int k = 0; k <2; k++){
            x2 = x; // only assigns the original values for comparison of rise and run after the first rotation
            y2 = y;
            for(int i = 0; i < instructions.length(); i++){
                //Handles forward command
                if(instructions.charAt(i) == 'G'){
                    if(dirCounter == 0){
                        x++;
                    }
                    else if(dirCounter == 1){
                        y++;
                    }
                    else if(dirCounter == 2){
                        x--;
                    }
                    else{
                        y--;
                    }
                }
                //Handles Left rotations
                else if(instructions.charAt(i) == 'L'){
                    if(dirCounter == 0){
                        dirCounter = 3;
                    }
                    else{
                        dirCounter--;
                    }
                }
                //Handles Right rotations
                else{
                    if(dirCounter == 3){
                        dirCounter = 0;
                    }
                    else{
                        dirCounter++;
                    }
                }
            }
        }

        // base valid case
        if(x == 0 && y == 0){
            return true;
        }

        // returns false if the rise and run are the same as the first rotation
        if((x-x2) == x2 && (y - y2) == y2){
            return false;
        }

        // return true if rise and run are different
        return true;
    }
}
