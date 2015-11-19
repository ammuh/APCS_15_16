/**
 * @author Ammar Husain
 * Period 4
 */
public class SubstringChecker implements Checker {
    private String subtr;
    /**
     * Constructor
     * @param s - String to check
     */
    public SubstringChecker(String s){
        subtr = s;
    }
    /**
     * Method to check if the given string is acceptable
     * @param s - String to check
     * @return - true if the given string contains myStr, false otherwise
     */
    public boolean accept(String s){
        if(s.indexOf(this.subtr) >= 0){
            return true;
        }
        else {
            return false;
        }
    }
}
