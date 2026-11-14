class Employee {
    private int id;
    private String name;
    protected double basicSalary;

    Employee(int id, String name, double basicSalary) {
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    double calculateSalary() {
        return basicSalary;
    }

    void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
    }
}

class Developer extends Employee {
    private double bonus;

    Developer(int id, String name, double basicSalary, double bonus) {
        super(id, name, basicSalary);
        this.bonus = bonus;
    }

    @Override
    double calculateSalary() {
        return basicSalary + bonus;
    }
}

class Manager extends Employee {
    private double allowance;

    Manager(int id, String name, double basicSalary, double allowance) {
        super(id, name, basicSalary);
        this.allowance = allowance;
    }

    @Override
    double calculateSalary() {
        return basicSalary + allowance;
    }
}

public class Main {
    public static void main(String[] args) {

        Employee e1 = new Developer(101, "Rahul", 30000, 5000);
        Employee e2 = new Manager(102, "Amit", 50000, 10000);

        e1.displayDetails();
        System.out.println("Total Salary: " + e1.calculateSalary());

        System.out.println();

        e2.displayDetails();
        System.out.println("Total Salary: " + e2.calculateSalary());
    }
}
