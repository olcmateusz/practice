package codewars.five.tictactoechecker;


/**
 * If we were to set up a Tic-Tac-Toe game, we would want to know whether the board's current state is solved, wouldn't we? Our goal is to create a function that will check that for us!

Assume that the board comes in the form of a 3x3 array, where the value is 0 if a spot is empty, 1 if it is an "X", or 2 if it is an "O", like so:

[[0, 0, 1],
 [0, 1, 2],
 [2, 1, 0]]
We want our function to return:

-1 if the board is not yet finished AND no one has won yet (there are empty spots),
1 if "X" won,
2 if "O" won,
0 if it's a cat's game (i.e. a draw).
You may assume that the board passed in is valid in the context of a game of Tic-Tac-Toe.
 */
public class Solution {

    public static int isSolved(int[][] board) {
    	

    	boolean crossRightWin = true;
    	boolean crossLeftWin = true;
    	boolean emptySpaces = false;
    	
    	int crossRightCheck = board[0][0];
    	int crossLeftCheck = board[0][board.length - 1];
    	
    	for(int i = 0; i < board.length; i++) {

    		int horizontalCheck = board[i][0];
    		int verticalCheck = board[0][i];
    		boolean horizontalWin = true;
        	boolean verticalWin = true;
    		
    		for (int j = 0; j < board.length; j++) {
    			
    			if (horizontalCheck != board[i][j] || horizontalCheck == 0) horizontalWin = false;
    			
    			if(verticalCheck != board[j][i] || verticalCheck == 0) verticalWin = false;
    			
    			if(i == j && (crossRightCheck == 0 || crossRightCheck != board[i][j])) crossRightWin = false;
    			
    			if(i + j == board.length -1 && (crossLeftCheck == 0 || crossLeftCheck != board[i][j])) crossLeftWin = false;

    			
    			if(board[i][j] == 0) emptySpaces = true;
    			
    			
    		}
    		
    		if(horizontalWin) return horizontalCheck;
    		
    		if(verticalWin) return verticalCheck;
    		

    		
    	}
    	if(crossRightWin) return crossRightCheck;
    	
    	if(crossLeftWin) return crossLeftCheck;
    	
    	if (emptySpaces) return -1;
    	return 0;
    }
    

}

