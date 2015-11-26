/**
 * 
 * @author Your Name
 * Period #
 *
 */
public class GCFAndLCM {
	/**
	 * Method to find the greatest common divisor
	 * of the given numbers
	 * @param a - first number
	 * @param b - second number
	 * @return - the greatest common divisor
	 */
	public static int GCF(int a, int b) 
	{
		//Your code goes here
		while(a != b){
		    if(a > b){
		        a = a-b;
		    }
		    else{
		        b = b-a;
		    }
		}
		return a;

	}
	/**
	 * Method to find the least common multiple of the 
	 * given numbers
	 * @param a - first number
	 * @param b - second number
	 * @return - the least common multiple
	 */
	public static int LCM(int a, int b)
	{
	    int max;
	    int min;
		//Your code goes here
		if(a == b){
		    return a;
		}
		if(a > b){
		   max = a;
		   min = b;
		}
		else{
		   max = b;
		   min = a;
		}
		if(max%min == 0){
	        return max;
	    }
	    else if(max%min){
	        
	    }
        return a;
	}

}
