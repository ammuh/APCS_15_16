/**
 * Created by Ammar Husain on 11/14/2015.
 */
public class DiscountReceipt extends GroceryReceipt {
    private boolean preferred;
    private int discountCount;
    private double discountAmount;

    public DiscountReceipt(Employee c, boolean p){
        super(c);
        preferred = p;
        discountCount = 0;
        discountAmount = 0;
    }
    public int getDiscountCount(){
        return  this.discountCount;
    }
    public double getDiscountAmount(){
        return this.discountAmount;
    }
    public void add(Item i){
        receipt += i.toString() + "\n";
        total += i.getPrice();
        if(preferred && i.getDiscount() > 0){
            discountCount++;
            discountAmount += i.getDiscount();
        }
    }
    public double getTotal(){
        return total - discountAmount;
    }
    public double getDiscountPercent(){
        return 100*(discountAmount/total);
    }
    public String toString(){
        return getReceipt() + "\nSub-Total: $" + valueToString(super.getTotal()) + "\nDiscount: $" + valueToString(getDiscountAmount()) + "\nNumber of discounted items: " + getDiscountCount() + "\nDiscount percent: " + valueToString(getDiscountPercent())+ "%\nTotal: $" + valueToString(getTotal());
    }

}
