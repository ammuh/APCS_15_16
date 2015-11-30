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
        System.out.println("Annual Interest Rate    Monthly Payment\n");
        double h = high;
        double l = low;
        while(h >= l){
            System.out.printf("%15.2f", l);
            System.out.printf("%17.2f", (this.principal*(l/1200)*Math.pow(1+(l/1200), years*12))/(Math.pow(1+l/1200, years*12)-1));
            System.out.println();
            l += .25;
        }
        //Your code goes here

    }
}
