package EmployeeInheritanceAssignment;

public class FullTimeEmployee extends Employee{
    public FullTimeEmployee(){
        this.name = name;
    }

    String facility;

    public void setFacility(String facility) {
        this.facility = facility;
    }

    public void getFacility(){
        facility = this.facility;
    }


}
