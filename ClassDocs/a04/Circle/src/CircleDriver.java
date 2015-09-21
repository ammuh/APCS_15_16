/**
 * @author Ammar Husain
 * Period 4
 */
public class CircleDriver {
    public static void main(String args[]){
        Circle circ1 = new Circle(-100, 0, 30);
        Circle circ2 = new Circle(100, 20, 60);
        circ1.draw();
        circ2.draw();
        System.out.println("Area of rectangle 1: " + circ1.getArea());
        System.out.println("Area of rectangle 2: " + circ2.getArea());
        System.out.println("Perimeter of rectangle 1: " + circ1.getCircumference());
        System.out.println("Perimeter of rectangle 2: " + circ2.getCircumference());
    }
}
