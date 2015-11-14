/**
 * Created by Ammar Husain on 11/14/2015.
 */
public class GrocTester {
    public static void main(String args[]){
        Item i1 = new Item("Condoms", .5, .2);
        Item i2 = new Item("Jb Album", 10, .2);
        Item i3 = new Item("Buk", 7.42, .2);
        Employee ammu = new Employee("Ammar Husain");
        DiscountReceipt g = new DiscountReceipt(ammu, true);
        g.add(i1);
        g.add(i2);
        g.add(i3);
        System.out.println(g);
    }
}
