import java.util.Scanner;

public class matrixmulti {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Take input for the dimensions of matrix A
        System.out.print("Enter the number of rows in matrix A: ");
        int rowsA = scanner.nextInt();
        System.out.print("Enter the number of columns in matrix A: ");
        int colsA = scanner.nextInt();

        // Take input for the dimensions of matrix B
        System.out.print("Enter the number of rows in matrix B: ");
        int rowsB = scanner.nextInt();
        System.out.print("Enter the number of columns in matrix B: ");
        int colsB = scanner.nextInt();

        // Check if matrix multiplication is possible (i.e., colsA must be equal to rowsB)
        if (colsA != rowsB) {
            System.out.println("The matrices are not multipliable");  // If condition is not met, exit the program
            return;
        }

        // Input for matrix A
        int[][] matrixA = new int[rowsA][colsA];
        System.out.println("Enter the elements of matrix A:");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsA; j++) {
                matrixA[i][j] = scanner.nextInt();  // Read elements of matrix A
            }
        }

        // Input for matrix B
        int[][] matrixB = new int[rowsB][colsB];
        System.out.println("Enter the elements of matrix B:");
        for (int i = 0; i < rowsB; i++) {
            for (int j = 0; j < colsB; j++) {
                matrixB[i][j] = scanner.nextInt();  // Read elements of matrix B
            }
        }

        // Initialize result matrix for the product of matrix A and matrix B
        int[][] result = new int[rowsA][colsB];

        // Matrix multiplication logic
        // For each row in matrix A and each column in matrix B, calculate the product
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += matrixA[i][k] * matrixB[k][j];  // Multiply and sum up values
                }
            }
        }

        // Output the result matrix
        System.out.println("Result matrix:");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");  // Print each element of the result matrix
            }
            System.out.println();  // Move to the next line after each row
        }
    }
}
