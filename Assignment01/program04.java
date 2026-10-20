class Car {
    private int carId;
    private String carName;
    private double price;

    public Car() {
        carId = 1;
        carName = "Swift";
        price = 650000.0;
    }

    public Car(int carId, String carName, double price) {
        this.carId = carId;
        this.carName = carName;
        this.price = price;
    }

    public void setCarId(int carId) { this.carId = carId; }
    public void setCarName(String carName) { this.carName = carName; }
    public void setPrice(double price) { this.price = price; }

    public int getCarId() { return carId; }
    public String getCarName() { return carName; }
    public double getPrice() { return price; }

    public void display() {
        System.out.println("Car ID: " + carId);
        System.out.println("Car Name: " + carName);
        System.out.println("Price: " + price);
    }

    @Override
    public String toString() {
        return "Car [carId=" + carId + ", carName=" + carName + ", price=" + price + "]";
    }
}

public class CarTest {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car(2, "Honda City", 1200000.0);

        c1.display();
        System.out.println("\\nParameterized object:");
        c2.display();
        System.out.println("Hashcodes: " + c1.hashCode() + ", " + c2.hashCode());
        System.out.println(c1);
        System.out.println(c2);
    }
}
