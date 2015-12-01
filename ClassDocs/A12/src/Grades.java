import java.util.*;
/**
 * 
 * @author Ammar Husain
 * Period 4
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
	public void getGradesAndCalculateGPA(){
		Scanner s = new Scanner(System.in);
		System.out.print("Enter your grades: ");
		grades =  s.nextLine();
	}
	/**
	 * Method to print the appropriate message
	 */
	public void printMessage(){
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int f = 0;
		for(int i = 0; i < grades.length(); i++){
			switch((int)grades.toLowerCase().charAt(i)){
				case 97:
					a++;
					break;
				case 98:
					b++;
					break;
				case 99:
					c++;
					break;
				case 100:
					d++;
					break;
				case 102:
					f++;
					break;
			}
		}
		System.out.printf("GPA = %.2f\n", (double)(a*4+b*3+c*2+d)/(a+b+c+d+f));
		if(a + b + c + d + f < 4){
			System.out.println("Ineligible, taking less than 4 classes");
		}else if(((double)(a*4+b*3+c*2+d)/(a+b+c+d+f)) < 2.0) {
			if(f != 0){
				System.out.println("Ineligible, gpa below 2.0 and has F grade");
			}else{
				System.out.println("Ineligible, gpa below 2.0");
			}
		}else if(f > 0){
			System.out.println("Ineligible, gpa above 2.0 but has F grade");
		}else{
			System.out.println("Eligible");
		}

	}

}
