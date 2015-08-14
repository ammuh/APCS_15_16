import gpdraw.*;
/**
 * This class creates a canvas and a marker that can be used
 * to draw a house. You have the ability to choose
 * if you want doors and windows or not.
 * @author Ammar Husain
 *
 */
public class DrawHouse {
	private DrawingTool marker;
	private SketchPad poster;
	/**
	 * The constructor creates a SketchPad with a set length and
	 * a marker that is linked to the SketchPad
	 */
	public DrawHouse(){
		poster = new SketchPad(500, 500);
		marker = new DrawingTool(poster);
	}
	/**
	 * Draws the house based on user selected features. Can choose 
	 * to draw or not to draw houses and a door.
	 * @param door if user wants a door
	 * @param windows if user wants windows
	 * @see House with user specified features
	 */
	public void draw(boolean door, boolean windows){
		//Draws General House First
		marker.up();
		marker.move(200,-200);
		marker.down();
		marker.move(-200,-200);
		marker.move(-200,100);
		marker.move(200,100);
		marker.move(200,-200);
		marker.up();
		marker.move(200,100);
		marker.down();
		marker.move(0,200);
		marker.move(-200,100);
		marker.up();
		//Checks if user wants door
		if (door) {
			marker.move(-25,-200);
			marker.down();
			marker.move(-25,-100);
			marker.move(25,-100);
			marker.move(25,-200);
			marker.up();
		}
		//Checks if user wants windows
		if (windows) {
			marker.move(-75,-25);
			marker.down();
			marker.move(-125,-25);
			marker.move(-125,25);
			marker.move(-75,25);
			marker.move(-75,-25);
			marker.up();
			marker.move(75,25);
			marker.down();
			marker.move(125,25);
			marker.move(125,-25);
			marker.move(75,-25);
			marker.move(75,25);
			marker.up();
		}
	}
}
