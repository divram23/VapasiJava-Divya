package JavaFundamentalsAssignementLevel1.Loops;

import java.util.Scanner;

public class PrintPatterns {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter PatternDesign(1/2/3) number:");
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
        /*else if(n==3){
            int rows=4;
            int m=1;
            for (int i= 0; i<= rows-1; i++)
            {
                for (int j=0; j<=i; j++)
                {
                    System.out.print(" ");
                }


                for (int k=0; k<=rows-1-i; k++) {
                    if (k % 2 == 0) {//m =0;
                        System.out.print("1");
                    } else {
                        int num = 1;
                        System.out.print("0" + "1");
                        num = (num == 0)? 1 : 0;
                        System.out.print(num);

                    }
                }
                System.out.println();
            }*/
           /* int rows = 4;
            for (int i= 0; i<= rows-1; i++)
            {
                for (int j=0; j<=i; j++)
                {
                    System.out.print(" ");
                }
                for (int k=0; k<=rows-1-i; k++)
                {
                    System.out.print("*" + " ");
                }
                System.out.println();
            }*/



        else
                System.out.println("Invalid entry!!!");
}
}




