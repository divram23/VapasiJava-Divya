package PolymorphismAssignment;

public class PrintArea {
    public static void area(double size){
        double area = size * size;
        System.out.println("Area of Square: "+area);
    }

    public static void area(double length, double breadth){
        double area = length * breadth;
        System.out.println("Area of Rectangle: "+area);
    }

    public static void main(String[] args) {
        double n1 = 4;
        double n2 = 12;
        double n3 = 21.25;

        area(n1);
        area(n1, n2);

    }
}
