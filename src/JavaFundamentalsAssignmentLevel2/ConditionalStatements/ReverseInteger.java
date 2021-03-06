package JavaFundamentalsAssignmentLevel2.ConditionalStatements;

import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a 4 digit number:");
        int num = scanner.nextInt();
        int rev = 0;

        while(num > 0){
            rev = (rev * 10) + (num % 10);
            num = num / 10;
        }

        System.out.println("Reversed number: "+rev);
    }
}
