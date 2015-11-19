/**
 * @author Ammar Husain
 * Period 4
 */
public class NotChecker implements Checker{
    public Checker checker;
    /**
     * Constructor
     * @param c - Checker object
     */
    public NotChecker(Checker c){
        checker = c;
    }
    /**
     * Method to check if the the Checker object
     * does not contain the given string
     * @param s - string to check
     * @return - true if the Checker object does not contain the give string, false otherwise
     */
    public boolean accept(String s){
        return !(checker.accept(s));
    }
}
