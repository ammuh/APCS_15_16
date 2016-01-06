// CLI Run config, run this command in this directory: javac CheckingAccount.java && javac CheckDriver.java && java CheckDriver
public class CheckDriver{
    public static void main(String args[]){
        try{
            CheckingAccount c = new CheckingAccount(-10, 8);
        }catch(IllegalArgumentException e){
            System.out.println(e);
            System.out.println("Finished");
        }
    }
}