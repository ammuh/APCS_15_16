/**
* @author Ammar Husain
* Period 4
* */
import gpdraw.*;

public class Rectangle {
	private double myX; //User input for x coordinate
	private double myY; //User input for y coordinate
	private double myWidth; //User input for width
	private double myHeight; //User input for height
	private static SketchPad paper = new SketchPad(500,500); //static gpdraw variables
	private static DrawingTool pen = new DrawingTool(paper); //static gpdraw variables

	/**
	 * Creates rectangle object and initializes all variables to 0
	 */
	public Rectangle(){
		myX = 0;  
		myY = 0;
		myWidth = 0;
		myHeight = 0;
	}

	/**
	 * Creates Rectangle object with user input and initializes them with class variables.
	 * @param x X Coordinate
	 * @param y Y Coordinate
	 * @param width Width of the rectangle
	 * @param height Height of the rectangle
	 */
	public Rectangle(double x, double y, double width, double height){
		myX = x;  
		myY = y;
		myWidth =width ;
		myHeight = height;
	}

	/**
	 * Calculates perimeter of rectangle.
	 * @return Returns the perimeter (double) of the rectangle
	 */
	public double getPerimeter(){
		return 2*myWidth + 2*myHeight;
	}

	/**
	 * Method for retrieving the area of the rectangle
	 * @return returns area of the current rectangle
	 */
	public double getArea(){
		return myHeight*myWidth;
	}

	/**
	 * Draws the rectangle using the gpdraw library
	 */
	public void draw(){
		pen.up();
		pen.move(myX, myY);
        pen.setDirection(90);
		pen.down();
		pen.forward(myHeight);
		pen.turnRight(90);
		pen.forward(myWidth);
		pen.turnRight(90);
		pen.forward(myHeight);
		pen.turnRight(90);
		pen.forward(myWidth);
		pen.turnRight(90);		
	}	
}
