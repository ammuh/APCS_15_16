/**
 * Simulates an hourly employee of a grocery store
 * @author Ammar Husain
 * Period 4
 */
public class Employee {
    private String name;

    /***
     * Constructor - Creates Employee Object with a name.
     * @param n name
     */
    public Employee(String n){
        name = n;
    }

    /***
     * Gets the name of the Employee.
     * @return name
     */
    public String getName(){
        return this.name;
    }
}
