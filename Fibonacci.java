import java.util.Scanner; 

public class Fib { // Class to calculate and display Fibonacci series

    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the number of terms for the Fibonacci series
        System.out.print("Enter the number of terms in the Fibonacci series: ");
        int n = scanner.nextInt();
        
        // Call the method to print the Fibonacci series
        printFibonacciSeries(n);
        
        // Close the scanner to prevent resource leakage
        scanner.close();
    }

    // Method to print the Fibonacci series for 'n' terms
    public static void printFibonacciSeries(int n) {
        // Check if the input is valid (positive integer)
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        // Initialize the first two terms of the Fibonacci series
        int a = 0, b = 1;

        // Print the Fibonacci series up to 'n' terms
        System.out.print("Fibonacci Series of " + n + " terms: ");
        
        // Loop to generate and print the Fibonacci series
        for (int i = 1; i <= n; i++) {
            // Print the current term
            System.out.print(a + " ");
            
            // Calculate the next term in the series
            int nextTerm = a + b;
            // Update 'a' and 'b' to the next pair of terms
            a = b;
            b = nextTerm;
        }
        // Print a newline after the series
        System.out.println();
    }
}
