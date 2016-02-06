import java.util.*;
import java.io.*;
/**
 *
 * @author Your name
 * @period #
 */
public class Compact{
    private int[] nums;

    public static void main(String args[]){
        Compact c = new Compact("test1.txt");
        c.compactIt();
    }
    public Compact(String fname){
        try {
            Scanner s = new Scanner(new File(fname));
            int l = 0;
            while(s.hasNext()){
                s.next();
                l++;
            }
            s = new Scanner(new File(fname));
            nums = new int[l];
            for(int i = 0; i < l; i++){
                nums[i] = s.nextInt();
            }
            System.out.print("Before: ");
            for(int i = 0; i < nums.length; i++){
                System.out.print(nums[i] + " ");
            }
            System.out.println();
        }catch (FileNotFoundException f){
            System.out.println("Error, your file is missing sir.");
        }
    }
    public void compactIt(){
        int n = nums.length;
        for(int i =0; i < n; i++){
            if(nums[i] == 0){
                remove(i);
                i--;
            }
            else{
                n--;
            }
        }
        System.out.print("After: ");
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }

        System.out.println();
    }
    private void remove(int pos){
        for(int i = pos; i < nums.length -1; i++){
            nums[i] = nums[i+1];
        }
        nums[nums.length-1] =0;
    }
}
