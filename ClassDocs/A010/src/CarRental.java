public class CarRental{
    private String make;
    private String model;
    private String plate;
    private String code;
   
    public CarRental( String mk, String mdl, String lis){
        make = mk;
        model = mdl;
        plate = lis;
    }
    public void computeCode(){
        String prefix = this.plate.substring(0,3);
        String suffix = this.plate.substring(4,7);
        int sum = (int)prefix.charAt(0) + (int)prefix.charAt(1) + (int)prefix.charAt(2);
        sum += 100*((int)suffix.charAt(0) - 48) + 10*((int)suffix.charAt(1) - 48) + ((int)suffix.charAt(2) - 48);
        String c2 = "" + sum;
        this.code = (char)(65 + (sum % 26)) + c2;
    }
    public String getCode(){
        return this.code;
    }
    public String toString(){
        return "Make = "+ this.make+ "\nModel = "+ this.model+ "\n" + this.plate + " = " + this.getCode(); 

    }
}