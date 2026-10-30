class ElectricityBill {

    // Static variable (shared by all customers)
    static double ratePerUnit = 8.0;

    // Non-static variables (individual customer details)
    String customerName;
    int unitsConsumed;

    // Constructor
    ElectricityBill(String customerName, int unitsConsumed) {
        this.customerName = customerName;
        this.unitsConsumed = unitsConsumed;
    }

    // Static method to update electricity rate
    static void updateRate(double newRate) {
        ratePerUnit = newRate;
    }

    // Non-static method to calculate bill
    double calculateBill() {
        return unitsConsumed * ratePerUnit;
    }

    // Display customer details
    void displayBill() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Units Consumed: " + unitsConsumed);
        System.out.println("Rate Per Unit: Rs. " + ratePerUnit);
        System.out.println("Total Bill: Rs. " + calculateBill());
        System.out.println("---------------------------");
    }
}

public class ElectricityBillTest {

    public static void main(String[] args) {

        // Creating objects
        ElectricityBill customer1 =
                new ElectricityBill("Rahul", 100);

        ElectricityBill customer2 =
                new ElectricityBill("Amit", 200);

        // Display bills using initial rate
        System.out.println("Before Updating Rate:");

        customer1.displayBill();
        customer2.displayBill();

        // Updating common electricity rate
        ElectricityBill.updateRate(10.0);

        // Display bills using updated rate
        System.out.println("After Updating Rate:");

        customer1.displayBill();
        customer2.displayBill();
    }
}
