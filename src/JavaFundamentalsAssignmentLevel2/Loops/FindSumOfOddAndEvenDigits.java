package JavaFundamentalsAssignmentLevel2.Loops;

import java.util.Scanner;

public class FindSumOfOddAndEvenDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();

        int sumEven = 0;
        int sumOdd = 0;
        int i =1;

        while(num != 0){
            if( i % 2 != 0){
                sumEven = sumEven + (num % 10);
            }
            else
            {
                sumOdd = sumOdd + (num % 10);
            }
            num = num / 10;
            i++;
        }

        System.out.println("Sum of Even digits: "+sumEven);
        System.out.println("Sum of Odd digits: "+sumOdd);
    }
}
