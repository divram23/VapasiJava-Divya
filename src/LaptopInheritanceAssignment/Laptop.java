package LaptopInheritanceAssignment;

abstract class Laptop {
    private final String Name;
    private final String Price;
    private final String Processor;
    private final String Ram;
    private final String HardDrive;

    public Laptop(String name, String price, String processor, String ram, String hardDrive) {
        Name = name;
        Price = price;
        Processor = processor;
        Ram = ram;
        HardDrive = hardDrive;
    }


    public String getName() {
        return Name;
    }

    public String getPrice() {
        return Price;
    }

    public String getProcessor() {
        return Processor;
    }

    public String getRam() {
        return Ram;
    }

    public String getHardDrive() {
        return HardDrive;
    }
}

