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
    public Employee getClerk(){
        return this.clerk;
    }
    public String getReceipt(){
        return this.receipt;
    }
    public double getTotal(){
        return this.total;
    }
    public void add(Item i){
        receipt += i.toString() + "\n";
        total += i.getPrice();
    }
    public String valueToString(double d){
        String s = "" + Math.round(d*100)/100.0;
        if(s.length() - s.indexOf(".") <3){
            s += "0";
        }
        return s;
    }
    public String toString(){
        return getReceipt() + "\n" + "Total: $" + valueToString(getTotal());
    }
}
