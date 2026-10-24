import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = num;
        int temp = num;
        int digits = 0;
        int sum = 0;

        // Count the digits
        while (temp > 0) {
            digits++;
            temp = temp / 10;
        }

        temp = num;

        // Calculate the sum of digits raised to the power
        while (temp > 0) {
            int digit = temp % 10;
            sum += (int) Math.pow(digit, digits);
            temp = temp / 10;
        }

        if (original >= 0 && sum == original) {
            System.out.println(original + " is an Armstrong Number");
        } else {
            System.out.println(original + " is Not an Armstrong Number");
        }

        sc.close();
    }
}
