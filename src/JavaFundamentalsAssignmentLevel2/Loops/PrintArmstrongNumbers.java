package JavaFundamentalsAssignmentLevel2.Loops;

public class PrintArmstrongNumbers {
    public static void main(String[] args) {
        int i = 100;
        System.out.println("Armstrong numbers between 100 and 500:");
        int num = 0;

        while(i<500){
            num = i;
            int a = 0;
            int j = 0;
            while(num != 0){
                j = num % 10;
                a = a + (j*j*j);
                num = num/10;
            }
            if(i==a)
                System.out.println(i);
            i++;
        }
    }
}
