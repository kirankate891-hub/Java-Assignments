class HR {
    private int id;
    private String name;
    private double salary;
    private double commission;

    public HR() {
        id = 1;
        name = "Amit";
        salary = 35000.0;
        commission = 5000.0;
    }

    public HR(int id, String name, double salary, double commission) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.commission = commission;
    }

    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setSalary(double salary) { this.salary = salary; }
    public void setCommission(double commission) { this.commission = commission; }

    public int getId() { return id; }
    public String getName() { return name; }
    public double getSalary() { return salary; }
    public double getCommission() { return commission; }

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Commission: " + commission);
    }

    @Override
    public String toString() {
        return "HR [id=" + id + ", name=" + name + ", salary=" + salary
                + ", commission=" + commission + "]";
    }
}

public class HRTest {
    public static void main(String[] args) {
        HR h1 = new HR();
        HR h2 = new HR(2, "Priya", 40000.0, 7000.0);

        h1.display();
        System.out.println("\\nParameterized object:");
        h2.display();
        System.out.println("Hashcodes: " + h1.hashCode() + ", " + h2.hashCode());
        System.out.println(h1);
        System.out.println(h2);
    }
}
