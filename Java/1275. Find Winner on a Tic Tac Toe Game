// functions that fills out a tic tac toe board and determines if a winner exists, a draw, or if the game is still underway (Pending)
class Solution {
    public String tictactoe(int[][] moves) {
        String[][] board = new String[3][3];
        int madeMoves = 0;
        
        //adds the corresponding moves to the board
        for(int i = 0; i < moves.length; i++){
            if(i % 2 == 0){ //A moves for X
                board[moves[i][0]][moves[i][1]] = "A";
            }
            else{           //B moves for 0
                board[moves[i][0]][moves[i][1]] = "B";
            }
            madeMoves++;
        }
        
        for(int i = 0; i < 3; i++){
            System.out.println(board[i][0] + " " + board[i][1] + " " + board[i][2]);
        }

        //checks for winner

        //row checks
        if(board[0][0] == board[0][1] && board[0][1] == board[0][2] && board[0][0] != null && board[0][1] != null && board[0][2] != null){   //checks for row 1
            return board[0][0];
        }
        else if(board[1][0] == board[1][1] && board[1][1] == board[1][2] && board[1][0] != null && board[1][1] != null && board[1][2] != null){   //checks for row 2
            return board[1][1];
        }
        else if(board[2][0] == board[2][1] && board[2][1] == board[2][2] && board[2][0] != null && board[2][1] != null && board[2][2] != null){   //checks for row 3
            return board[2][2];
        }
        //column checks
        if (board[0][0] == board[1][0] && board[1][0] == board[2][0] && board[0][0] != null && board[1][0] != null && board[2][0] != null) {
    return board[0][0];
}
        if (board[0][1] == board[1][1] && board[1][1] == board[2][1] && board[0][1] != null && board[1][1] != null && board[2][1] != null) {
    return board[0][1];
}
        if (board[0][2] == board[1][2] && board[1][2] == board[2][2] && board[0][2] != null && board[1][2] != null && board[2][2] != null) {
    return board[0][2];
}
//diagnoal checks
        else if(board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != null && board[1][1] != null && board[2][2] != null){   //checks forward middle diagonal
            return board[1][1];
        }
        else if(board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] != null && board[1][1] != null && board[2][0] != null){   //checks for backward middle diagonal
            return board[1][1];
        }
        
        
        //returns other possibilities
        if(madeMoves == 9){
            return "Draw";
        }

        
        return "Pending";
    }
}
