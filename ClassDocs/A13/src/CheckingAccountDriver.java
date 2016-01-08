/**
 * Class for testing checking account.
 * @author Ammar Husain
 * Period 4
 */
public class CheckingAccountDriver{
    public static void main(String args[]){
        try{
            CheckingAccount x = new CheckingAccount(-10, 8);
        }catch(IllegalArgumentException a){
            System.out.println(a);
            try{
                CheckingAccount y = new CheckingAccount(10, 8);
                y.deposit(-9);
            }catch(IllegalArgumentException b){
                System.out.println(b);
                try{
                    CheckingAccount z = new CheckingAccount(10, 8);
                    z.withdraw(20);
                }catch(IllegalArgumentException c){
                    System.out.println(c);
                }
            }
        }
    }
}