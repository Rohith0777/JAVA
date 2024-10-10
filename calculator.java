import java.util.Scanner;

public class calc {
    public static void main(String[] args) {        
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);       

        // Prompt the user to enter the first number
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();        

        // Prompt the user to enter an operator
        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);      

        // Prompt the user to enter the second number
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        // Variable to hold the result of the calculation
        double result;       

        // Use a switch statement to determine the operation based on the operator entered
        switch (operator) {
            case '+':
                // Addition operation
                result = num1 + num2;
                System.out.printf("%.2f + %.2f = %.2f\n", num1, num2, result);
                break;
            case '-':
                // Subtraction operation
                result = num1 - num2;
                System.out.printf("%.2f - %.2f = %.2f\n", num1, num2, result);
                break;
            case '*':
                // Multiplication operation
                result = num1 * num2;
                System.out.printf("%.2f * %.2f = %.2f\n", num1, num2, result);
                break;
            case '/':                
                // Division operation with a check for division by zero
                if (num2 != 0) {
                    re
