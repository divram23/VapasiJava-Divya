package JavaFundamentalsAssignementLevel1;

import java.util.Scanner;

public class AreaOfRectangleTypeCastedToInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Length of Rectangle:");
        double length = scanner.nextDouble();
        System.out.println("Enter Breadth of Rectangle:");
        double breadth = scanner.nextDouble();

        double area = length * breadth;
        int result = (int) area;
        System.out.println("Area of Rectangle typ casted to Int: "+result);
    }
}
