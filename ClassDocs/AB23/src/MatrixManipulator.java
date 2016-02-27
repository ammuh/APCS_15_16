import java.util.*;
import java.io.*;


/**
 * Chapter AB23 - Two-Dimensional Arrays Exercises
 * 
 * @author Ammar Husain
 * @version Best Version
 * @author 4
 * @author Assignment - MatrixManipulator
 */
public class MatrixManipulator
{
    Scanner scan;


    public MatrixManipulator()
    {
        scan = new Scanner( System.in );
    }


    /**
     * Sums up all the elements in a given array.
     * @param data - 2D array to find sum of.
     * @return Sum of all data.
     */
    public int sumOfAllArrayElements( int[][] data )
    {

        int sum = 0;
        for(int a = 0; a < data.length; a++){
            for(int b = 0; b < data[a].length; b++){
                sum += data[a][b];
            }
        }
        return sum;
    }


    /**
     * Gives an array of all the sums of each row.
     * @param data - data to find row sums of.
     * @return array of row sums.
     */
    public int[] sumOfEachRow( int[][] data )
    {
        // declare the row sum array
        int[] rowSums = new int[data.length];
        // compute the sums for each row
        for ( int row = 0; row < data.length; row++ )
        {
            int sum = 0;
            for(int col = 0; col < data[row].length; col++){
                sum += data[row][col];
            }
            rowSums[row] = sum;
        }
        return rowSums;
    }


     /**
     * Gives an array of all the sums of each column.
     * @param data - data to find column sums of.
     * @return array of column sums.
     */
    public int[] sumOfEachColumn( int[][] data )
    {
        // find the longest row
        int longest = 0;
        for(int i = 0; i < data.length; i++){
            if(data[i].length > longest){
                longest = i;
            }
        }
        // declare the col sum array
    	int[] colSums = new int[data[longest].length];
    	// compute the sum of each column

        for(int a = 0; a < data[longest].length; a++){
            int sum = 0;
            for(int b = 0; b < data.length; b++){
                if(data[b].length >= a+1){
                    sum += data[b][a];
                }
            }
            colSums[a] = sum;
        }
        return colSums;
    }

    /**
     * Checks to see if the array is a magic square, in which all diagonals, rows and columns add up to the same thing.
     * @param data - data to check if magic square.
     * @return boolean representing if the data is a magic square or not.
     */
    public boolean isMagic( int[][] data )
    {
        if(data.length != data[0].length){
            return false;
        }
        int[] rows = sumOfEachRow(data);
        int[] cols = sumOfEachColumn(data);
        int sum = rows[0];
        for(int i = 0; i < rows.length; i++){
            if(rows[i] != sum){
                return false;
            }
        }
        for(int i = 0; i < rows.length; i++){
            if(rows[i] != sum){
                return false;
            }
        }
    	//check if the array is a magic square. This means that it must be square, 
    	//and that all row sums, all column sums, and the two diagonal-sums 
    	//must all be equal.
    	return true;
    }
    /**
     * Gets max and min of 2D array.
     * @param data - data to find min and max of.
     * @return max and min elements.
     */
    public int[] maxAndMinElements( int[][] data )
    {
        // declare the max and the min
        int max = data[0][0];
        int min = data[0][0];

        // compute the sum
        
        for(int row = 0; row < data.length; row++){
            for(int col = 0; col < data[row].length; col++){
                if(data[row][col] > max){
                    max = data[row][col];
                }
                if(data[row][col] < min){
                    min = data[row][col];
                }
            }
        }
        int[] result = { max, min };
        return result;
    }


    /**
     * Gets the largest element in each row.
     * @param data - data to find max element of each row.
     * @return array of largest elements.
     */
    public int[] largestElements( int[][] data )
    {
        // declare the largest in row array
        int[] largestInRow = new int[data.length];

        // find the largest element in each row
        for(int row = 0; row < data.length; row++){
            int largest = data[row][0];
            for(int col = 0; col < data[row].length; col++){
                if(data[row][col] > largest){
                    largest = data[row][col];
                }
                
            }
            largestInRow[row] = largest;
        }
        return largestInRow;
    }


    /**
     * Reverses each row in the 2D array.
     * @param data - array to reverse
     */
    public void reversalOfElementsInEachRow( int[][] data )
    {
    	// reverse each row and print it
    	for(int row = 0; row < data.length; row++){
        	for(int col = data[row].length -1; col > -1; col--){
        	    System.out.print(data[row][col] + " ");
        	}
        	System.out.print("\n");
    	}
    	
    }


    /**
     * Smooths image by making every picture an average of its surrounding pixel.
     * @param image - image to smooth.
     * @return smoothed image.
     */
    public int[][] imageSmootherEasy( int[][] image )
    {
        // assume a rectangular image
        int[][] smooth = new int[image.length][image[0].length];
        // Compute the smoothed value for
        // non-edge locations in the image.

        for(int row = 1; row < image.length-1; row++){
            for(int col = 1; col < image[row].length-1; col++){
                int sum = 0;
                sum += image[row][col];
                sum += image[row+1][col];
                sum += image[row-1][col];
                sum += image[row][col+1];
                sum += image[row][col-1];
                sum += image[row+1][col+1];
                sum += image[row-1][col-1];
                sum += image[row+1][col-1];
                if(image[row-1][col+1]>0){
                    sum += image[row-1][col+1];
                }
                smooth[row][col] = sum/9;
            }
        }
        return smooth;
    }


    /**
     * Smooths image just as above but uses try catch smoothing to avoid selecting elements out of bounds.
     * @param image - image to smooth.
     * @return smoothed image.
     */
    public int[][] imageSmootherHard( int[][] image )
    {
        // assume a rectangular image
        int[][] smooth = new int[image.length][image[0].length];

        for(int row = 0; row < image.length; row++){
            for(int col = 0; col < image[row].length; col++){
                int sum = 0;
        	    try{
        	        sum += image[row+1][col];
        	    }catch(ArrayIndexOutOfBoundsException e){}
        	    try{
        	        sum += image[row-1][col];
        	    }catch(ArrayIndexOutOfBoundsException e){}
        	    try{
        	        sum += image[row][col+1];
        	    }catch(ArrayIndexOutOfBoundsException e){}
        	    try{
        	        sum += image[row][col-1];
        	    }catch(ArrayIndexOutOfBoundsException e){}
        	    try{
        	        sum += image[row+1][col+1];
        	    }catch(ArrayIndexOutOfBoundsException e){}
        	    try{
        	        sum += image[row+1][col-1];
        	    }catch(ArrayIndexOutOfBoundsException e){}
        	    try{
        	        sum += image[row-1][col+1];
        	    }catch(ArrayIndexOutOfBoundsException e){}
        	    try{
        	        sum += image[row-1][col-1];
        	    }catch(ArrayIndexOutOfBoundsException e){}
        	    try{
        	        sum += image[row][col];
        	    }catch(ArrayIndexOutOfBoundsException e){}
        	    smooth[row][col] = sum/9;
            }
        }
       
        return smooth;
    }



}
