class SalesManager {
    private int id;
    private String name;
    private double salary;
    private double incentive;
    private int target;

    public SalesManager() {
        id = 1;
        name = "Rohit";
        salary = 40000.0;
        incentive = 5000.0;
        target = 100;
    }

    public SalesManager(int id, String name, double salary, double incentive, int target) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.incentive = incentive;
        this.target = target;
    }

    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setSalary(double salary) { this.salary = salary; }
    public void setIncentive(double incentive) { this.incentive = incentive; }
    public void setTarget(int target) { this.target = target; }

    public int getId() { return id; }
    public String getName() { return name; }
    public double getSalary() { return salary; }
    public double getIncentive() { return incentive; }
    public int getTarget() { return target; }

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Incentive: " + incentive);
        System.out.println("Target: " + target);
    }

    @Override
    public String toString() {
        return "SalesManager [id=" + id + ", name=" + name + ", salary=" + salary
                + ", incentive=" + incentive + ", target=" + target + "]";
    }
}

public class SalesManagerTest {
    public static void main(String[] args) {
        SalesManager s1 = new SalesManager();
        SalesManager s2 = new SalesManager(2, "Neha", 50000.0, 8000.0, 150);

        s1.display();
        System.out.println("\\nParameterized object:");
        s2.display();
        System.out.println("Hashcodes: " + s1.hashCode() + ", " + s2.hashCode());
        System.out.println(s1);
        System.out.println(s2);
    }
}
