/***
 * Simulates an item in the grocery store
 * @author Ammar Husain
 * Period 4
 */
public class Item {
    private String name;//item name
    private double price;//item unit price in dollars
    private double discount;//item discount in dollars
    /***
     * Initializes the item name, price and discount
     * @param n - item name
     * @param p - item price in dollars
     * @param d - discount in dollars
     */
    public Item(String n, double p, double d){
        name = n;
        price = p;
        discount = d;
    }
    /***
     * Returns the item name
     * @return item name
     */
    public String getName(){
        return this.name;
    }
    /***
     * Returns the item price in dollars
     * @return item price
     */
    public double getPrice(){
        return this.price;
    }
    /***
     * Returns the item discount in dollars
     * @return item discount
     */
    public double getDiscount(){
        return this.discount;
    }
    /***
     * Returns the value passed as a string in the dollar and cents format ####.##
     * @param d - value to be converted to dollar and cents format
     * @return String in dollar and cents format
     */
    public String valueToString(double d){
        String s = "" + Math.round(d*100)/100.0;
        if(s.length() - s.indexOf(".") <3){
            s += "0";
        }
        return s;
    }
    /***
     * Returns a string with item name, price and discount in the format
     * name item price (-discount). One item will get printed per line.
     * For example: Spinach $3.98 (-$1.05)
     */
    public String toString(){
        return name + " $" + valueToString(getPrice()) + " (-$" + valueToString(getDiscount()) + ")";
    }
}

