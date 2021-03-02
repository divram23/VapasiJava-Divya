package ArraysAssignment;

import java.util.Scanner;

public class PrintGradeScores {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of Grades:");
        int n = scanner.nextInt();

        System.out.println("Enter "+n+" grade scores(out of 100):");
        int[] scores = new int[n];
        for(int i=0; i< n; i++){
            scores[i]= scanner.nextInt();
        }

        int averageSum = 0;
        int max = scores[0];
        int min = scores[0];
        for(int j=0; j<n; j++){
            averageSum = averageSum + scores[j];

         if(scores[j]>max){
             max = scores[j];
         }

         if(scores[j] < min){
             min = scores[j];
         }
        }
        int average = averageSum / n;
        System.out.println("Average Score: "+average);
        System.out.println("Highest Score: "+max);
        System.out.println("Lowest Score: "+min);

    }
}
