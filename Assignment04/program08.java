class Product {
    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public int getProductId() { return productId; }
    public String getName() { return name; }
    public double getPrice() { return price; }

    public void display() {
        System.out.println("ID: " + productId + ", Name: " + name + ", Price: " + price);
    }
}

class Electronics extends Product {
    private int warrantyYears;

    public Electronics(int productId, String name, double price, int warrantyYears) {
        super(productId, name, price);
        this.warrantyYears = warrantyYears;
    }

    public int getWarrantyYears() { return warrantyYears; }

    @Override
    public void display() {
        super.display();
        System.out.println("Warranty: " + warrantyYears + " years");
    }
}

class Clothing extends Product {
    private String size;
    private String fabric;

    public Clothing(int productId, String name, double price, String size, String fabric) {
        super(productId, name, price);
        this.size = size;
        this.fabric = fabric;
    }

    public String getSize() { return size; }
    public String getFabric() { return fabric; }

    @Override
    public void display() {
        super.display();
        System.out.println("Size: " + size + ", Fabric: " + fabric);
    }
}

public class ProductDemo {
    public static void main(String[] args) {
        Product[] products = {
            new Electronics(1, "Television", 45000, 2),
            new Clothing(2, "T-Shirt", 799, "M", "Cotton")
        };
        for (Product p : products) {
            p.display();
            System.out.println("----------");
        }
    }
}
