/**
 * Created by Ammar Husain on 1/8/2016.
 */
import java.util.*;
import java.io.*;

public class Average {
    private String name;

    public Average(String n){
        name = n;
    }

    public static void main(String args[]){
        Average a = new Average("src/test2.txt");
        System.out.println(a.scanDataAndCalculateAverage());
    }
    public double scanDataAndCalculateAverage(){
        Scanner s;
        long total =0 ;
        int num = 0;
        try{
            s = new Scanner(new File(this.name));
            num++;
            total += Integer.parseInt(s.nextLine().trim());
            while(s.hasNextLine()){
                num++;
                total += Integer.parseInt(s.nextLine().trim());
            }
        }catch(IOException i){
            throw new NumberFormatException("Error: " + this.name + " (No such file or directory)");
        }catch (NumberFormatException n) {
            throw new NumberFormatException(this.name + " does not have numeric data");
        }
        return (double)total/num;
    }
}
