class Device {
    private String brand;
    private String model;
    private double price;

    public Device(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public String getBrand() { return brand; }
    public String getModel() { return model; }
    public double getPrice() { return price; }

    public void display() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Price: " + price);
    }
}

class Mobile extends Device {
    private int ram;
    private int storage;

    public Mobile(String brand, String model, double price, int ram, int storage) {
        super(brand, model, price);
        this.ram = ram;
        this.storage = storage;
    }

    public int getRam() { return ram; }
    public int getStorage() { return storage; }

    @Override
    public void display() {
        super.display();
        System.out.println("RAM: " + ram + " GB, Storage: " + storage + " GB");
    }
}

class Laptop extends Device {
    private String processor;
    private double screenSize;

    public Laptop(String brand, String model, double price, String processor, double screenSize) {
        super(brand, model, price);
        this.processor = processor;
        this.screenSize = screenSize;
    }

    public String getProcessor() { return processor; }
    public double getScreenSize() { return screenSize; }

    @Override
    public void display() {
        super.display();
        System.out.println("Processor: " + processor + ", Screen: " + screenSize + " inch");
    }
}

public class DeviceDemo {
    public static void main(String[] args) {
        Device[] devices = {
            new Mobile("Samsung", "Galaxy S23", 70000, 8, 256),
            new Laptop("Dell", "Inspiron 15", 65000, "Intel i5", 15.6)
        };
        for (Device d : devices) {
            d.display();
            System.out.println("----------");
        }
    }
}
