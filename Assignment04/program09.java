class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    public int getAge() { return age; }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Dog extends Animal {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public String getBreed() { return breed; }

    @Override
    public void display() {
        super.display();
        System.out.println("Breed: " + breed);
    }
}

class Bird extends Animal {
    private boolean canFly;

    public Bird(String name, int age, boolean canFly) {
        super(name, age);
        this.canFly = canFly;
    }

    public boolean isCanFly() { return canFly; }

    @Override
    public void display() {
        super.display();
        System.out.println("Can Fly: " + canFly);
    }
}

public class AnimalDemo {
    public static void main(String[] args) {
        Animal[] animals = {
            new Dog("Tommy", 3, "Labrador"),
            new Bird("Tweety", 1, true)
        };
        for (Animal a : animals) {
            a.display();
            System.out.println("----------");
        }
    }
}
