package javafundamentals;

import java.util.Scanner;

public class CentimeterToInches {
    public static void main(String[] args){
        double cmToInchConverter = 0.394;
        //Take input from User in cms:
        System.out.println("Enter Centimeters:");
        Scanner scanner = new Scanner(System.in);
        //Multiply cmToInchConverter with user input
        double inputCms = scanner.nextDouble();
        double cmToInchValue = cmToInchConverter * inputCms;
        //Display Results
        System.out.println("Value in Inches: " +cmToInchValue);



    }
}
