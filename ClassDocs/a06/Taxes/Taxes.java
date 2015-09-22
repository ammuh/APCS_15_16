/***
 *  @author Ammar Husain
 * Period 4
 */
 import java.util.Scanner;
 
public class Taxes{
    private final double FICA = 7.65;
    private final double STATE_TAX = 4.00;
    private final double FEDERAL_TAX = 15.00;
    private int hoursWorked;
    private double hourlyRate;
    private double grossPay;
    private double socTax;
    private double stateTax;
    private double fedTax;
    private double totalTax;
    private double netPay;

    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("How many hours have you worked? ");
        int hrs = s.nextInt();
        System.out.print("What is your hourly rate? ");
        double rte = s.nextDouble();
        Taxes profile = new Taxes(hrs, rte);
        System.out.printf("Hours worked: $%d%n", profile.getHoursWorked());
        System.out.printf("Hourly rate: $%.2f%n",profile.getHourlyRate());
        System.out.println();
        System.out.printf("Gross pay: $%.2f%n", profile.computeGrossPay());
        System.out.println();
        System.out.printf("Federal tax (%.2f%%): $%.2f%n", profile.getFedTaxRate(),  profile.computeFedTax());
        System.out.printf("FICA (%.2f%%): $%.2f%n", profile.getSocSecurityRate(),profile.computeSocSecurity());
        System.out.printf("State tax (%.2f%%): $%.2f%n", profile.getStateTaxRate(),  profile.computeStateTax());
        System.out.println();
        System.out.printf("Net pay: $%.2f%n", profile.computeNetPay());
    }
    public Taxes(int hours, double rate){
        hoursWorked = hours;
        hourlyRate = rate;
    }
    public int getHoursWorked(){
        return hoursWorked;
    }
    public double getHourlyRate(){
        return hourlyRate;
    }
    public double getFedTaxRate(){
        return FEDERAL_TAX;
    }
    public double getSocSecurityRate(){
        return FICA;
    }
    public double getStateTaxRate(){
        return STATE_TAX;
    }
     public double computeGrossPay(){
        grossPay = hourlyRate*hoursWorked;
        return grossPay;
    }
     public double computeFedTax(){
        fedTax= grossPay*FEDERAL_TAX;
        return fedTax;
    }
    public double computeSocSecurity(){
        socTax = FICA*grossPay;
        return socTax;
    }
    public double computeStateTax(){
        stateTax = STATE_TAX*grossPay;
        return stateTax;
    }
    public double computeTotalTax(){
        totalTax = stateTax + socTax + fedTax;
        return totalTax;
    }
    public double computeNetPay(){
        netPay = grossPay - totalTax;
        return netPay;
    }
}