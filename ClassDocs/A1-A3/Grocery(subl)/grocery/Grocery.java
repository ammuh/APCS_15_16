package grocery;
import java.util.Scanner;

public class Grocery {
    public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter item#1: ");
		double item1 = s.nextDouble();		
		System.out.print("Enter item#2: ");
		double item2 = s.nextDouble();
		System.out.print("Enter item#3: ");
		double item3 = s.nextDouble();
		System.out.print("Enter item#4: ");
		double item4 = s.nextDouble();
		System.out.print("Enter item#5: ");
		double item5 = s.nextDouble();
		double runningTotal = 0.0;
		System.out.printf("%10s%10s%10s", "Item:", "Cost:", "Total:");
		System.out.println();
		runningTotal += item1;
		System.out.printf("%10s%10.2f%10.2f", "#1", item1, runningTotal);
		System.out.println();
		runningTotal += item2;
		System.out.printf("%10s%10.2f%10.2f", "#2", item2, runningTotal);
		System.out.println();
		runningTotal += item3;
		System.out.printf("%10s%10.2f%10.2f", "#3", item3, runningTotal);
		System.out.println();
		runningTotal += item4;
		System.out.printf("%10s%10.2f%10.2f", "#4", item4, runningTotal);
		System.out.println();
		runningTotal += item5;
		System.out.printf("%10s%10.2f%10.2f", "#5", item5, runningTotal);
		System.out.println();
	}
}
