/**
 * Created by Ammar Husain on 10/23/2015.
 */
import java.util.Scanner;
public class CheckProtection {
    private String amount;
    private final int MAX_LENGTH = 12;
    public CheckProtection(int spaces){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the check amount:");
        double a = s.nextDouble();
        a = Math.round(a);
        amount = "" + a;
        if(((amount.length()-3 )/ 3) + amount.length() > MAX_LENGTH){
            System.out.println("Error: Number is too big");
        }
        amount = addCommas(amount);
        amount = addAsterisks(amount);
    }
    public String addCommas(String s){
        if(s.charAt(0) == ''|| s.charAt(0) == ''|| s.charAt(0) == ''){

        }
    }
    public String addAsterisks(String s){

    }
    public void printAmount(){
        System.out.println(this.amount);
    }
    /*
    b. A constructor that
i. takes one int parameter that specifies the number of spaces to be used to
print the check amount.
ii. prompts for the amount and rounds the amount to two decimal places.
iii. If the amount takes more than MAX_LENGTH spaces, prints an error
message, otherwise prints the amount with the appropriate number of
leading asterisks.
c. A recursive method called addCommas(String s) that inserts commas at the
correct positions.
d. A recursive method called addAsterisks(String s) that inserts the
leading asterisks.
e. A method called printAmount() that prints the amount with the commas and
leading asterisks.

     */
}
