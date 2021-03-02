package ArraysAssignment;

import java.util.Scanner;

public class DayOfTheWeek {
    public static void main(String[] args) {
        String[] arr1 = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        int arrLength = arr1.length;

        System.out.println("User Input:");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        if (input > 0 && input <= arrLength) {
            System.out.println("Day: " + arr1[input - 1]);
        } else
            System.out.println("Not valid input");


    }
}
