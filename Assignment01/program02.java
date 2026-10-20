
class Student {
    private int frn;
    private String studentName;
    private double distanceCovered;

    // Default constructor
    public Student() {
        frn = 101;
        studentName = "Kiran";
        distanceCovered = 5.5;
    }

    // Parameterized constructor
    public Student(int frn, String studentName, double distanceCovered) {
        this.frn = frn;
        this.studentName = studentName;
        this.distanceCovered = distanceCovered;
    }

    // Setters
    public void setFrn(int frn) {
        this.frn = frn;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setDistanceCovered(double distanceCovered) {
        this.distanceCovered = distanceCovered;
    }

    // Getters
    public int getFrn() {
        return frn;
    }

    public String getStudentName() {
        return studentName;
    }

    public double getDistanceCovered() {
        return distanceCovered;
    }

    // Display method
    public void display() {
        System.out.println("FRN: " + frn);
        System.out.println("Student Name: " + studentName);
        System.out.println("Distance Covered: " + distanceCovered);
    }

    // toString method
    @Override
    public String toString() {
        return "Student [frn=" + frn
                + ", studentName=" + studentName
                + ", distanceCovered=" + distanceCovered + "]";
    }
}

// Test class
public class StudentTest {
    public static void main(String[] args) {

        // Creating objects
        Student s1 = new Student();
        Student s2 = new Student(102, "Rahul", 10.5);

        // Display objects
        System.out.println("Default Constructor:");
        s1.display();

        System.out.println("\nParameterized Constructor:");
        s2.display();

        // Printing hashcodes
        System.out.println("\nHashcode of s1: " + s1.hashCode());
        System.out.println("Hashcode of s2: " + s2.hashCode());

        // Printing toString
        System.out.println("\nUsing toString():");
        System.out.println(s1.toString());
        System.out.println(s2.toString());

        // Using setter and getter
        s1.setStudentName("Amit");
        System.out.println("\nUpdated Student Name: " + s1.getStudentName());
    }
}
