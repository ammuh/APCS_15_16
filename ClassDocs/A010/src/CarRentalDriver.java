import java.util.*;

public class CarRentalDriver{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("Make: ");
        String mk = s.nextLine();
        System.out.print("Model: ");
        String mdl = s.nextLine();
        System.out.print("License Plate: ");
        String lis = s.nextLine();
        CarRental car1 = new CarRental(mk, mdl, lis);
        car1.computeCode();
        System.out.println(car1.toString());
        System.out.print("Make: ");
        mk = s.nextLine();
        System.out.print("Model: ");
        mdl = s.nextLine();
        System.out.print("License Plate: ");
        lis = s.nextLine();
        CarRental car2 = new CarRental(mk, mdl, lis);
        car2.computeCode();
        System.out.println(car2.toString());
        System.out.print("Make: ");
        mk = s.nextLine();
        System.out.print("Model: ");
        mdl = s.nextLine();
        System.out.print("License Plate: ");
        lis = s.nextLine();
        CarRental car3 = new CarRental(mk, mdl, lis);
        car3.computeCode();
        System.out.println(car3.toString());
    }
}
