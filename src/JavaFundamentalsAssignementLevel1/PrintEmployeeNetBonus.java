package JavaFundamentalsAssignementLevel1;

import java.util.Scanner;

public class PrintEmployeeNetBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Salary of the Employee:");
        double salary = scanner.nextDouble();
        System.out.println("Enter Years of Service:");
        double years = scanner.nextDouble();

        if(years > 5){
         double bonus = salary * 0.05;
         double newSalary = salary + bonus;
            System.out.println("Net Bonus Salary: "+newSalary);
        }

        else
            System.out.println("No Bonus as service is lesser than 5 years, Net Salary: "+salary);
    }
}
