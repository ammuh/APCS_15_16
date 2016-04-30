/**
 * 
 * @author Ammar Husain
 * @period 4
 *
 */
public class Circle implements Measurable{
    private double radius;
    public Circle(double r){
        radius = r;
    }
	 public double getPerimeter(){
	     return Math.PI * 2.0 * radius;
	 }; 
    //returns the area 
    public double getArea(){
        return Math.PI * radius * radius;
    }; 
    //returns the dimensions, perimeter, and area as a String 
    public String toString(){
        return String.format("Circle:%n    radius = %.2f%n    circumference = %f%n    area = %f%n", this.radius, this.getPerimeter(), this.getArea());
    };
}
