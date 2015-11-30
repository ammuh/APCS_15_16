import java.util.*;
/**
 * 
 * @author Ammar Husain
 * Period #
 * 
 */

public class Grades {
	//Declare instance variables here
	public String grades;


	/**
	 * Method to get the grades and calculate the GPA
	 * This method also counts the number of classes taken
	 * and the number of Fs
	 */
	public void getGradesAndCalculateGPA()
	{
		//Your code goes here
		int a;
		int b;
		int c;
		int d;
		int f;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter your grades: ");
		grades =  s.nextLine();
		for(int i = 0; i <= grades.length(); i++){
			switch((int)grades.toLowerCase().charAt()){
				case 97:
				break;
				case 98:
				break;
				case 99:
				break;
				case 100:
				break;
				case 102:
				break;
			}
		}



		
	}
	/**
	 * Method to print the appropriate message
	 */
	public void printMessage()
	{
		//Your code goes here
		



	}

}
