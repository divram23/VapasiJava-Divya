package JavaFundamentalsAssignementLevel1;

import java.util.Scanner;

public class PrintAbsoluteValueOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n1 = scanner.nextInt();
        System.out.println("Absolute value of number: "+Math.abs(n1));
    }
}
