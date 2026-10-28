class Calculator {


// Addition
void add(int a, int b) {
    System.out.println("Addition (int, int): " + (a + b));
}

void add(double a, double b) {
    System.out.println("Addition (double, double): " + (a + b));
}

void add(int a, double b) {
    System.out.println("Addition (int, double): " + (a + b));
}

void add(double a, int b) {
    System.out.println("Addition (double, int): " + (a + b));
}

// Subtraction
void subtract(int a, int b) {
    System.out.println("Subtraction (int, int): " + (a - b));
}

void subtract(double a, double b) {
    System.out.println("Subtraction (double, double): " + (a - b));
}

void subtract(int a, double b) {
    System.out.println("Subtraction (int, double): " + (a - b));
}

void subtract(double a, int b) {
    System.out.println("Subtraction (double, int): " + (a - b));
}

// Multiplication
void multiply(int a, int b) {
    System.out.println("Multiplication (int, int): " + (a * b));
}

void multiply(double a, double b) {
    System.out.println("Multiplication (double, double): " + (a * b));
}

void multiply(int a, double b) {
    System.out.println("Multiplication (int, double): " + (a * b));
}

void multiply(double a, int b) {
    System.out.println("Multiplication (double, int): " + (a * b));
}

// Division
void divide(int a, int b) {
    if (b == 0) {
        System.out.println("Cannot divide by zero");
    } else {
        System.out.println("Division (int, int): " + ((double) a / b));
    }
}

void divide(double a, double b) {
    if (b == 0.0) {
        System.out.println("Cannot divide by zero");
    } else {
        System.out.println("Division (double, double): " + (a / b));
    }
}

void divide(int a, double b) {
    if (b == 0.0) {
        System.out.println("Cannot divide by zero");
    } else {
        System.out.println("Division (int, double): " + (a / b));
    }
}

void divide(double a, int b) {
    if (b == 0) {
        System.out.println("Cannot divide by zero");
    } else {
        System.out.println("Division (double, int): " + (a / b));
    }
}


}

public class CalculatorTest {

    
public static void main(String[] args) {

    Calculator c = new Calculator();

    System.out.println("===== ADDITION =====");
    c.add(10, 5);
    c.add(10.5, 5.5);
    c.add(10, 5.5);
    c.add(10.5, 5);

    System.out.println("\n===== SUBTRACTION =====");
    c.subtract(10, 5);
    c.subtract(10.5, 5.5);
    c.subtract(10, 5.5);
    c.subtract(10.5, 5);

    System.out.println("\n===== MULTIPLICATION =====");
    c.multiply(10, 5);
    c.multiply(10.5, 5.5);
    c.multiply(10, 5.5);
    c.multiply(10.5, 5);

    System.out.println("\n===== DIVISION =====");
    c.divide(10, 5);
    c.divide(10.5, 5.5);
    c.divide(10, 5.5);
    c.divide(10.5, 5);
}

}
