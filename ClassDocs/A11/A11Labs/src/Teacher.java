/**
 * @author Ammar Husain
 * Period 4
 */
public class Teacher extends Person{
    private String subject;
    private double salary;
    /***
     * Constructor - Takes all Person variables and adds in subject and salary.
     * @param myName Name of Teacher
     * @param myAge Age of Teacher
     * @param myGender Gender of Teacher
     * @param subj Teacher's subject
     * @param sal Teacher's salary
     */
    public Teacher(String myName, int myAge, String myGender, String subj, double sal){
        super(myName, myAge, myGender);
        subject = subj;
        salary = sal;
    }

    /***
     * Gets a teacher's subject.
     * @return subject
     */
    public String getSubject(){
        return this.subject;
    }

    /***
     * Gets a teacher's salary.
     * @return salary
     */
    public double getSalary(){
        return this.salary;
    }

    /***
     * Gets a teacher's subject.
     * @param subj subject
     */
    public void setSubject(String subj){
        subject = subj;
    }

    /***
     * Gets a teacher's salary.
     * @param sal salary
     */
    public void setSalary(double sal){
        salary = sal;
    
    public String toString(){
        return super.toString() + ", subject: " + getSubject() + ", salary: " + getSalary();
    }
}
