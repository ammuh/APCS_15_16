/**
 * 
 * @author Your name
 * @period #
 *
 */
import java.util.*;

public class TokenPass {
	private int[] board; 
    private int currentPlayer; 
	
	public static void main(String args[]){
	    TokenPass t = new TokenPass(5, 3354);
	    t.distributeCurrentPlayerTokens();
	}
	/**
	 * Prints the current board 
	 * in the following format [#, #, # ...]
	 */
	private void printCurrentBoard()
	{
		System.out.println(Arrays.toString(board));
	}
	/**
	 * Creates the board array to be of size playerCount and fills it with
	 * random integer values from 1 to 10, inclusive. Initializes currentPlayer
	 * to a random integer value in the range between 0 and playerCount-1,
	 * inclusive. The method also prints the player count, current player, and 
	 * the initial board
	 * 
	 * @param playerCount
	 *            the number of players
	 * @param seed
	 * 			  the seed for the random number generator
	 */
	public TokenPass(int playerCount, int seed) {
		Random r = new Random(seed);
		board = new int[playerCount];
		for(int i =0; i < board.length; i++){
		    board[i] = r.nextInt(10) + 1;
		}
		
		currentPlayer = r.nextInt(playerCount);
		System.out.println("Player count = " + playerCount); 
		System.out.println("Current player = " + currentPlayer);
		System.out.print("Initial Board: ");
		printCurrentBoard();
	}

	/**
	 * Distributes the tokens from the current player's position one at a time
	 * to each player in the game. Distribution begins with the next position
	 * and continues until all the tokens have been distributed. If there are
	 * still tokens to distribute when the player at the highest position is
	 * reached, the next token will be distributed to the player at position 0.
	 * The method also prints the board after the tokens are distributed.
	 * Precondition: the current player has at least one token. 
	 * Postcondition: the current player has not changed. 
	 */
	public void distributeCurrentPlayerTokens() {
	    int tokens = board[currentPlayer];
	    board[currentPlayer] =0;
	    int token1 = (int)tokens/board.length;
	    int token2 = tokens % board.length;
	    int i =0;
	    while(i < board.length){
	        board[i] = board[i] + token1;
	        inc();
	    }
	    int i = 0;
	    while(i <){
	        
	    }
	        
	    while(tokens > 0){
	        board[currentPlayer] = board[currentPlayer] + 1;
            board[before] = board[before] - 1;
            tokens--;
            before = currentPlayer;
	        inc();
	    }
	    currentPlayer = currentPlayer
	    currentPlayer = pos;
        printCurrentBoard();
	}
    
    private void inc(){
        currentPlayer++;
        if(currentPlayer > board.length-1){
            currentPlayer = 0;
        }
    }

}
