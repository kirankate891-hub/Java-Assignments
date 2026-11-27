class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    public int getAge() { return age; }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Student extends Person {
    private int rollNo;
    private String course;

    public Student(String name, int age, int rollNo, String course) {
        super(name, age);
        this.rollNo = rollNo;
        this.course = course;
    }

    public int getRollNo() { return rollNo; }
    public String getCourse() { return course; }

    @Override
    public void display() {
        super.display();
        System.out.println("Roll No: " + rollNo + ", Course: " + course);
    }
}

class Teacher extends Person {
    private String subject;
    private double salary;

    public Teacher(String name, int age, String subject, double salary) {
        super(name, age);
        this.subject = subject;
        this.salary = salary;
    }

    public String getSubject() { return subject; }
    public double getSalary() { return salary; }

    @Override
    public void display() {
        super.display();
        System.out.println("Subject: " + subject + ", Salary: " + salary);
    }
}

public class PersonDemo {
    public static void main(String[] args) {
        Person[] people = {
            new Student("Pooja", 21, 101, "MCA"),
            new Teacher("Mr. Patil", 40, "Java", 60000)
        };
        for (Person p : people) {
            p.display();
            System.out.println("----------");
        }
    }
}
