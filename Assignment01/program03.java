class Admin {
    private int id;
    private String name;
    private double salary;
    private double allowance;

    public Admin() {
        id = 1;
        name = "Suresh";
        salary = 30000.0;
        allowance = 4000.0;
    }

    public Admin(int id, String name, double salary, double allowance) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.allowance = allowance;
    }

    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setSalary(double salary) { this.salary = salary; }
    public void setAllowance(double allowance) { this.allowance = allowance; }

    public int getId() { return id; }
    public String getName() { return name; }
    public double getSalary() { return salary; }
    public double getAllowance() { return allowance; }

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Allowance: " + allowance);
    }

    @Override
    public String toString() {
        return "Admin [id=" + id + ", name=" + name + ", salary=" + salary
                + ", allowance=" + allowance + "]";
    }
}

public class AdminTest {
    public static void main(String[] args) {
        Admin a1 = new Admin();
        Admin a2 = new Admin(2, "Meena", 38000.0, 6000.0);

        a1.display();
        System.out.println("\\nParameterized object:");
        a2.display();
        System.out.println("Hashcodes: " + a1.hashCode() + ", " + a2.hashCode());
        System.out.println(a1);
        System.out.println(a2);
    }
}
