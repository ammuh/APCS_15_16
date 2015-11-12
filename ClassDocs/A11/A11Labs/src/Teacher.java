/**
 * Created by Ammar Husain on 11/11/2015.
 */
public class Teacher extends Person{
    private String subject;
    private double salary;
    public Teacher(String myName, int myAge, String myGender, String subj, double sal){
        super(myName, myAge, myGender);
        subject = subj;
        salary = sal;
    }
    public String getSubject(){
        return this.subject;
    }
    public double getSalary(){
        return this.salary;
    }
    public void setSubject(String subj){
        subject = subj;
    }
    public void setSalary(double sal){
        salary = sal;
    }

    public String toString(){
        return super.toString() + ", subject: " + getSubject() + ", salary: " + getSalary();
    }
}
