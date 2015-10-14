/***
 * @author Ammar Husain
 * Period 4
 *
 * Class that allows you to check if your mail has all of the correct dimensions and doesn't exceed any shipping restrictions.
 */
import java.util.*;
public class CheckMail{
    private double dim1, dim2, dim3, weight;
    /***
     * Creates an object with 3 dimensions and weight. The largest dimension is chosen to be dim1.
     * @param d1 - Dimension 1
     * @param d2 - Dimension 2
     * @param d3 - Dimension 3
     * @param w - Weight
     */
    public CheckMail(double d1, double d2, double d3, double w){
        if(d1>=d2 && d1>=d3){
            dim1 = d1;
            dim2 = d2;
            dim3 = d3;
        }
        else if (d2>=d1 && d2>=d3){
            dim1 = d2;
            dim2 = d3;
            dim3 = d1;
        }
        else if (d3>=d1 && d3>=d2){
            dim1 = d3;
            dim2 = d1;
            dim3 = d2;
        } 
        weight = w;
    }
    /***
     * Gets the lenght of the current object. The lenght is the biggest dimension.
     * @return - dim1 of the object
     */
    public double getLength(){
        return this.dim1;
    }
    /***
     * Gets the girth of the current object. Girth is the perimeter using the two shortest dimensions.
     * @return - girth
     */
    public double getGirth(){
        return 2*this.dim2 + 2*this.dim3;
    }
    /***
     * Gets the size of the current object. Size is the girth plus the lenght.
     * @return - size
     */
    public double getSize(){
        return getGirth()+ getLength();
    }

    /***
     * Evaulates the dimesions and weight and prints a message with the status of the package.
     */
    public void printMessage(){
        boolean op1 = getSize() > 100;
        boolean op2 = weight > 70;
        boolean op3 = op1 || op2;
        if(op3){
            if(op1&&op2){
                System.out.println("Package is too large and too heavy");
            }
            else if (op2){
                System.out.println("Package is too heavy");
            }
            else if (op3){
                System.out.println("Package is too large");
            } 
        }
        else{
            System.out.println("Package is acceptable");
        } 
    }
    
}