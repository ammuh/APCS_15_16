// Question A2 on 2010 AP Exam
/**
 * Class for doing calculations on an AP Line.
 * @author Ammar Husain
 * Period 4
 */
public class APLine{
    //declare instance variables that represent the coefficients a and b and the constant
    //c in the equation of the line ax + by + c = 0
    int a, b, c;
    /**
     * Constructor to initialize the coefficients a and b and the constant c in the
     * equation of the line ax + by + c = 0
     * @param ua - coefficient of x
     * @param ub - coefficient of y
     * @param uc - constant
     */
    public APLine(int ua, int ub, int uc){
        a = ua;
        b = ub;
        c = uc;
    }// end constructor
    /**
     * Method to compute the slope of the line
     * @return slope of the line
     */
    public double getSlope(){
        return -(double)a/(double)b;
    }// end method getSlope
    /**
     * Method to check if the given point (x,y) falls on the line
     * @param x - x coordinate of the point
     * @param y - y coordinate of the point
     * @return true if the point falls on the line, false otherwise
     */
    public boolean isOnLine(int x, int y){
        if(this.a*x +this.b*y + this.c == 0){
            return true;
        }
        else{
            return false;
        }
    }// end method isOnLine
}