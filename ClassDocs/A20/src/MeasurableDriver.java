import java.util.ArrayList;
/**
 * 
 * @author Ammar Husain
 * @period 4
 *
 */

public class MeasurableDriver {
	
	public static void main(String[] args) {
	    ArrayList<Measurable> a = new ArrayList<Measurable>();
	    a.add(new Circle(1));
	    a.add(new Rectangle(1,1));
	    a.add(new Triangle(3,4,5));
	    a.add(new SingingRectangle(2,2));
	    a.add(new Circle(1.5));
	    a.add(new Rectangle(1,1.5));
	    a.add(new Triangle(7,24,25));
	    a.add(new Circle(2));
	    a.add(new Rectangle(2,3));
	    a.add(new Triangle(11,60,61));
	    for(Measurable m : a){
	        System.out.println(m);
	    }
	}
}
