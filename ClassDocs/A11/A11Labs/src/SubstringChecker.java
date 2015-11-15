/**
 * Created by Ammar Husain on 11/14/2015.
 */
public class SubstringChecker implements Checker {
    private String subtr;
    public SubstringChecker(String s){
        subtr = s;
    }
    public boolean accept(String s){
        if(s.indexOf(this.subtr) >= 0){
            return true;
        }
        else {
            return false;
        }
    }
}
