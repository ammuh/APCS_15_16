public class TaxesDriver{
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
}
   