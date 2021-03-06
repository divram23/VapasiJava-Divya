package JavaFundamentalsAssignmentLevel2.ConditionalStatements;

import java.util.Scanner;

public class PrintEmployeePlaceOfService {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Age:");
        int age = scanner.nextInt();
        System.out.println("Enter Sex(M or F): ");
        char sex = scanner.next().charAt(0);
        System.out.println("Enter Martial Status (Y or N): ");
        char martial = scanner.next().charAt(0);

        if(age >=20 && age <=60){
            if(sex == 'F')
                System.out.println("Place of Service: URBAN AREAS ONLY");

            else if(sex =='M'){
                if (age >=20 && age <= 40)
                    System.out.println("Place of Service: CAN WORK IN ALL AREAS");
                else if(age > 40 && age <= 60)
                    System.out.println("Place of Service: URBAN AREAS ONLY");
            }
        }
        else
            System.out.println("ERROR");

    }
}
