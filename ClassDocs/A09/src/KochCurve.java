/**
 * Class for creating Koch fractals.
 * @author Ammar Husain
 * Period 4
 */
import gpdraw.*;
public class KochCurve {
    public SketchPadWithNoDelay canvas;
    public DrawingTool pen;
    /**
     * Constructor that creates a sketchpad and pen for the specific curve to be drawn.
     * @param l Length of the window.
     * @param w Width of the window. 
     * @param posx X position of the koch curve starting position. 
     * @param posy Y position of the koch curve starting position.
     */
    public KochCurve(int l, int w, int posx, int posy){
        canvas = new SketchPadWithNoDelay(l, w, posx, posy);
        pen = new DrawingTool(canvas);
    }
    /**
     * Draws a snowflake consisting of three koch curves positioned in a triangle shape.
     * @param level Level of iterations for the Koch Curves.
     * @param length Length of the base iteration.
     */
    public void drawSnowflake(int level, double length){
        this.drawKochCurve(level, length);
        this.pen.turnRight(120);
        this.drawKochCurve(level, length);
        this.pen.turnRight(120);
        this.drawKochCurve(level, length);
    }
    /**
     * Draws a Koch curve recursively by drawing smaller iterations of the spiked edge.
     * @param level Level of iterations for the Koch Curves.
     * @param length Length of the base iteration.
     */
    public void drawKochCurve(int level, double length){
        if(level < 1){
            pen.down();
            pen.move(length);
            pen.up();
        } 
        else {
            pen.down();
            this.drawKochCurve(level - 1, length / 3.0);
            pen.turnLeft(60);
            this.drawKochCurve(level - 1, length / 3.0);
            pen.turnRight(120);
            this.drawKochCurve(level - 1, length / 3.0);
            pen.turnLeft(60);
            this.drawKochCurve(level - 1, length / 3.0);
            pen.up();
        }
    }
}
