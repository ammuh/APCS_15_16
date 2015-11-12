/**
 * Created by Ammar Husain on 11/11/2015.
 */
public class CollegeStudent extends Student {
    private String major;
    private int year;
    public CollegeStudent(String myName, int myAge, String myGender, String myIdNum, double myGPA, int y, String maj){
        super(myName, myAge, myGender, myIdNum, myGPA);
        this.year = y;
        this.major = maj;
    }
    public String getMajor(){
        return this.major;
    }
    public double getYear(){
        return this.year;
    }
    public void setMajor(String maj){
        this.major = maj;
    }
    public void setYear(int y){
        this.year = y;
    }
    public String toString(){
        return super.toString() + ", year: " + this.getYear() + ", major: " + this.getMajor();
    }
}
