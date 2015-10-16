/**
 * Created by Ammar Husain on 10/15/2015.
 */
import gpdraw.*;
public class KochCurve {
    public static SketchPadWithNoDelay canvas;
    public static DrawingTool pen;
    public KochCurve(){
        canvas = new SketchPadWithNoDelay(700, 700, 0, 0);
        pen = new DrawingTool(canvas);
        pen.up();
        pen.move(-150,150);
        pen.turnRight();
        pen.turnRight();
    }
    public static void main(String args[]){
        KochCurve curve = new KochCurve();

        curve.drawKochCurve(6, 500);
        pen.turnRight(120);
        curve.drawKochCurve(6, 500);
        pen.turnRight(120);
        curve.drawKochCurve(6, 500);
    }
    public void drawKochCurve(int level, double length){
        if(level < 1){
            pen.down();
            pen.move(length);
            pen.up();
        }
        else {
            pen.down();
            this.drawKochCurve(level-1, length/3.0);
            pen.turnLeft(60);
            this.drawKochCurve(level - 1, length /3.0);
            pen.turnRight(120);
            this.drawKochCurve(level - 1, length /3.0);
            pen.turnLeft(60);
            this.drawKochCurve(level - 1, length /3.0);
            pen.up();
        }
    }
}
