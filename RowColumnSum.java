package arrays;

import java.util.Scanner;

public class RowColumnSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define the size of the 2D array
        int rows, cols;

        // Input the number of rows and columns
        System.out.print("Enter the number of rows: ");
        rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        cols = scanner.nextInt();

        // Create a 2D array
        int[][] array = new int[rows][cols];

        // Input values for the 2D array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element at [" + i + "][" + j + "]: ");
                array[i][j] = scanner.nextInt();
            }
        }

        // Calculate row sums
        int[] rowSums = new int[rows];
        for (int i = 0; i < rows; i++) {
            rowSums[i] = 0; // Explicit initialization
            for (int j = 0; j < cols; j++) {
                rowSums[i] += array[i][j];
            }
        }

        // Calculate column sums
        int[] colSums = new int[cols];
        for (int j = 0; j < cols; j++) {
            colSums[j] = 0; // Explicit initialization
            for (int i = 0; i < rows; i++) {
                colSums[j] += array[i][j];
            }
        }

        // Print the row sums
        System.out.println("\nRow Sums:");
        for (int i = 0; i < rows; i++) {
            System.out.println("Sum of row " + i + ": " + rowSums[i]);
        }

        // Print the column sums
        System.out.println("\nColumn Sums:");
        for (int j = 0; j < cols; j++) {
            System.out.println("Sum of column " + j + ": " + colSums[j]);
        }

        // Close the scanner
        scanner.close();
    }
}