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
        if(preferred){
            discountCount++;
            discountAmount += i.getDiscount();
        }
    }
    public double getTotal(){
        return total - discountAmount;
    }
    public double getDiscountPercent(){
        return discountAmount/total;
    }
    public String toString(){
        return getReceipt() + "\nSub-Total: $" + valueToString(super.getTotal()) + "\nDiscount: $" + valueToString(getDiscountAmount()) + "\nNumber of discounted items: " + getDiscountCount() + "\nDiscount percent: " + valueToString(getDiscountPercent())+ "\nTotal: $" + valueToString(getTotal());
    }
/*
? void add(Item) – This method overrides the method of the GroceryReceipt class. It updates
the discount count and the total discount if the receipt is for a preferred customer and the item discount
is nonzero. Lastly, it adds the item to the receipt and adds the price to the total.
? double getTotal() returns the total amount after discount.
? double getDiscountPercent() returns the total percent discount received. This is computed by
dividing the discount by the total undiscounted price.
? String toString() returns the list of items, the total price, discount, number of discounted items,
discount percent and the total price after discount as shown below:
Broccoli $3.56 (-$0.45)
Lays Regular $4.34 (-$0.25)
Hershey's milk chocolate with almonds $0.99 (-$0.00)
Coke 6 pack $3.99 (-$0.00)
Sub-Total: $12.88
Discount: $0.00
Number of discounted items: 0
Discount percent: 0.00%
Total: $12.88
*/

}
