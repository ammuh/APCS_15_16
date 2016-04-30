/**
 * 
 * @author Ammar Husain
 * @period 4
 *
 */
public class Rectangle implements Measurable{
	private double length;
    private double width;
    public Rectangle(double l, double w){
        length = l;
        width = w;
    }
	 public double getPerimeter(){
	     return 2*width + 2*length;
	 }; 
    //returns the area 
    public double getArea(){
        return length * width;
    }; 
    //returns the dimensions, perimeter, and area as a String 
    public String toString(){
        return String.format("Rectangle:%n    length = %.1f%n    width = %.1f%n    perimeter = %.2f%n    area = %.2f%n", this.length, this.width, this.getPerimeter(), this.getArea());
    };
}