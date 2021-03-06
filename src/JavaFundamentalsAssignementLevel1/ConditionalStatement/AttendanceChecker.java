package JavaFundamentalsAssignementLevel1;

import java.util.Scanner;

public class AttendanceChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of Classes Held:");
        int n1 = scanner.nextInt();
        System.out.println("Enter number of Classes Attended:");
        int n2 = scanner.nextInt();

        double result = (n2*100)/n1;
        System.out.println("Percentage of Classes attended: "+result+"%");

        if(result >= 75)
            System.out.println("Student is allowed to sit in Exam.");

        else
            System.out.println("Attendance Shortage!! Student not allowed for Exam.");
    }
}
