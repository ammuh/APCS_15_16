/**
 * Created by Ammar Husain on 11/14/2015.
 */
public class GroceryReceipt {
    public Employee clerk;
    public String receipt;
    public double total;

    public GroceryReceipt(Employee c){
        clerk = c;
        receipt = "";
        total = 0;
    }
}
