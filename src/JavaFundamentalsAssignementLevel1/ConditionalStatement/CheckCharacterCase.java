package JavaFundamentalsAssignementLevel1;

import java.util.Scanner;

public class CheckCharacterCase {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an alphabet:");
        char ch = sc.next().charAt(0);

        if(ch >= 65 && ch <= 90)
            System.out.println("It is Uppercase");

        else if(ch >= 97 && ch <= 122)
                System.out.println("It is Lowercase");
        else
            System.out.print("It is not an alaphabet!!");
    }
}
