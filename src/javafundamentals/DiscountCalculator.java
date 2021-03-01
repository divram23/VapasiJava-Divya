package javafundamentals;

import java.util.Calendar;
import java.util.Scanner;

public class DiscountCalculator {

    public static void main(String[] args){
        System.out.println("Enter your name:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Enter your year of Birth:");
        int birthYear = scanner.nextInt();
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int age = currentYear - birthYear;
        System.out.println("Hello " +name+ ", Wishing you a very Happy birthday. Here is your discount coupon of "+age+"%. Discount Coupon 'DISCOUNT"+age+"'");
        scanner.close();



    }
}
