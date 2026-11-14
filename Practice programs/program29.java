class Book {
    private int bookId;
    private String bookName;
    private String author;
    private boolean isIssued;

    Book(int bookId, String bookName, String author) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.author = author;
        this.isIssued = false;
    }

    void issueBook() {
        if (!isIssued) {
            isIssued = true;
            System.out.println(bookName + " issued successfully.");
        } else {
            System.out.println(bookName + " is already issued.");
        }
    }

    void returnBook() {
        if (isIssued) {
            isIssued = false;
            System.out.println(bookName + " returned successfully.");
        } else {
            System.out.println(bookName + " was not issued.");
        }
    }

    void displayBook() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Book Name: " + bookName);
        System.out.println("Author: " + author);
        System.out.println("Status: " + (isIssued ? "Issued" : "Available"));
        System.out.println("--------------------");
    }
}

public class Main {
    public static void main(String[] args) {

        Book b1 = new Book(101, "Java Programming", "James Gosling");

        b1.displayBook();

        b1.issueBook();
        b1.displayBook();

        b1.issueBook();

        b1.returnBook();
        b1.displayBook();
    }
}
