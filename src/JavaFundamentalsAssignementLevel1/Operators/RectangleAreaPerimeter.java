package JavaFundamentalsAssignementLevel1;

import java.util.Scanner;

public class RectangleAreaPerimeter {
    public static void main(String[] args) {
        double length = 5;
        double breadth = 7;
        double area = length * breadth;
        double perimeter = (2 * length) + (2 * breadth);
        System.out.println("Area of Rectangle: "+area);
        System.out.println("Perimeter of the Rectangle: "+perimeter);
    }
}
