import java.util.*;

public class Grades{
    private double[] grades;
    private int numScores;
    /*
    public static void main(String args[]){
        Grades a = new Grades();
        a.dropMinScore();
        System.out.println(a);
    }*/
    public Grades(){
        Scanner s = new Scanner(System.in);
        numScores = s.nextInt();
        grades = new double[numScores];
        for(int i = 0; i < numScores; i++){
            grades[i] = s.nextDouble();
        }
    }
    public int findMin(){
        double smallest = 0;
        int pos = 0;
        for(int i = 0; i < numScores; i++){
            if(i == 0){
                smallest = grades[i];
            }else if(grades[i]< smallest){
                smallest = grades[i];
            }
        }
        return pos;
    }
    public void dropMinScore(){
        int pos;
        for(int a = findMin(); a < grades.length -1; a++){
            grades[a] = grades[a+1];
        }
        grades[grades.length-1] = -1;
    }
    
    public String toString(){
        String s = "";
        for(int a = 0; a < grades.length -1; a++){
            s += (grades[a] + " ");
        }
        return s;
    }
}