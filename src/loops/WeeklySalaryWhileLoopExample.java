package loops;

import java.util.Scanner;

public class WeeklySalaryWhileLoopExample {
    public static void main(String[] args) {
        double hourlyRate = 500.00;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Total hours worked in a week");
        double hoursInWeek = scanner.nextDouble();

        while(hoursInWeek > 40 || hoursInWeek < 1) {

            System.out.println("Please correct your hours, enter again!!");
            hoursInWeek = scanner.nextDouble();
        }

        double totalSalary = hoursInWeek * hourlyRate;
        System.out.println("Total Gross Salary: "+totalSalary);

    }
}
