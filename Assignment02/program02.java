class Shape {
    double area;

    void displayArea() {
        System.out.println("Area: " + area);
    }

}

class Triangle extends Shape {
    double base;
    double height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

}

class Rectangle extends Shape {
    double length;
    double breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

}

class AreaCalculator {

    // Calculate Triangle Area
    void calculateArea(Triangle t) {
        t.area = 0.5 * t.base * t.height;
        System.out.println("Triangle Area: " + t.area);
    }

    // Calculate Rectangle Area
    void calculateArea(Rectangle r) {
        r.area = r.length * r.breadth;
        System.out.println("Rectangle Area: " + r.area);
    }

    // Calculate Circle Area
    void calculateArea(Circle c) {
        c.area = Math.PI * c.radius * c.radius;
        System.out.println("Circle Area: " + c.area);
    }

}

public class AreaTest {
    public static void main(String[] args) {

        AreaCalculator ac = new AreaCalculator();

        Triangle t = new Triangle(10, 5);
        Rectangle r = new Rectangle(10, 6);
        Circle c = new Circle(7);

        ac.calculateArea(t);
        ac.calculateArea(r);
        ac.calculateArea(c);
    }

}
