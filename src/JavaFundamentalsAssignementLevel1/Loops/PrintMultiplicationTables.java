package JavaFundamentalsAssignementLevel1.Loops;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class PrintMultiplicationTables {
    public static void main(String[] args) {

        int n1 =24;
        System.out.println("Multiplication Table of 24:");
        for(int i=1; i <= 10; i++)
        {
            System.out.println(n1+" * "+i+" = "+n1*i);
        }

        System.out.println("**************************************");

        int n2 =50;
        System.out.println("Multiplication Table of 50:");
        for(int i=1; i <= 10; i++)
        {
            System.out.println(n2+" * "+i+" = "+n2*i);
        }

        System.out.println("**************************************");

        int n3 =29;
        System.out.println("Multiplication Table of 29:");
        for(int i=1; i <=10; i++)
        {
            System.out.println(n3+" * "+i+" = "+n3*i);
        }
    }
}
