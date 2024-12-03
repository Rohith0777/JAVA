import java.util.Scanner; // Importing Scanner class to take input from the user. 
public class Frequency {  // Declaring a class named Frequency
    public static void main(String[] args) {  // Main method where the execution starts
        Scanner scanner = new Scanner(System.in);  // Creating Scanner object to take input

        // Asking the user to enter a string
        System.out.println("Enter the string:");
        String inputString = scanner.nextLine();  // Reading the input string from the user

        // Asking the user to enter a character whose frequency is to be found
        System.out.println("Enter the character to find frequency:");
        char character = scanner.next().charAt(0);  // Reading the character input by the user

        int frequency = 0;  // Variable to store the frequency count of the character

        // Loop through each character of the input string
        for (int i = 0; i < inputString.length(); i++) {
            // Check if the current character matches the input character
            if (inputString.charAt(i) == character) {
                frequency++;  // Increment the frequency counter
            }
        }

        // Print the frequency of the character in the string
        System.out.println("The frequency of '" + character + "' in the string is: " + frequency);

        scanner.close();  // Closing the Scanner object
    }
}

class HelloWorld {  // Declaring another class named HelloWorld
    public static void main(String[] args) {  // Main method of HelloWorld class
        // Printing "Hello World" to the console
        System.out.println("Hello World");
    }
}
