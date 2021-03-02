package JavaFundamentalsAssignementLevel1;

import java.util.Scanner;

public class GreatestOfTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1st number:");
        int num1 = scanner.nextInt();
        System.out.println("Enter 2nd number:");
        int num2 = scanner.nextInt();

        if(num1 > num2)
            System.out.println(num1+" is Greatest");

        else
            System.out.println(num2+" is Greatest");
    }
}
