import java.util.*;
/**
 * @author Ammar Husain
 * @period 4
 */
  
public class Rolling {
	Random rand;
	/**
	 * constructor to initilize the random number
	 * generator
	 * @param s - seed for the random number generator
	 */
	public Rolling(int s)
	{
		rand = new Random(s);//makes new number generator
	}
	/**
	 * Method to simulate a dice roll
	 * @return an integer between 1 and 6
	 */
    private int roll() 
    { 
        //Your code goes here
        return rand.nextInt(6) + 1;
    }
    
    /**  
     * Roll the dice three times and count the
     * number of tries it took to get all three
     * different rolls. In the end print a message
     * displaying the number of tries
     */
    public  void play() {
        int count =0;
        int n1;
        int n2;
        int n3;
        do{
            n1 = roll();
            n2 = roll();
            n3 = roll();
            System.out.println(n1 + " " + n2 + " " + n3);
            count++;
        }while(n1 == n2 || n2 == n3 || n3 == n1);
        System.out.println("Rolled " + count + " times before all the rolls were different");
    }

    /** 
     * When the loop is done, this statement is true:
     * n1 != n2 && n2 != n3 && n3 != n1
     */
  
} 