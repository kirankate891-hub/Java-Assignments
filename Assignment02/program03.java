class student {
    int rollNo;
    String name;
    double percentage;

    student(int rollNo, String name, double percentage) {
        this.rollNo = rollNo;
        this.name = name;
        this.percentage = percentage;
    }
}

class Employee {
    int id;
    String name;
    double annualsalary;

    Employee(int id, String name, double annualsalary) {
        this.id = id;
        this.name = name;
        this.annualsalary = annualsalary;

    }
}

class bank {
    void approveLoan(student s) {
        System.out.println("\nstudent name:" + s.name);
        System.out.println("percentage:" + s.percentage + "%");

        if (s.percentage > 80) {
            System.out.println("Loan Approved: Rs. 2,00,000");

        } else if (s.percentage >= 60) {
            System.out.println("Loan Approved: Rs.1,00,000");

        } else if (s.percentage >= 40) {
            System.out.println("Loan Approved: Rs. 50,000");

        } else {
            System.out.println("Loan Not Approved");

        }
    }

    void approveLoan(Employee e) {
        System.out.println("\nEmployee Name: " + e.name);
        System.out.println("Annual Salary: Rs. " + e.annualsalary);

        if (e.annualsalary > 1200000) {
            System.out.println("Loan Approved: Rs. 7,00,000");
        } else if (e.annualsalary >= 1000000) {
            System.out.println("Loan Approved: Rs. 6,00,000");
        } else if (e.annualsalary >= 600000) {
            System.out.println("Loan Approved: Rs. 5,00,000");
        } else if (e.annualsalary >= 400000) {
            System.out.println("Loan Approved: Rs. 4,00,000");
        } else {
            System.out.println("Loan Not Approved");
        }
    }
}

public class LoanApprovalTest {
    public static void main(String[] args) {
        student s1 = new student(101, "Rahul", 85);
        student s2 = new student(102, "Amit", 55);
        student s3 = new student(103, "priya", 35);

        Employee e1 = new Employee(201, "kiran", 1500000);
        Employee e2 = new Employee(201, "kiran", 1500000);
        Employee e3 = new Employee(203, "Rohit", 300000);

        bank bank = new bank();

        System.out.println("====STUDENT LOAN DEATAILS =====");
        bank.approveLoan(s1);
        bank.approveLoan(s2);
        bank.approveLoan(s3);

        System.out.println("\n==== EMPLOYEE LOAN DETAILS====");
        bank.approveLoan(e1);
        bank.approveLoan(e2);
        bank.approveLoan(e3);

    }
}
