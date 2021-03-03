package PolymorphismAssignment;

public class PrintNumber {
    public static void printNumber(int n){
        System.out.println("Integer: "+n);
    }

    public static void printNumber(float n){
        System.out.println("Float: "+n);
    }

    public static void printNumber(double n){
        System.out.println("Double: "+n);
    }

    public static void printNumber(char n){
        System.out.println("Character: "+n);
    }

    public static void main(String[] args) {
        int n1 = 3;
        float n2 = 54.43f;
        double n3 = 779.768798;
        char n4 = 'd';

        printNumber(n1);
        printNumber(n2);
        printNumber(n3);
        printNumber(n4);

    }
}
