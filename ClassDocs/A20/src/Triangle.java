/**
 * 
 * @author Ammar Husain
 * @period 4
 *
 */
public class Triangle implements Measurable{
	private double l1;
    private double l2;
    private double l3;
    public Triangle( double s1, double s2, double s3){
        l1 = s1;
        l2 = s2;
        l3 = s3;
    }
    public double getPerimeter(){
         return l1+l2+l3;
    }; 
    //returns the area 
    public double getArea(){
        double p = (l1 + l2 + l3)/2.0;
        return Math.sqrt(p*(p-l1)*(p-l2)*(p-l3));
    }; 
    //returns the dimensions, perimeter, and area as a String 
    public String toString(){
        return String.format("Triangle:%n    side1 = %.1f%n    side2 = %.1f%n    side3 = %.1f%n    perimeter = %.2f%n    area = %.2f%n", this.l1, this.l2, this.l3, this.getPerimeter(), this.getArea());
    };
}