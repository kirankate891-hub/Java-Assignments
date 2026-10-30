class Employee {
    // static variable (common for all employees)
    static double bonusRate = 10.0;

    // non-static variables
    String employeeName;
    double basicsalary;

    // constructor
    Employee(String employeeName, double basicsalary) {
        this.employeeName = employeeName;
        this.basicsalary = basicsalary;

    }

    // static method to update bonus rate
    static void updateBBonusRate(double newRate) {
        bonusRate = newRate;

    }

    // non-static method to update bonus rate
    static void updateBonusRate(double newRate) {
        bonusRate = newRate;
    }

    // non-static method to calculate total salary
    double calculateTotalSalary() {
        return basicsalary + (basicsalary * bonusRate / 100);

    }

    // display employee details
    void displaysalary() {
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Basic salary: Rs." + basicsalary);
        System.out.println("Bonus Rate: " + bonusRate + "%");
        System.out.println("Total salary: Rs. " + calculateTotalSalary());
        System.out.println("-----------------");

    }

}

public class EmployeeSalaryTest {
    public static void main(String[] args) {
        // creating employee objects
        Employee emp1 = new Employee("Rahul", 30000);
        Employee emp2 = new Employee("Amit", 40000);

        System.out.println("Before updating Bonus Rate:");

        emp1.displaysalary();
        emp2.displaysalary();

        // updating common bonus rate
        Employee.updateBonusRate(20.0);

        System.out.println("After updating Bonus Rate: ");

        emp1.displaysalary();
        emp2.displaysalary();
    }
}
