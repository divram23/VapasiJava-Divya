package javafundamentals;

import java.util.Scanner;

public class CustomerDiscountForADay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the total amount purchased by Customer");
        double num = scanner.nextDouble();

        if(num >= 1000)
            System.out.println("Customer is upgraded to Gold status");

        else
        {
            double result = 1000 - num;
            System.out.println("You are short by "+result+" for gold status");
        }

    }
}
