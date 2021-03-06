package JavaFundamentalsAssignementLevel1;

import java.util.Scanner;

public class PrintGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Marks:");
        int marks = scanner.nextInt();

        if(marks > 0 && marks <=100) {

            if (marks >= 80 && marks <= 100)
                System.out.println("Grade: A");

            else if (marks >= 60 && marks < 80)
                System.out.println("Grade: B");

            else if (marks >= 50 && marks < 60)
                System.out.println("Grade: C");

            else if (marks >= 45 && marks < 50)
                System.out.println("Grade: D");

            else if (marks >= 25 && marks < 45)
                System.out.println("Grade: E");

            else
                System.out.println("Grade: F");

        }
        else
            System.out.println("Invalid Marks entered");
    }
}
