public class CheckingAccount{ 
    private double myBalance;
    private int myAccountNumber; 
    
    public CheckingAccount(){ 
        myBalance = 0.0;
        myAccountNumber = 0; 
    } 
    public CheckingAccount(double initialBalance, int acctNum){ 
        if(initialBalance < 0){throw new IllegalArgumentException("Negative balance in account " + acctNum);}
        myBalance = initialBalance; 
        myAccountNumber = acctNum; 
    } 
    public double getBalance(){ 
        return myBalance; 
    }
    public void deposit(double amount){
        if(amount < 0){throw new IllegalArgumentException("Negative amount deposited in account " + this.myAccountNumber);}
        myBalance += amount; 
    } 
    public void withdraw(double amount){
        if(myBalance - amount < 0){throw new IllegalArgumentException("Account " + this.myAccountNumber + " overdrawn");}
        myBalance -= amount; 
    }
}