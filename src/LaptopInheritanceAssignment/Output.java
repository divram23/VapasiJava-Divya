package LaptopInheritanceAssignment;

public class Output extends Laptop {

    private static String name;
    private static String price;
    private static String processor;
    private static String ram;
    private static String hardDrive;

    Output() {
        super(name, price, processor, ram, hardDrive);

    }

    public void setOutput(String Name, String Price, String Processor, String Ram, String HardDrive) {
        name = Name;
        price = Price;
        processor = Processor;
        ram = Ram;
        hardDrive = HardDrive;
    }

    public static void main(String[] args) {
        Output laptop1 = new Output();
        laptop1.setOutput("Lenovo", "$1000", "i3", "2GB", "500GB");
        System.out.println("Name: " + laptop1.getName() + "\nPrice: " + laptop1.getPrice() + "\nProcessor: " + laptop1.getProcessor() + "\nRam: " + laptop1.getRam() + "\nHardDrive: " + laptop1.getHardDrive());
        System.out.println("***************************************************************");

        Output laptop2 = new Output();
        laptop2.setOutput("Dell", "$1500", "i5", "4GB", "1TB");
        System.out.println("Name: " + laptop2.getName() + "\nPrice: " + laptop2.getPrice() + "\nProcessor: " + laptop2.getProcessor() + "\nRam: " + laptop2.getRam() + "\nHardDrive: " + laptop2.getHardDrive());
        System.out.println("***************************************************************");

        Output laptop3 = new Output();
        laptop3.setOutput("Sony", "$2000", "i9", "8GB", "1TB");
        System.out.println("Name: " + laptop3.getName() + "\nPrice: " + laptop3.getPrice() + "\nProcessor: " + laptop3.getProcessor() + "\nRam: " + laptop3.getRam() + "\nHardDrive: " + laptop3.getHardDrive());
        System.out.println("***************************************************************");
    }
}
