/**
 * Created by Ammar Husain on 11/14/2015.
 */
public class AndChecker implements Checker{
    private Checker checker1;
    private Checker checker2;
    public AndChecker(Checker c1, Checker c2){
        checker1 = c1;
        checker2 = c2;
    }
    public boolean accept(String s){
        if(checker1.accept(s) && checker1.accept(s)){
            return true;
        }
        else {
            return false;
        }
    }
}
