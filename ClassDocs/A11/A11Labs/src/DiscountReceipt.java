/**
 * Created by Ammar Husain on 11/14/2015.
 */
public class DiscountReceipt extends GroceryReceipt {
    private boolean preferred;
    private int discountCount;
    private double discountAmount;

    /***
     * Constructor - Extends GroceryReceipt, assigns clerk and whether or not customer is preferred.
     * @param c Clerk for current transaction
     * @param p Is the customer preferred?
     */
    public DiscountReceipt(Employee c, boolean p){
        super(c);
        preferred = p;
        discountCount = 0;
        discountAmount = 0;
    }

    /***
     * Gets the number of discounts.
     * @return count
     */
    public int getDiscountCount(){
        return  this.discountCount;
    }

    /***
     * Gets the total monetary value of discounts.
     * @return amount
     */
    public double getDiscountAmount(){
        return this.discountAmount;
    }

    /***
     * Adds an item to the receipt.
     * @param i Item to add
     */
    public void add(Item i){
        receipt += i.toString() + "\n";
        total += i.getPrice();
        if(preferred && i.getDiscount() > 0){
            discountCount++;
            discountAmount += i.getDiscount();
        }
    }

    /***
     * Gets the final total on the receipt adjusted for discounts.
     * @return total
     */
    public double getTotal(){
        return total - discountAmount;
    }

    /***
     * Gets the percent of the total that is discounted.
     * @return percentage discount
     */
    public double getDiscountPercent(){
        return 100*(discountAmount/total);
    }
    public String toString(){
        return getReceipt() + "\nSub-Total: $" + valueToString(super.getTotal()) + "\nDiscount: $" + valueToString(getDiscountAmount()) + "\nNumber of discounted items: " + getDiscountCount() + "\nDiscount percent: " + valueToString(getDiscountPercent())+ "%\nTotal: $" + valueToString(getTotal());
    }

}
