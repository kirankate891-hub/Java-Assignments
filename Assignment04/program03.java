class Shape {
    private double area;

    public Shape(double area) {
        this.area = area;
    }

    public double getArea() { return area; }

    public void display() {
        System.out.println("Area: " + area);
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        super(Math.PI * radius * radius);
        this.radius = radius;
    }

    public double getRadius() { return radius; }

    @Override
    public void display() {
        System.out.println("Circle -> Radius: " + radius);
        super.display();
    }
}

class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        super(0.5 * base * height);
        this.base = base;
        this.height = height;
    }

    public double getBase() { return base; }
    public double getHeight() { return height; }

    @Override
    public void display() {
        System.out.println("Triangle -> Base: " + base + ", Height: " + height);
        super.display();
    }
}

class Rectangle extends Shape {
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        super(length * breadth);
        this.length = length;
        this.breadth = breadth;
    }

    public double getLength() { return length; }
    public double getBreadth() { return breadth; }

    @Override
    public void display() {
        System.out.println("Rectangle -> Length: " + length + ", Breadth: " + breadth);
        super.display();
    }
}

public class ShapeDemo {
    public static void main(String[] args) {
        Shape[] shapes = {
            new Circle(7),
            new Triangle(10, 5),
            new Rectangle(8, 4)
        };
        for (Shape s : shapes) {
            s.display();
            System.out.println("----------");
        }
    }
}
