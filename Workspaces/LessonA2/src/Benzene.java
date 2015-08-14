import gpdraw.*;
/**
 * Class used for drawing a Benzene Ring
 * @author Ammar Husain
 *
 */
public class Benzene {
	private DrawingTool marker;
	private SketchPad poster;
	/**
	 * Constructs object with a sketchpad and
	 * drawing tool
	 */
	public Benzene(){
		poster = new SketchPad(500, 500);
		marker = new DrawingTool(poster);
	}
	/**
	 * Draws Ring
	 */
	public void draw(){
		marker.drawCircle(100);
		marker.up(); //Circle Drawn
		marker.move(-(75*Math.sqrt(3)),-75); 
		marker.down(); 
		marker.setDirection(90); //Marker positioned to start drawing
		for (int i=1; i<7 ; i++) { //iterates drawing 6 times
			marker.forward(150);
			marker.turnRight(60);
		}
	}
}
