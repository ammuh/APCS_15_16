/**
 * @author Ammar Husain
 * Period 4
 */
public class CollegeStudent extends Student {
    private String major;
    private int year;

    /***
     * Constructor - Extends Student object, adds on extra information concerning College Students.
     * @param myName Student's name
     * @param myAge Student's age
     * @param myGender Student's gender
     * @param myIdNum Student's ID number
     * @param myGPA Student's Grade Point Average
     * @param y Student's year
     * @param maj Student's intended major
     */
    public CollegeStudent(String myName, int myAge, String myGender, String myIdNum, double myGPA, int y, String maj) {
        super(myName, myAge, myGender, myIdNum, myGPA);
        this.year = y;
        this.major = maj;
    }

    /***
     * Gets Student's major.
     * @return major
     */
    public String getMajor() {
        return this.major;
    }

    /***
     * Gets Student's year.
     * @return year
     */
    public int getYear(){
        return this.year;
    }

    /***
     * Sets Student's major.
     * @param maj major
     */
    public void setMajor(String maj){
        this.major = maj;
    }

    /***
     * Sets Student's year.
     * @param y year
     */
    public void setYear(int y){
        this.year = y;
    }
    
    public String toString(){
        return super.toString() + ", year: " + this.getYear() + ", major: " + this.getMajor();
    }
}
