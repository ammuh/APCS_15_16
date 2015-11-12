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
}
