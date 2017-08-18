package Quan.model;

/**
 * Created by NguyenVanQuan on 8/14/2017.
 */
public class Employee {
    public String lastName;
    public String firstName;
    public Employee(){}
    public Employee(String lastName, String firstName){
        this.firstName= firstName;
        this.lastName= lastName;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}
