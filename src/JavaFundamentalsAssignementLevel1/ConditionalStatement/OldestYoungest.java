package JavaFundamentalsAssignementLevel1;

import java.util.Scanner;

public class OldestYoungest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter age of 1st Person:");
        int n1 = scanner.nextInt();
        System.out.println("Enter age of 2nd Person:");
        int n2 = scanner.nextInt();
        System.out.println("Enter age of 3rd Person:");
        int n3 = scanner.nextInt();

        if(n1>n2 && n1 >n3) {
            System.out.println("Oldest: " + n1);
            if(n2 > n3)
                System.out.println("Youngest: "+n3);
        }
        else if(n2>n1 && n2>n3){
            System.out.println("Oldest: "+n2);
            if(n1 > n3)
                System.out.println("Youngest: "+n3);
        }
        else if(n3>n1 && n3>n2){
            System.out.println("Oldest: "+n3);
            if(n1>n2)
                System.out.println("Youngest: "+n2);
            else
                System.out.println("Youngest: "+n1);
        }

    }
}
