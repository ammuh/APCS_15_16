/**
 * @author Ammar Husain
 * period 4
 */
import java.util.Scanner; //Import Scanner Class

public class CarDriver {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in); //Init scanner
        System.out.print("New car odometer reading: "); //Ask user for input and scan for next integer
        Car car1 = new Car(s.nextInt());
        System.out.println("Filling Station Visit: "); //Ask user for input and scan for next integer
        System.out.print("odometer reading: ");
        int oReading = s.nextInt(); //Variable for storing user input
        System.out.print("gallons to fill tank: ");//Ask user for input and scan for next double
        double gReading = s.nextDouble(); //Variable for storing user input
        car1.fillUp(oReading, gReading);
        System.out.println();
        System.out.printf("Miles per gallon: $%.2f", car1.calculateMPG()); //Gets MPG and prints with .2 precision format
        System.out.println();
        System.out.println();
        car1.resetMPG(); //Resets car mpg and repeats process above
        System.out.println("Filling Station Visit: ");
        System.out.print("odometer reading: ");
        oReading = s.nextInt();
        System.out.print("gallons to fill tank: ");
        gReading = s.nextDouble();
        car1.fillUp(oReading, gReading);
        System.out.println();
        System.out.printf("Miles per gallon: $%.2f", car1.calculateMPG());
    }
}
