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
	/**
	 * constructor Taxes - initializes the hoursWorked and hourlyRate
	 */
    public Taxes(double hours, double rate){
        hoursWorked = hours;
        hourlyRate = rate;
    }
	/**
	 * Accessor method to get hours worked
	 * @return the hours worked
	 */
    public double getHoursWorked(){
        return hoursWorked;
    }
	/**
	 * Accessor method to get hourly rate
	 * @return the hourly rate
	 */	
    public double getHourlyRate(){
        return hourlyRate;
    }
	/**
	 * Accessor method to get federal tax rate
	 * @return the federal tax rate
	 */
    public double getFedTaxRate(){
        return FEDERAL_TAX;
    }
    /**
	 * Accessor method to get social security tax rate
	 * @return the social security tax rate
	 */	
    public double getSocSecurityRate(){
        return FICA;
    }
    /**
	 * Accessor method to get state tax rate
	 * @return the state tax rate
	 */
    public double getStateTaxRate(){
        return STATE_TAX;
    }
    /** Method to compute the gross pay - pay before taxes
	 * @return gross pay
	 */
     public double computeGrossPay(){
        return hourlyRate*hoursWorked;
    }
     /**
 	 * Method to compute the amount of federal tax
 	 * @return federal tax
 	 */
     public double computeFedTax(){
        return computeGrossPay()*FEDERAL_TAX;
    }
     /**
 	 * Method to compute the amount of social security tax
 	 * @return social security tax
 	 */
    public double computeSocSecurity(){
        return FICA*computeGrossPay();
    }
    /**
	 * Method to compute the amount of state tax
	 * @return state tax
	 */
    public double computeStateTax(){
        return STATE_TAX*computeGrossPay();
    }
    /**
	 * Method to compute the amount of total tax
	 * @return total tax
	 */
    public double computeTotalTax(){
        return computeStateTax() + computeFedTax() + computeSocSecurity();
    }
    /**
	 * Method to compute the amount of net pay - pay after taxes
	 * @return net pay
	 */
    public double computeNetPay(){
        return computeGrossPay() - computeTotalTax();
    }
}