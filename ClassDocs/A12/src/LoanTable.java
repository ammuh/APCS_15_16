/**
 *
 * @author Ammar Husain
 * Period 4
 *
 */
public class LoanTable {
    //Declare your instance variables here
    double principal;
    int years;
    double low;
    double high;

    /**
     * Constructor
     * @param principal - principal amount borrowed
     * @param years - number of years for the loan to be paid off
     * @param low - low interest rate
     * @param high - high interest rate
     */
    public LoanTable(double principal, int years, double low, double high)
    {
        //Your code goes here
        this.principal = principal;
        this.years = years;
        this.low = low;
        this.high = high;
    }
    /**
     * Method to print the Loan table
     */
    public void printTable()
    {
        //Print table heading
        System.out.print("Mortgage problem");
        System.out.print("Principal = " + );
        System.out.print("Time = ");
        System.out.print("Low rate = ");
        System.out.print("High rate = ");
        System.out.println("Annual Interest Rate    MonthlyRate\n");
        //Your code goes here



    }

}
