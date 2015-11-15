/**
 * @author Ammar Husain
 * Period 4
 */
import gpdraw.*;

public class Pentagon {
	private DrawingTool marker;
	private SketchPad poster;

	/**
	 * Constructs object with a sketchpad and drawing tool
	 */
	public Pentagon() {
		poster = new SketchPad(500, 500);
		marker = new DrawingTool(poster);
	}

	/**
	 * Draws Pentagon
	 * 
	 * @param x Length of Pentagon
	 */
	public void draw(int x) {
		marker.up();
		marker.move(-(x / 2), -(1.37638192047) * (x / 2)); // Uses trig to find starting point
		marker.down();
		marker.turnRight(90);
		for (int i = 0; i < 6; i++) {
			marker.forward(x);
			marker.turnRight(72);
		}

	}
}
