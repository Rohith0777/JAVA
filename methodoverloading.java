import java.util.Scanner; // Import the Scanner class for user input

// Main class demonstrating method overloading for different shapes
class overloading {
    // Nested class for Triangle with a method to calculate its area
    public static class Triangle {
        // Method to calculate the area of a triangle given its base and height
        public static double calcArea(float base, float height) {
            return base * height * 0.5; // Formula: (base * height) / 2
        }
    }
    
    // Nested class for Rectangle with a method to calculate its area
    public static class Rectangle {
        // Method to calculate the area of a rectangle given its length and width
        public static double calcArea(float length, float width) {
            return length * width; // Formula: length * width
        }
    }

    // Nested class for Circle with a method to calculate its area
    public static class Circle {
        // Method to calculate the area of a circle given its radius
        public static double calcArea(float radius) {
            return 3.14 * radius * radius; // Formula: π * radius^2 (using 3.14 as an approximation for π)
        }
    }

    // Main method to run the program and get user input
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object for input

        // Variables to hold dimensions for each shape
        float length, width, radius, base, height;

        // Prompt user for input and read the base and height for the triangle
        System.out.println("Enter the dimensions of the triangle: ");
        base = sc.nextFloat();
        height = sc.nextFloat();

        // Prompt user for input and read the length and width for the rectangle
        System.out.println("Enter the dimensions of the rectangle: ");
        length = sc.nextFloat();
        width = sc.nextFloat();

        // Prompt user for input and read the radius for the circle
        System.out.println("Enter the dimension of the circle: ");
        radius = sc.nextFloat();

        // Display the areas of the shapes
        System.out.println("The area of the given shapes are: ");
        System.out.println("Rectangle: " + Rectangle.calcArea(length, width));
        System.out.println("Triangle: " + Triangle.calcArea(base, height));
        System.out.println("Circle: " + Circle.calcArea(radius));

        // Close the Scanner object to prevent resource leaks
        sc.close();
    }
}
