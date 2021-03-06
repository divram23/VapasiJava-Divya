package JavaFundamentalsAssignementLevel1.Loops;

import java.util.Scanner;

public class PrintAverageofTen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Ten numbers:");
        int n=0;
        int[] arr1 = new int[10];
        while(n<10){
            arr1[n]= scanner.nextInt();
            n++;
        }

        int sum = 0;
        int avg = 0;
        for(int i=0; i< n; i++){
            sum = sum + arr1[i];
        }

        avg = sum/10;

        System.out.println("Average: "+avg);
    }
}
