import java.util.Formatter;
/**
 * 
 * @author Ammar Husain
 * @period 4
 *
 */
public class Item {
    private int myId;
    private int myInv;
    public Item(int id, int inv) {
        myId = id;
        myInv = inv;
    }
    public int getId(){
        return myId;
    }
    public int getInv(){
        return myInv;
    }
    public int compareTo(Item other){
        return this.getId() - other.getId();
    }
    public boolean equals(Item other){
        return this.getId() == other.getId() && this.getInv() == other.getInv();
    }
    public String toString(){
        Formatter f= new Formatter();
        f.format("%10s%10s", getId(), getInv());
        
        return f.toString();
    }
}