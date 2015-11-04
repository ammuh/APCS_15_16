/**
 * Class for protecting check fraud.
 * @author Ammar Husain
 * Period 4
 */
import java.util.Scanner;

public class CheckProtection {
    private String amount;
    private final int MAX_LENGTH;
    /**
     * Constructor prompts user for check amount, checks if number is too big, then prints out formatted check amount.
     * @param spaces # of spaces maximum
     */
    public CheckProtection(int spaces){
        MAX_LENGTH = spaces;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the check amount: ");
        double a = s.nextDouble();
        a = Math.round(a*100)/100.00;
        amount = "" + a;
        if(amount.length() - amount.indexOf(".") <3){
            amount += "0";
        }
        if(amount.length()+((amount.length()-3)/3) -1> MAX_LENGTH){
             System.out.println("Error: Number is too big");
        }else{
            printAmount();
        }
    }
    /**
     * Recursively adds commas to the check amount.
     * @param s Check amount (String version)
     * @return Check amount with commas
     */
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
    /**
     * Adds asterisks to the check amount to fill up to the maximum amount of spaces.
     * @param s Comma formatted check amount
     * @return Asterisk formatted check amount
     */
    public String addAsterisks(String s){
        if(s.length() != MAX_LENGTH){
            return addAsterisks("*"+ s);
        }
        else{
            return s;
        }
    }
    /**
     * Prints out the amount formatted in check format.
     */
    public void printAmount(){
        System.out.println("amount = $" + addAsterisks(addCommas(this.amount)));
    }
}
