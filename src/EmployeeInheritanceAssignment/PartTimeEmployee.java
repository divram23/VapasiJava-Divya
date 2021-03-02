package EmployeeInheritanceAssignment;

public class PartTimeEmployee extends Employee {
    int numberOfHours;
    String shift;

    public PartTimeEmployee() {
        this.name = name;
    }

    public void setShiftDetails(int numberOfHours, String shift) {
        this.numberOfHours = numberOfHours;
        this.shift = shift;
    }

    public void getShiftDetails() {
        numberOfHours = this.numberOfHours;
        shift = this.shift;
    }
}
