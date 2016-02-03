/**
 * @author Ammar Husain
 * @period 4
 */
import java.util.*;

public class PermutationGenerator {
	private final ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
    private ArrayList<Integer> nl;
    private Random r;
    public PermutationGenerator(int seed){
        r = new Random(seed);
    }
    public void nextPermutation(){
        nl = new ArrayList<Integer>();
        ArrayList<Integer> ref = new ArrayList<Integer>(list);
        for(int i = 0; i < 10; i++){
            int a = this.r.nextInt(ref.size());
            nl.add(ref.get(a));
            ref.remove(a);
        }
    }
    public String toString(){
        return nl.toString();
    }
}