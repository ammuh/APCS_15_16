import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * 
 * @author Ammar Husain
 * @period 4
 *
 */
public class Squeeze {
	String fname;//name of the file that contains text to be squeezed
	
	/**
	 * Constructor to initialize fname
	 * @param name - name of the file to be squeezed
	 */
	public Squeeze(String name)
	{
		fname = name;//Your code goes here
	}
	/**
	 * Method to remove and count any extra 
	 * leading spaces
	 * 
	 */
	public void squeezeText()
	{
	    try{
	        Scanner s = new Scanner(new File(this.fname));
            while(s.hasNextLine()){
                String text = s.nextLine();
                int count = 0;
                while(text.charAt(0) == ' '){
                    count++;
                    text = text.substring(1);
                }
                System.out.println(count + " " + text);
            } 
	    }catch(IOException i){
	        System.out.println(i);
	    }
        
	}
}
