/**
 * Created by Ammar Husain on 11/14/2015.
 */
public class NotChecker implements Checker{
    public Checker checker;
    public NotChecker(Checker c){
        checker = c;
    }
    public boolean accept(String s){
        return !(checker.accept(s));
    }
}
