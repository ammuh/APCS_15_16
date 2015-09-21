public class Taxes{
    private final double FICA = 6.7;
    private final double STATE_TAX = 6.7;
    private int hoursWorked;
    private double hourlyRate;

    public static void main(String args[]){
        System.out.println("Hello World!");
    }
    public Taxes(){
        
    }
    public void getInfo(){
        System.out.printf("%25s%8.2f%n","", );
        System.out.printf("%25s%8.2f%n","", );
        System.out.printf("%25s%8.2f%n","", );
        System.out.printf("%25s%8.2f%n","", );
        System.out.printf("%25s%8.2f%n","", );
        System.out.printf("%25s%8.2f%n","", );
        System.out.printf("%25s%8.2f%n","", );
        System.out.printf("%25s%8.2f%n","", );
    }
}