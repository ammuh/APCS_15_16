/**
 * @author Ammar Husain
 * Period 4
 */
import gpdraw.*;

public class Circle {
	private double myX; //User input for x coordinate
	private double myY; //User input for y coordinate
	private double radius;
	private static SketchPad paper = new SketchPad(500,500); //static gpdraw variables
	private static DrawingTool pen = new DrawingTool(paper); //static gpdraw variables

    /**
     * Creates circle object and initializes all variables to 0
     */
	public Circle(){
		myX = 0;  
		myY = 0;
		radius = 0;
	}

    /**
     * Creates circle object and initializes all variables to 0
     * @param x X Coordinate
     * @param y Y Coordinate
     * @param userRadius Radius of the circle
     */
	public Circle(double x, double y, double userRadius){
		myX = x;  
		myY = y;
		radius = userRadius;
	}

    /**
     * Calculates circumference
     * @return Circumference of circle with current dimensions (double)
     */
	public double getCircumference(){
		return 3.14*2*radius;
	}
    /**
     * Calculates Area
     * @return Area of circle with current dimensions (double)
     */
	public double getArea(){
		return 3.14*radius*radius;
	}
    /**
     * Draws the circle using the gpdraw library
     */
	public void draw(){
        pen.up();
        pen.move(myX, myY);
        pen.down();
        pen.drawCircle(radius);
	}	
}
