package loops;

import java.util.Scanner;

public class PartySuggestionPizzaForLoopExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many guest you are expecting and we will suggest ordering for you:");
        int countOfGuest = scanner.nextInt();

        int noOfMedPizzaToOrder = countOfGuest/2;
        System.out.println("Total no of Medium pizza: "+noOfMedPizzaToOrder);
        //Toppings
        for(int i=0; i<noOfMedPizzaToOrder; i++){
            System.out.println("Enter Topping for Pizza: "+(i+1));
            String topping = scanner.nextLine();
            System.out.println("Toppings for Pizza: "+(i+1)+"would be"+topping);
        }

    }
}
