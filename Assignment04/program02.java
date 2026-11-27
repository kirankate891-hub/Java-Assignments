class Vehicle {
    private String vehicleNumber;
    private String model;
    private String companyName;
    private int noOfWheels;
    private double price;

    public Vehicle(String vehicleNumber, String model, String companyName, int noOfWheels, double price) {
        this.vehicleNumber = vehicleNumber;
        this.model = model;
        this.companyName = companyName;
        this.noOfWheels = noOfWheels;
        this.price = price;
    }

    public String getVehicleNumber() { return vehicleNumber; }
    public String getModel() { return model; }
    public String getCompanyName() { return companyName; }
    public int getNoOfWheels() { return noOfWheels; }
    public double getPrice() { return price; }

    public void display() {
        System.out.println("Vehicle No: " + vehicleNumber + ", Model: " + model
                + ", Company: " + companyName + ", Wheels: " + noOfWheels + ", Price: " + price);
    }
}

class Bike extends Vehicle {
    private int noOfStands;
    private int noOfHelmets;
    private String bikeCategory;

    public Bike(String vehicleNumber, String model, String companyName, int noOfWheels, double price,
                int noOfStands, int noOfHelmets, String bikeCategory) {
        super(vehicleNumber, model, companyName, noOfWheels, price);
        this.noOfStands = noOfStands;
        this.noOfHelmets = noOfHelmets;
        this.bikeCategory = bikeCategory;
    }

    public int getNoOfStands() { return noOfStands; }
    public int getNoOfHelmets() { return noOfHelmets; }
    public String getBikeCategory() { return bikeCategory; }

    @Override
    public void display() {
        super.display();
        System.out.println("Stands: " + noOfStands + ", Helmets: " + noOfHelmets
                + ", Category: " + bikeCategory);
    }
}

class Car extends Vehicle {
    private boolean hasPowerSteering;
    private String driveMode;
    private boolean parkingAssistSensors;

    public Car(String vehicleNumber, String model, String companyName, int noOfWheels, double price,
               boolean hasPowerSteering, String driveMode, boolean parkingAssistSensors) {
        super(vehicleNumber, model, companyName, noOfWheels, price);
        this.hasPowerSteering = hasPowerSteering;
        this.driveMode = driveMode;
        this.parkingAssistSensors = parkingAssistSensors;
    }

    public boolean isHasPowerSteering() { return hasPowerSteering; }
    public String getDriveMode() { return driveMode; }
    public boolean isParkingAssistSensors() { return parkingAssistSensors; }

    @Override
    public void display() {
        super.display();
        System.out.println("Power Steering: " + hasPowerSteering + ", Drive Mode: " + driveMode
                + ", Parking Sensors: " + parkingAssistSensors);
    }
}

class Bus extends Vehicle {
    private int passengerCapacity;
    private int standingCapacity;

    public Bus(String vehicleNumber, String model, String companyName, int noOfWheels, double price,
               int passengerCapacity, int standingCapacity) {
        super(vehicleNumber, model, companyName, noOfWheels, price);
        this.passengerCapacity = passengerCapacity;
        this.standingCapacity = standingCapacity;
    }

    public int getPassengerCapacity() { return passengerCapacity; }
    public int getStandingCapacity() { return standingCapacity; }

    @Override
    public void display() {
        super.display();
        System.out.println("Passenger Capacity: " + passengerCapacity
                + ", Standing Capacity: " + standingCapacity);
    }
}

public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
            new Bike("MH15AB1234", "Splendor", "Hero", 2, 80000, 2, 2, "Commuter"),
            new Car("MH15CD5678", "Creta", "Hyundai", 4, 1500000, true, "Automatic", true),
            new Bus("MH15EF9012", "Viking", "Tata", 6, 3500000, 40, 15)
        };
        for (Vehicle v : vehicles) {
            v.display();
            System.out.println("----------");
        }
    }
}
