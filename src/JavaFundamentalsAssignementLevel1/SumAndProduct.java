package JavaFundamentalsAssignementLevel1;

import java.util.Scanner;

public class SumAndProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1st number:");
        int num1 = scanner.nextInt();
        System.out.println("Enter 2nd number:");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;
        int product = num1 * num2;
        System.out.println("Sum: "+sum);
        System.out.println("Product: "+product);

    }
}
