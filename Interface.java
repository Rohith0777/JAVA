// Define the Animal class
class Animal {
    int legs;  // Attribute to store the number of legs of the animal

    // Constructor to initialize the number of legs
    Animal(int legs) {
        this.legs = legs;
    }

    // Method to display how the animal walks
    void walk() {
        System.out.print("\nThis animal walks on " + legs + " legs");
    }

    // Method to describe what the animal eats
    void eats() {
        System.out.print("\n This animal eats");
    }
}

// Define the Pet interface with methods that all pet animals must implement
interface Pet {
    String getName();  // Method to get the name of the pet
    void setName(String name);  // Method to set the name of the pet
    void play();  // Method to describe how the pet plays
}

// Define the Spider class, inheriting from Animal
class Spider extends Animal {
    // Constructor to initialize Spider with a number of legs
    Spider(int legs) {
        super(legs);  // Call to the parent class (Animal) constructor
    }

    // Method to describe what the spider eats
    void eat() {
        System.out.print("\n Spider eats insects.");
    }
}

// Define the Cat class, inheriting from Animal and implementing Pet interface
class Cat extends Animal implements Pet {
    String name;  // Attribute to store the cat's name

    // Constructor to initialize Cat with a name and number of legs
    Cat(String name, int legs) {
        super(legs);  // Call to the parent class (Animal) constructor
        this.name = name;  // Set the cat's name
    }

    // Method to get the name of the cat
    public String getName() {
        return name;
    }

    // Method to set the name of the cat
    public void setName(String name) {
        this.name = name;
    }

    // Method to describe how the cat plays
    public void play() {
        System.out.print("\nCat loves to play with ball");
    }

    // Override the eats method to describe what the cat eats
    public void eats() {
        System.out.print("\n Cat eats fish");
    }
}

// Define the Fish class, inheriting from Animal and implementing Pet interface
class Fish extends Animal implements Pet {
    String name;  // Attribute to store the fish's name

    // Constructor to initialize Fish with a name and number of legs (usually 0)
    Fish(String name, int legs) {
        super(legs);  // Call to the parent class (Animal) constructor
        this.name = name;  // Set the fish's name
    }

    // Method to get the name of the fish
    public String getName() {
        return name;
    }

    // Method to set the name of the fish
    public void setName(String name) {
        this.name = name;
    }

    // Override the eats method to describe what the fish eats
    public void eats() {
        System.out.print("\n Fish eats plants");
    }

    // Override the play method to describe how the fish plays
    public void play() {
        System.out.print("\n Fish likes to play with shells");
    }

    // Override the walk method as fish do not walk
    public void walk() {
        System.out.print("\n Fish has no legs");
    }
}

// Main class to test the functionality of the above classes
public class Interface {
    public static void main(String[] args) {
        Animal a = new Animal(4);  // Create an Animal object with 4 legs

        // Test the Fish class
        System.out.print("\n\nFish");
        Fish f = new Fish("Salmon 3D", 0);  // Create a Fish object
        System.out.print("\nThis fish's name is " + f.getName());  // Get and print the fish's name
        f.eats();  // Call the eats method for Fish
        f.walk();  // Call the walk method for Fish
        f.setName("Nemo");  // Set a new name for the Fish
        System.out.print("\nThis fish's name is " + f.getName());  // Get and print the new name of the fish

        // Test the Cat class
        System.out.print("\n\nCat");
        Cat c = new Cat("Tom", 4);  // Create a Cat object with the name "Tom"
        System.out.print("\nThis cat's name is " + c.getName());  // Get and print the cat's name
        c.eats();  // Call the eats method for Cat
        c.walk();  // Call the walk method for Cat
        c.setName("Tom");  // Set a new name for the Cat
        System.out.print("\nThis cat's name is " + c.getName());  // Get and print the new name of the cat

        // Test the Spider class
        System.out.print("\n\nSpider");
        Spider s = new Spider(8);  // Create a Spider object with 8 legs
        s.eat();  // Call the eat method for Spider
        s.walk();  // Call the walk method for Spider
    }
}
