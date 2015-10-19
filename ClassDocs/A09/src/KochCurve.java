/**
 * Created by Ammar Husain on 10/15/2015.
 */
import gpdraw.*;
public class KochCurve {
    public SketchPadWithNoDelay canvas;
    public DrawingTool pen;
     public KochCurve(int l, int w, int posx, int posy){
        canvas = new SketchPadWithNoDelay(l, w, posx, posy);
        pen = new DrawingTool(canvas);
        pen.up();
        pen.move(-150,150);
        pen.turnRight();
        pen.turnRight();
    }
    public void drawSnowFlake(int level, double length){
        curve.drawKochCurve(level, length);
        this.pen.turnRight(120);
        curve.drawKochCurve(level, length);
        this.pen.turnRight(120);
        curve.drawKochCurve(level, length);
    }
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
