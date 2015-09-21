/**
 * @author Ammar Husain
 * Period 4
 */
public class RectangleDriver {
    public static void main(String args[]){
        Rectangle rect1 = new Rectangle(0, 0, 300, 200);
        Rectangle rect2 = new Rectangle(30, -10, 40, 400);
        rect1.draw();
        rect2.draw();
        System.out.println("Area of rectangle 1: " + rect1.getArea());
        System.out.println("Area of rectangle 2: " + rect2.getArea());
        System.out.println("Perimeter of rectangle 1: " + rect1.getPerimeter());
        System.out.println("Perimeter of rectangle 2: " + rect2.getPerimeter());
    }
}
