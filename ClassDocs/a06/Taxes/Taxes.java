public class Taxes{
    private final double FICA = 7.65;
    private final double STATE_TAX = 4.00;
    private final double FEDERAL_TAX = 15.00;
    private int hoursWorked;
    private double hourlyRate;
    private double grossPay;
    private double netPay;

    public static void main(String args[]){
        Taxes ammu = new Taxes(5, 15.5);
        ammu.getInfo();
    }
    public Taxes(int hours, double rate){
        hoursWorked = hours;
        hourlyRate = rate;
    }
    
    public void getInfo(){
        System.out.printf("%25s%8.2f%n","Hours Worked:", hoursWorked);
        System.out.printf("%25s%8.2f%n","Hourly rate:", hourlyRate);
        grossPay = hourlyRate*hoursWorked;
        System.out.printf("%25s%8.2f%n","Gross pay:", grossPay);
        System.out.printf("%25s%8.2f%n","Federal tax (15.00%):", FEDERAL_TAX/100*grossPay);
        System.out.printf("%25s%8.2f%n","FICA (7.65%):", FICA/100*grossPay);
        System.out.printf("%25s%8.2f%n","State tax (4.00%):", STATE_TAX/100*grossPay);
        netPay = grossPay - (grossPay/100(FEDERAL_TAX+STATE_TAX+FICA);
        System.out.printf("%25s%8.2f%n","Net pay:", netPay);
    }
}