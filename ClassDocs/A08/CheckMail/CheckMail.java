import java.util.*;
public class CheckMail{
    private double dim1, dim2, dim3, weight;
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
    
    public double getLength(){
        return this.dim1;
    }
    
    public double getGirth(){
        return 2*this.dim2 + 2*this.dim3;
    }
    
    public double getSize(){
        return getGirth()+ getLength();
    }
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