/**
 * @author Ammar Husain
 * @period 4
 *
 */
import java.util.*;
import java.io.*;

public class Average {
    private String name;

    public Average(String n){
        name = n;
    }
    public double scanDataAndCalculateAverage(){
        Scanner s;
        long total =0 ;
        int num = 0;
        try{
            s = new Scanner(new File(this.name));
            if(!s.hasNext()){
                throw new NullPointerException(this.name + " is empty");
            }
            if(!s.hasNextInt()){
                throw new IllegalArgumentException(this.name + " does not have numeric data");
            }
            while(s.hasNext()){
                total += s.nextInt();
                num++;
            }
            return (double)total/num;
        }catch(IOException i){
            System.out.println("Error: "+ this.name + " (No such file or directory)");
        }
        return 0;
    }
}
