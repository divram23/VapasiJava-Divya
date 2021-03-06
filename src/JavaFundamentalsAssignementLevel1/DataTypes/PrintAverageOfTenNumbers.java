package JavaFundamentalsAssignementLevel1;

import java.util.Scanner;

public class PrintAverageOfTenNumbers {
    public static void main(String[] args) {
        int n = 10;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ten integers:");
        int[] arr = new int[10];
        int i = 0;
        while(i < n){
            arr[i]= scanner.nextInt();
            i++;
        }

        int sum = 0;
        for(int j=0; j< n; j++){
            sum = sum + arr[j];
        }

        int avg = sum/10;
        System.out.println("Average of ten numbers enetered: "+avg);
    }
}
