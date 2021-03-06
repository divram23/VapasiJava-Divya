package JavaFundamentalsAssignmentLevel2.ConditionalStatements;

import java.util.Scanner;

public class CheckLeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = scanner.nextInt();

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    System.out.println("It is a Leap yaer");
                else
                    System.out.println("Not Leap year!!");
            }
            System.out.println("It is a Leap year");
        } else
            System.out.println("Not Leap year!!");
    }
}
