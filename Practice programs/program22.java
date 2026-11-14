class Employee {

    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
}

public class Main {
    public static void main(String[] args) {

        Employee e1 = new Employee(101, "Rahul");
        Employee e2 = new Employee(102, "Amit");

        e1.display();
        e2.display();
    }
}
