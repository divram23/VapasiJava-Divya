package JavaFundamentalsAssignementLevel1.Loops;

import java.util.Scanner;

public class PrintGCDandHCF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1st number:");
        int n1 = scanner.nextInt();
        System.out.println("Enter 2nd number:");
        int n2 = scanner.nextInt();
        int gcd =1;

        for(int i=1; i<=n1 && i<=n2; i++ ){
            if(n1%i ==0  && n2%i ==0)
                gcd =i;
        }
        System.out.println("GCD or HCF: "+gcd);


    }
}
