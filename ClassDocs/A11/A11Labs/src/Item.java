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
        String s = "" + Math.round(d*100)/100.0;
        if(s.length() - s.indexOf(".") <3){
            s += "0";
        }
        return s;
    }
    public String toString(){
        return name + " $" + valueToString(getPrice()) + " (-$" + valueToString(getDiscount()) + ")";
    }
}

