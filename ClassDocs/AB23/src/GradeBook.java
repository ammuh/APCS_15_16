/**
 * 
 * @author Ammar Husain
 * @period 4
 *
 */
public class GradeBook 
{
	private String courseName;
    private int[][] grades;
    
    public GradeBook(String name, int[][] gradesArray){
        grades = gradesArray;
        setCourseName(name);
    }
    public int getMinimum(){
        int lowest = grades[0][0];
        for(int row = 0; row < grades.length; row++){
            for(int col = 0; col < grades[row].length; col++){
                if(lowest > grades[row][col]){
                    lowest = grades[row][col];
                }
            }
        }
        return lowest;
    }
    public int getMaximum(){
        int largest = grades[0][0];
        for(int row = 0; row < grades.length; row++){
            for(int col = 0; col < grades[row].length; col++){
                if(largest < grades[row][col]){
                    largest = grades[row][col];
                }
            }
        }
        return largest;
    }
    public double getAverage(int[] setOfGrades){
        int sum = 0;
        for(int i = 0; i < setOfGrades.length; i++){
            sum += setOfGrades[i];
        }   
        return (double)sum/3;
    }
    public void outputBarChart(){
        String[] labels = {"00-09", "10-19", "20-29", "30-39", "40-49", "50-59", "60-69", "70-79", "80-89", "90-99", "100"};
        int[] dist = new int[11];
        for(int row = 0; row < grades.length; row++){
            for(int col = 0; col < grades[row].length; col++){
                    switch(grades[row][col]/10){
                        case 0: dist[0]++;
                        break;
                        case 1: dist[1]++;
                        break;
                        case 2: dist[2]++;
                        break;
                        case 3: dist[3]++;
                        break;
                        case 4: dist[4]++;
                        break;
                        case 5: dist[5]++;
                        break;
                        case 6: dist[6]++;
                        break;
                        case 7: dist[7]++;
                        break;
                        case 8: dist[8]++;
                        break;
                        case 9: dist[9]++;
                        break;
                        case 10: dist[10]++;
                        break;
                    }
            }
        }
        System.out.println("Overall grade distribution");
        for(int range = 0; range < dist.length; range++){
            System.out.printf("%5s: ", labels[range]);
            for(int i = 0; i < dist[range]; i++){
                System.out.print("*");
            }
            System.out.println();
        }
    } 
    public void outputGrades(){
        System.out.println("		Test 1	Test 2	Test 3	Average");
        for(int row = 0; row < grades.length; row++){
            System.out.printf("Student%3s%8d%8d%8d%8.2f", row+1,  grades[row][0], grades[row][1], grades[row][2], getAverage(grades[row]));
            System.out.println();
        }
    }
    public void processGrades(){
        System.out.println();
        System.out.println();
        System.out.println("Lowest grade is  " + getMinimum());
        System.out.println("Highest grade is  " + getMaximum());
        System.out.println();
        System.out.println("The grades are:");
        System.out.println();
        outputGrades();
        outputBarChart();
    }

    public void setCourseName(String name){
        courseName = name;
    }
    public String getCourseName(){
        return courseName;
    }
    public void displayMessage(){
        System.out.println("Welcome to the gradebook for\n"+getCourseName()+"!");
    }
}// end class
