package javafundamentals;

import java.util.Scanner;

public class GrossPay {
    public static void main(String[] args){
        double hourToPayConverter = 300.00;
        System.out.println("Enter the hours worked by Employee for a day:");
        Scanner scanner = new Scanner(System.in);
        float hoursWorked = scanner.nextFloat();
        System.out.println("Enter the number of days worked by Employee:");
        int daysWorked = scanner.nextInt();
        double bonusAmount = 0.25;
        double basicSalary = daysWorked * hoursWorked * hourToPayConverter;
        double bonusValue = basicSalary * bonusAmount;
        double hraAmount = 0.15;
        double hraValue = basicSalary * hraAmount;
        double grossSalary = basicSalary + bonusValue + hraValue;
        System.out.println("Gross Salary of the Employee: " +grossSalary);
        scanner.close();

    }
}
