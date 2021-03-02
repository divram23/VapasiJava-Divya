package EmployeeInheritanceAssignment;

public class Employee {
    String name;
    int id;
    String role;
    double salary;

    public Employee(){
    }

    public Employee(String name){
        this.name= name;
    }


    public void setEmployee(String name, int id, String role, double salary) {
        this.name = name;
        this.id = id;
        this.role = role;
        this.salary = salary;
    }

    public void getEmployee() {
        name = this.name;
        id = this.id;
        role = this.role;
        salary = this.salary;
    }

    public static void main(String[] args) {

        PartTimeEmployee emp1 = new PartTimeEmployee();
        emp1.setEmployee("Divya", 24242, "QA2", 56000);
        emp1.setShiftDetails(9, "Day");
        System.out.println("Part Time Employee Details:");
        System.out.println("EmployeeName: "+emp1.name+"\nEmployeeId: "+emp1.id+"\nRole: "+emp1.role+"\nSalary: "+emp1.salary+"\nShift: "+emp1.shift+"\nHours of Work: "+emp1.numberOfHours);

        System.out.println("");

        FullTimeEmployee emp2 = new FullTimeEmployee();
        emp2.setEmployee("Ramamurthy", 78686, "QA3", 79799);
        emp2.setFacility("Cab");
        System.out.println("Full Time Employee Details:");
        System.out.println("EmployeeName: "+emp2.name+"\nEmployeeId: "+emp2.id+"\nRole: "+emp2.role+"\nSalary: "+emp2.salary+"\nFacility :"+emp2.facility);

    }
}
