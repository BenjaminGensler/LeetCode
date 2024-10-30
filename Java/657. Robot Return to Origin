// This function determines if a robot returns to the starting point of 0,0 on a grid. The robot will moves up(U), down(D), right(R) and left(L)
class Solution {
    public boolean judgeCircle(String moves) {
        int horizontal = 0;
        int vertical = 0;

        for(int i = 0; i < moves.length(); i++){
            if(moves.charAt(i) == 'U'){        //increases vertical count
                vertical++;
            }
            else if(moves.charAt(i) == 'D'){   //decrease vertical count
                vertical--;
            }
            else if(moves.charAt(i) == 'R'){   //increases horizontal count
                horizontal++;
            }
            else{                                //decreases horizontal count (L)
                horizontal--;
            }
        }

        return (horizontal == 0 && vertical == 0);
    }
}
