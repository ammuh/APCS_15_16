public class RegularPolygon {
	private int myNumSides; // t of sides 
	private double mySideLength; // length of side 
	private double myR; // radius of circumscribed circle 
	private double myr; // radius of inscribed circle 
	/**
	 * constructor RegularPolygon - initializes the polygon to a triangle
	 */
	public RegularPolygon() {
		myNumSides = 3;
	}
	/**
	 * constructor RegularPolygon - initializes the polygon specified side lengths and number of sides
	 * @param numSides number of sides
	 * @param sideLength Length of the sides on the polygon
	 */
	public RegularPolygon(int numSides, double sideLength) {
		myNumSides = numSides;
		mySideLength = sideLength;
		this.calcR();
		this.calcr();

	}
	// private methods 
	/**
	 * Calculates the radius of an inscribed circle.
	 */
	private void calcr() {
		this.myr = .5 * mySideLength * (1.0 / Math.tan(Math.PI / (double) myNumSides));

	}
	/**
	 * Calculates the radius of a circumscribed circle.
	 */
	private void calcR() {
		this.myR = .5 * mySideLength * (1.0 / Math.sin(Math.PI / (double) myNumSides));

	}
	// public methods 
	/**
	 * Calculates the angle of any vertex in the polygon
	 * @return The angle of the vertex
	 */
	public double vertexAngle() {
		return ((myNumSides - 2.0) / myNumSides) * 180.0;
	}
	/**
	 * Calculates the perimeter of the shape
	 * @return perimeter of polygon
	 */
	public double Perimeter() {
		return myNumSides * mySideLength;
	}
	/**
	 * Calculates the area of the polygon.
	 * @return area
	 */
	public double Area() {
		return .5 * myNumSides * Math.pow(myR, 2) * Math.sin(2 * Math.PI / myNumSides);
	}
	/**
	 * Accessor methods that gets the number of sides
	 * @return number of sides
	 */
	public int getNumside() {
		return myNumSides;
	}
	/**
	 * Accessor method that gets the length of the side
	 * @return Side length
	 */
	public double getSideLength() {
		return mySideLength;
	}
	/**
	 * Accessor method that gets the radius of the circumscribed circle.
	 * @return radius of the circle
	 */
	public double getR() {
		return myR;
	}
	/**
	 * Accessor method that gets the radius of the inscribed circle.
	 * @return radius of the circle
	 */
	public double getr() {
		return myr;
	}
}