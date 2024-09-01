package pro.sky.CollectionsVarietyOfImplementations.models;
import java.util.Objects;

public class Employee {
    private final String firstName;
    private final String lastName;

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public boolean equals(Object obj) {
        if (getClass() != obj.getClass()) {
            return false;
        }
        Employee newEmployee = (Employee) obj;
        return firstName.equals(newEmployee.firstName) && lastName.equals(newEmployee.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName,lastName);
    }

    @Override
    public String toString() {
        return "Employee - " + lastName + " " + firstName ;
    }

}
