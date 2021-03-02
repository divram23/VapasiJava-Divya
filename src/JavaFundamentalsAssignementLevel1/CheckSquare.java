package JavaFundamentalsAssignementLevel1;

import java.util.Scanner;

public class CheckSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Length of Rectangle:");
        double length = scanner.nextDouble();
        System.out.println("Enter Breadth of Rectangle:");
        double breadth = scanner.nextDouble();

        if(length == breadth)
            System.out.println("It is a square");

        else
            System.out.println("Not a square!");

    }
}
