/**
 * Created by Ammar Husain on 11/11/2015.
 */
public class Student extends Person{
    private String major; // Student Id Number
    private double myGPA; // grade point average
    // constructor
    public Student(String name, int age, String gender, String idNum, double gpa){
        // use the super class' constructor
        super(name, age, gender);
        // initialize what's new to Student
        major = idNum;
        myGPA = gpa;
    }
    public String getIdNum(){
        return major;
    }
    public double getGPA(){
        return myGPA;
    }
    public void setIdNum(String idNum){
        major = idNum;
    }
    public void setGPA(double gpa){
        myGPA = gpa;
    }
    // overrides the toString method in the parent class
    public String toString(){
        return super.toString() + ", student id: " + major + ", gpa: " + myGPA;
    }
}
