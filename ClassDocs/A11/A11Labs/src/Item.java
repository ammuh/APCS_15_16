/**
 * Created by Ammar Husain on 11/14/2015.
 */
public class Item {
    private String name;
    private double price;
    private double discount;

    public Item(String n, double p, double d){
        name = n;
        price = p;
        discount = d;
    }

    public String getName(){
        return this.name;
    }

    public double getPrice(){
        return this.price;
    }

    public double getDiscount(){
        return this.discount;
    }

    public String valueToString(double d){
        String s = "" + Math.round(d*100)/100.00;
        return s;
    }
    public String toString(){
        return name + " $" + valueToString(getPrice()) + " (-$" + valueToString(getDiscount()) + ")";
    }
    /*
    ? name – String is the name of the item
? price – double is the price of the item in dollars
? discount – double is the discount on the item in dollars
? Constructor that initializes an Item object with the given name, price and discount
? Getter methods to return the name, price, and discount
? String valueToString (double) that converts the passed in value to a number shortened to
two decimal places and returns it as a String
? String toString() returns the item name and its price and discount as shown in the example
Ice Breaker $1.05 (-$0.50)
One item would be printed per line, so don’t forget to include a line break. In this example the item
name is Ice Breaker, its price is $1.05 and there is a discount of $0.50 on it.
     */
}

