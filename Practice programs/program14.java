import java.util.Scanner;
public class GCD {
public static void main(String[]args){
    Scanner sc= new Scanner(System.in);

    System.out.println("Enter second number: ");
    int a = sc.nextInt();

    System.out.println("Enter second number: ");
    int b=sc.nextInt();

    int x=Math.abs(a);
    int y=Math.abs(b);

    while (y != 0){
        int remainder=x%y;
        x=y;
        y=remainder;

    }
    System.out.println("GCD: "+x);
    sc.close();
}    
}
