class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee() {
        id = 1;
        name = "Kiran";
        salary = 30000.0;
    }

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setSalary(double salary) { this.salary = salary; }

    public int getId() { return id; }
    public String getName() { return name; }
    public double getSalary() { return salary; }

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee(2, "Rahul", 45000.0);

        e1.display();
        System.out.println("\\nParameterized object:");
        e2.display();
        System.out.println("Hashcodes: " + e1.hashCode() + ", " + e2.hashCode());
        System.out.println(e1);
        System.out.println(e2);
    }
}
