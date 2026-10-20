class PlacedStudent {
    private int frn;
    private String studentName;
    private double distanceCovered;
    private String companyName;
    private String designation;

    public PlacedStudent() {
        frn = 101;
        studentName = "Kiran";
        distanceCovered = 5.5;
        companyName = "ABC Technologies";
        designation = "Java Developer";
    }

    public PlacedStudent(int frn, String studentName, double distanceCovered,
                         String companyName, String designation) {
        this.frn = frn;
        this.studentName = studentName;
        this.distanceCovered = distanceCovered;
        this.companyName = companyName;
        this.designation = designation;
    }

    public void setFrn(int frn) { this.frn = frn; }
    public void setStudentName(String studentName) { this.studentName = studentName; }
    public void setDistanceCovered(double distanceCovered) { this.distanceCovered = distanceCovered; }
    public void setCompanyName(String companyName) { this.companyName = companyName; }
    public void setDesignation(String designation) { this.designation = designation; }

    public int getFrn() { return frn; }
    public String getStudentName() { return studentName; }
    public double getDistanceCovered() { return distanceCovered; }
    public String getCompanyName() { return companyName; }
    public String getDesignation() { return designation; }

    public void display() {
        System.out.println("FRN: " + frn);
        System.out.println("Student Name: " + studentName);
        System.out.println("Distance Covered: " + distanceCovered);
        System.out.println("Company Name: " + companyName);
        System.out.println("Designation: " + designation);
    }

    @Override
    public String toString() {
        return "PlacedStudent [frn=" + frn + ", studentName=" + studentName
                + ", distanceCovered=" + distanceCovered + ", companyName=" + companyName
                + ", designation=" + designation + "]";
    }
}

public class PlacedStudentTest {
    public static void main(String[] args) {
        PlacedStudent p1 = new PlacedStudent();
        PlacedStudent p2 = new PlacedStudent(102, "Rahul", 12.5, "Infosys", "Software Engineer");

        p1.display();
        System.out.println("\\nParameterized object:");
        p2.display();
        System.out.println("Hashcodes: " + p1.hashCode() + ", " + p2.hashCode());
        System.out.println(p1);
        System.out.println(p2);
    }
}
