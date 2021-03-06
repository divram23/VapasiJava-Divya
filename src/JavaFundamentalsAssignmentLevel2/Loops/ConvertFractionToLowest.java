package JavaFundamentalsAssignmentLevel2.Loops;

import java.util.Scanner;

public class ConvertFractionToLowest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a fraction in the form a/b: ");
        String fr = s.next();
        int num,den;
        String[] frac = fr.split("/");
        num = Integer.parseInt(frac[0]);
        den = Integer.parseInt(frac[1]);

        int gcd =1;
        int n = num;
        int d = den;

        for(int i=1; i<=n && i<=d; i++ ){
            if(num%i ==0  && den%i ==0)
                gcd =i;
        }

        System.out.println("Simplest form: "+(num/gcd)+"/"+(den/gcd));

    }
}
