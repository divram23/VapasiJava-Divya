package ArraysAssignment;

import javax.script.ScriptContext;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class RandomCarDigitNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of unique car numbers required:");
        int n = scanner.nextInt();

        Random random = new Random();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        while (arrayList.size() < n) {
            int a = random.nextInt(9999) + 1;

            if (!arrayList.contains(a)) {
                arrayList.add(a);
                System.out.println("MH" + a);
            }
        }


    }
}
