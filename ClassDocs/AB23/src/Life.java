/**
 * @author Ammar Husain
 * @period 4
 */
import java.io.File;
import java.util.*;


public class Life {
	//instance variables
	//Your code goes here
	private boolean[][] grid;
	private int gen;
	
	/** constructor
	 * reads in the data from the given file and sets up the 
	 * life matrix
	 * @param fname - name of file
	 */
	 	public Life(String fname)
	{
	    gen = 0;
	    try{
	        grid = new boolean[20][20];
		Scanner s = new Scanner(new File(fname));
		int num = s.nextInt();
		while(s.hasNextLine()){
		    int row = s.nextInt() - 1;
		    int col = s.nextInt() - 1;
		    grid[row][col] = true; 
		}
	    }catch(Exception e){
	        System.out.println(e);
	    }
	    
	}
	/**
	 * method to print the life matrix
	 */
	public void printMatrix()
	{	
		System.out.println("        12345678901234567890");
		System.out.println();
		for(int i = 0; i < grid.length; i++){
			System.out.print((i+1)+ "       ");
		    for(int a = 0; a < grid[i].length; a++){
		        if(grid[i][a]){
		            System.out.print("*");
		        }
		        else{
		            System.out.print(" ");
		        }
		    }
		    System.out.println();
		}
	}
	
	/**
	 * Method to count the number of neighbors of the given cell
	 * in the life matrix
	 * @param row - row number
	 * @param col - column number
	 * @return - number of neighbors of the given cell
	 */
	 

	public int numberOfNeighbors(int row, int col){
	    row--;
	    col--;
	    
	    int n = 0;
	    try{
	        boolean elem = grid[row+1][col];
	        if(elem){
	            n++;
	        }
	    }catch(ArrayIndexOutOfBoundsException e){}
	    try{
	        boolean elem = grid[row-1][col];
	        if(elem){
	            n++;
	        }
	    }catch(ArrayIndexOutOfBoundsException e){}
	    try{
	        boolean elem = grid[row][col+1];
	        if(elem){
	            n++;
	        }
	    }catch(ArrayIndexOutOfBoundsException e){}
	    try{
	        boolean elem = grid[row][col-1];
	        if(elem){
	            n++;
	        }
	    }catch(ArrayIndexOutOfBoundsException e){}
	    try{
	        boolean elem = grid[row+1][col+1];
	        if(elem){
	            n++;
	        }
	    }catch(ArrayIndexOutOfBoundsException e){}
	    try{
	        boolean elem = grid[row+1][col-1];
	        if(elem){
	            n++;
	        }
	    }catch(ArrayIndexOutOfBoundsException e){}
	    try{
	        boolean elem = grid[row-1][col+1];
	        if(elem){
	            n++;
	        }
	    }catch(ArrayIndexOutOfBoundsException e){}
	    try{
	        boolean elem = grid[row-1][col-1];
	        if(elem){
	            n++;
	        }
	    }catch(ArrayIndexOutOfBoundsException e){}
	    return n;
	}
	/**
	 * method to determine if given cell is empty
	 * @param row - cell row number
	 * @param col - cell column number
	 * @return true if it is empty, false otherwise
	 */
	private boolean isEmpty(int row, int col)
	{
		if(grid[row][col]){
			return true;
		}
		return false;
	}
	
	/** 
	 * method that simulates the game of life
	 */
	public void generation()
	{
		
		int[][] coordinates = new int[400][3];
		for(int row = 0; row < coordinates.length; row++){
		    coordinates[row][0] = -1;
		    coordinates[row][1] = -1;
		    coordinates[row][2] = 0;
		}
		int num = 0;
		for(int row = 0; row < grid.length; row++){
		    for(int col = 0; col < grid[row].length; col++){
		    	if(!grid[row][col] && numberOfNeighbors(row+1, col+1) == 3){
		    		coordinates[num][0] = row;
		    		coordinates[num][1] = col;
		    		coordinates[num][2] = 1;
		    		num++;
		    	}
		    	else{
		    		if(numberOfNeighbors(row+1, col+1) >= 4 || numberOfNeighbors(row+1, col+1) <= 1){
		    			coordinates[num][0] = row;
		    			coordinates[num][1] = col;
		    			coordinates[num][2] = 0;
		    			num++;
		    		}
		    	}
		    }
		}
		int iter = 0;
		while(coordinates[iter][0] > -1 || iter == 399){
			if(coordinates[iter][2] == 1){
				grid[coordinates[iter][0]][coordinates[iter][1]] = true;
			}else{
				grid[coordinates[iter][0]][coordinates[iter][1]] = false;
			}
			iter++;
		}
		gen++;
	}
	
	/**
	 * Method to print the statistics
	 */
	public void printStatistics(){
		int row10  = 0;
		for(int col = 0; col < grid[9].length; col++){
			if(grid[9][col]){row10++;}
		}
		int col10 = 0;
		for(int row  = 0; row < grid.length; row++){
			if(grid[row][9]){col10++;}
		}
		int living = 0;
		for(int row = 0; row < grid.length; row++){
		    for(int col = 0; col < grid[row].length; col++){
		    	if(grid[row][col]){living++;}
		    }
		}
		System.out.println("Number in Row 10 ---> " + row10);
		System.out.println("Number in Column 10 ---> " + col10);
		System.out.println("Number of living organisms ---> " + living);
	}

}
