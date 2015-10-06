public class CheckMail{
    private double length;
    private double width;
    private double height;
    private double weight;
    
    public CheckMail(double dim1, double dim2, double dim3, double w){
        if(dim1>=dim2 && dim1>=dim3){
            length = dim1;
            width = dim2;
            height = dim3;
        }
        else if (dim2>=dim1 && dim2>=dim3){
            length = dim2;
            width = dim3;
            height = dim1;
        }
        else if (dim3>=dim1 && dim3>=dim2){
            length = dim3;
            width = dim1;
            height = dim2;
        } 
        weight = w;
    }
    
    public double getLength(){
        return length;
    }
    
    public double getGirth(){
        return 2*height + 2*width;
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
                System.out.println("Package is too large and too heavy.");
            }
            else if (op2){
                System.out.println("Package is too heavy.");
            }
            else if (op3){
                System.out.println("Package is too large.");
            } 
        }
        else{
            System.out.println("Package is acceptable.");
        } 
    }
    
}