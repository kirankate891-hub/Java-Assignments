import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        if (a == 0 || b == 0) {
            System.out.println("LCM is 0");

        } else {
            int x = Math.abs(a);
            int y = Math.abs(b);

            int num1 = x;
            int num2 = y;

            while (y != 0) {
                int remainder = x % y;
                x = y;
                y = remainder;

            }
            int lcm = (num1 / x) * num2;
            System.out.println("LCM: " + lcm);

        }
        sc.close();

    }
}
