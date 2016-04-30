/**
 * 
 * @author Ammar Husain
 * @period 4
 *
 */
public class SingingRectangle extends Rectangle{
    public SingingRectangle(double l, double w){
        super(l,w);
    }
    public String toString(){
        return String.format("%sRectangle song: %n    I'm a rectangle. %n    You can see. %n    I have four sides. %n    Count with me %n    2 are short and 2 are long. %n    Come along and sing my song. %n", super.toString());
    }
}