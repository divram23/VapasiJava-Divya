package JavaFundamentalsAssignementLevel1;

import java.util.Scanner;

public class CostWithDiscount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter purchased quantity number:");
        int quantity = scanner.nextInt();

        double actualCost = quantity * 100;

        if(quantity >= 1000){

            double discount = actualCost * 0.10;
            double newCost = actualCost - discount;
            System.out.println("Total Cost with Discount: "+newCost);
        }

        else{
            System.out.println("Total Cost, not discount as quantity purchased is less than 1000: "+actualCost);
        }



    }
}
