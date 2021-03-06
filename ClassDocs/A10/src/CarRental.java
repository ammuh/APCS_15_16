/**
 * Class FOR converting license plates to Car Codes.
 * @author Ammar Husain
 * Period 4
 */
public class CarRental{
    private String make;
    private String model;
    private String plate;
    private String code;
    /**
     * Constructs object and initializes license, model and make of car
     * @param mk Make
     * @param mdl Model
     * @param lis License
     */
    public CarRental( String mk, String mdl, String lis){
        make = mk;
        model = mdl;
        plate = lis;
    }

    /**
     * Computes the code based on the licence info.
     */
    public void computeCode(){
        String prefix = this.plate.substring(0,3);
        String suffix = this.plate.substring(4,7);
        int sum = (int)prefix.charAt(0) + (int)prefix.charAt(1) + (int)prefix.charAt(2);
        sum += 100*((int)suffix.charAt(0) - 48) + 10*((int)suffix.charAt(1) - 48) + ((int)suffix.charAt(2) - 48);
        String c2 = "" + sum;
        this.code = (char)(65 + (sum % 26)) + c2;
    }

    /**
     * Returns code of the car.
     * @return code
     */
    public String getCode(){
        return this.code;
    }

    /**
     * Converts car object to String.
     * @return Car info
     */
    public String toString(){
        return "Make = "+ this.make+ "\nModel = "+ this.model+ "\n" + this.plate + " = " + this.getCode(); 

    }
}