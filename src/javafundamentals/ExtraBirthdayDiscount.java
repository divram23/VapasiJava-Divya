package javafundamentals;

import java.time.LocalDate;
import java.util.Scanner;

public class ExtraBirthdayDiscount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the total amount purchased by Customer");
        double num = scanner.nextDouble();
        System.out.println("Enter Day of your birthday");
        int birthDate = scanner.nextInt();
        System.out.println("Enter month of your birthday in numbers:");
        int birthMonth = scanner.nextInt();

        LocalDate currentDate = LocalDate.now();
        int date = currentDate.getDayOfMonth();
        int month = currentDate.getMonthValue();


        if((num >= 1000) && (date == birthDate) && (month == birthMonth))
        {
            System.out.println("You will get 10% Discount as it your Birthday and you have shopped more than 1000");
            double discount = num * 0.10;
            double result = num - discount;

            System.out.println("Your Purchase amount after extra discount: "+result);

        }

        else if (num < 1000)
            System.out.println("No extra discount for you!!! ");



    }
}
