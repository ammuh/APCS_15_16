/**
 * @author Ammar Husain
 * Period 4
 */
public class AndChecker implements Checker{
    private Checker checker1;
    private Checker checker2;
    /**
     * Constructor
     * @param c1 - first Checker object
     * @param c2 - second Checker object
     */
    public AndChecker(Checker c1, Checker c2){
        checker1 = c1;
        checker2 = c2;
    }
    /**
     * Method to check if the given string is accepted
     * by both of the Checker objects
     * @param s - string to be checked
     * @return - true if the string is contained in both Checker objects and false otherwise
     */
    public boolean accept(String s){
        return checker1.accept(s) && checker2.accept(s);
    }
}
