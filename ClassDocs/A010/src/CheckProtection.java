/**
 * Created by Ammar Husain on 10/23/2015.
 */
import java.util.Scanner;
public class CheckProtection {
    private String amount;
    private final int MAX_LENGTH;
    public static void main(String args[]){
        CheckProtection a = new CheckProtection(10);
    }
    public CheckProtection(int spaces){
        MAX_LENGTH = spaces;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the check amount:");
        double a = s.nextDouble();
        a = Math.round(a*100)/100.00;
        amount = "" + a;
        if(amount.length() - amount.indexOf(".") <3){
            amount += "0";
        }
        printAmount();
    }
    public String addCommas(String s){
        int l;
        if(s.indexOf(".") >= 0){
            return addCommas(s.substring(0, s.length()-3)) + s.substring(s.length()-3, s.length());
        }
        else{
            if(s.length() < 4){
                return s;
            }
            else{
                return addCommas(s.substring(0, s.length()-3)) + "," + s.substring(s.length()-3, s.length());
            }
        }
    }
    
    public String addAsterisks(String s){
        if(s.length() != MAX_LENGTH){
            return addAsterisks("*"+ s);
        }
        else{
            return s;
        }
    }
    
    public void printAmount(){
        String finAm = addAsterisks(addCommas(this.amount));
        if( finAm.length() > MAX_LENGTH){
            System.out.println("Error: Number is too big");
        }
        else{
            System.out.println(finAm);
        }
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
