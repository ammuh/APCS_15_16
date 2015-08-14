import gpdraw.*;

public class DrawHouse {
	private DrawingTool marker;
	private SketchPad poster;

	public DrawHouse(){
		poster = new SketchPad(500, 500);
		marker = new DrawingTool(poster);
	}
	
	public void draw(boolean door, boolean windows){
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
		if (door) {
			marker.move(-25,-200);
			marker.down();
			marker.move(-25,-100);
			marker.move(25,-100);
			marker.move(25,-200);
			marker.up();
		}
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
