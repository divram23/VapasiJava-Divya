package JavaFundamentalsAssignementLevel1.Loops;

import java.util.Scanner;

public class PrintPatterns {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter PatternDesign(1/2) number:");
        int n = scanner.nextInt();

        if (n == 1) {
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }

        else if (n == 2) {
            int row = 3;
            int space = row - 1;
            int i, j;
            for (j = 1; j <= row; j++) {
                for (i = 1; i <= space; i++) {
                    System.out.print(" ");
                }
                space--;
                for (i = 1; i <= 2 * j - 1; i++) {
                    System.out.print("*");
                }
                System.out.println("");
            }
            space = 1;
            for (j = 1; j <= row - 1; j++) {
                for (i = 1; i <= space; i++) {
                    System.out.print(" ");
                }
                space++;
                for (i = 1; i <= 2 * (row - j) - 1; i++) {
                    System.out.print("*");
                }
                System.out.println("");
            }
        }


        else
                System.out.println("Invalid entry!!!");
}
}




