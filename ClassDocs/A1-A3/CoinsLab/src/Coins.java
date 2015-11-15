
public class Coins {
	private int cents;
	
	public Coins (int money){
		cents = money;
	}
	public void calculate(){
		int runningTotal = cents;
		int quarters = runningTotal/25;
		runningTotal = runningTotal%25;
		int dimes = runningTotal/10;
		runningTotal = runningTotal%10;
		int nickels = runningTotal/5;
		runningTotal = runningTotal%5;
		int pennies = runningTotal/1;		
		System.out.println(cents + " cents =>"); 		
		System.out.println("Quarter(s) " + quarters);
		System.out.println("Dime(s) " + dimes);
		System.out.println("Nickel(s) " + nickels);
		System.out.println("Penny(s) " + pennies);		
	}
}
