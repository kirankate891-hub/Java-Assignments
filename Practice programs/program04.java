import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive number.");
        } else {
            int first = 0;
            int second = 1;

            System.out.print("Fibonacci Series: ");

            for (int i = 1; i <= n; i++) {
                System.out.print(first + " ");

                int next = first + second;
                first = second;
                second = next;
            }

            System.out.println();
        }

        sc.close();
    }
}
