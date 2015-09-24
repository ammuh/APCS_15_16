/***
 * Class helps to keep track of hourly pay and calculates your taxes 
 * @author Ammar Husain
 * Period 4
 */
 import java.util.Scanner;
 
public class Taxes{
    private final double FICA = .0765;
    private final double STATE_TAX = .04;
    private final double FEDERAL_TAX = .15;
    private double hoursWorked;
    private double hourlyRate;
    private double grossPay;
    private double socTax;
    private double stateTax;
    private double fedTax;
    private double totalTax;
    private double netPay;

    public Taxes(double hours, double rate){
        hoursWorked = hours;
        hourlyRate = rate;
    }
    public double getHoursWorked(){
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
        netPay = grossPay - computeTotalTax();
        return netPay;
    }
}