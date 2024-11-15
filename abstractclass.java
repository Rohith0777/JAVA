abstract class Shape {
    abstract void numberofSides();
}

class Triangle extends Shape {
    void numberofSides() {
        System.out.println("Triangle has 3 sides");
    }
}

class Rectangle extends Shape {
    void numberofSides() {
        System.out.println("Rectangle has 4 sides");
    }
}

class Hexagon extends Shape {
    void numberofSides() {
        System.out.println("Hexagon has 6 sides");
    }
}

public class Main {
    public static void main(String[] args) {
        Shape t = new Triangle();
        t.numberofSides();

        Shape r = new Rectangle();
        r.numberofSides();

        Shape h = new Hexagon();
        h.numberofSides();
    }
}
