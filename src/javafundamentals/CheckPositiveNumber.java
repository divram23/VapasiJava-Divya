package javafundamentals;

import java.util.Scanner;

public class CheckPositiveNumber {
    public static void main(String[] args){
        System.out.println("Enter the number:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if(number >=70)
            System.out.println("Greater than 70 number");

        else
            System.out.println("Lesser than 70 number");
    }
}
