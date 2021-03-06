package JavaFundamentalsAssignementLevel1;


import java.util.Scanner;

public class FahrenheitToCelsiusConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter tempereture in Fahrenheit: ");
        double f = scanner.nextDouble();
        double c = (f - 32)* 5/9;
        System.out.println("Temperture convereted to Celsius: "+c);


    }
}
