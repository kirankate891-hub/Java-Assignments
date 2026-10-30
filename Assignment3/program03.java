class Libraryuser {
    // static variable(common for all users)
    static double fineperDay = 5.0;

    // Non-static variable
    String userName;
    int daysLate;

    // constructor
    Libraryuser(String userName, int daylate) {
        this.userName = userName;
        this.daysLate = daysLate;

    }

    // non-static methiod to calculate fine
    double calculateFine() {
        return daysLate * fineperDay;
    }

    // Display user details
    void displayFine() {
        System.out.println("User Name: " + userName);
        System.out.println("Days Late: " + daysLate);
        System.out.println("Fine per Day: Rs. " + fineperDay);
        System.out.println("Total Fine: Rs. " + calculateFine());
        System.out.println("---------------");

    }

}

public class LibraryFineTest {
    public static void main(String[] args) {
        // creating objects
        Libraryuser user1 = new Libraryuser("Rahul", 5);
        Libraryuser user2 = new Libraryuser("Amit", 10);
        Libraryuser user3 = new Libraryuser("priya", 3);

        // Display fine details
        System.out.println("==== LIBRARY FINE DETAILS====");

        user1.displayFine();
        user2.displayFine();
        user3.displayFine();

    }

}
