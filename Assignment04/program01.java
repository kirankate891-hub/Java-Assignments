class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public double getSalary() { return salary; }

    public void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
    }
}

class Admin extends Employee {
    private double allowance;

    public Admin(int id, String name, double salary, double allowance) {
        super(id, name, salary);
        this.allowance = allowance;
    }

    public double getAllowance() { return allowance; }

    @Override
    public void display() {
        super.display();
        System.out.println("Allowance: " + allowance);
    }
}

class SalesManager extends Employee {
    private double incentive;
    private double target;

    public SalesManager(int id, String name, double salary, double incentive, double target) {
        super(id, name, salary);
        this.incentive = incentive;
        this.target = target;
    }

    public double getIncentive() { return incentive; }
    public double getTarget() { return target; }

    @Override
    public void display() {
        super.display();
        System.out.println("Incentive: " + incentive + ", Target: " + target);
    }
}

class HR extends Employee {
    private double commission;

    public HR(int id, String name, double salary, double commission) {
        super(id, name, salary);
        this.commission = commission;
    }

    public double getCommission() { return commission; }

    @Override
    public void display() {
        super.display();
        System.out.println("Commission: " + commission);
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee[] employees = {
            new Admin(1, "Amit", 30000, 5000),
            new SalesManager(2, "Riya", 40000, 8000, 100000),
            new HR(3, "Sneha", 35000, 3000)
        };
        for (Employee e : employees) {
            e.display();
            System.out.println("----------");
        }
    }
}
