import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Find the sum of elements in an array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        System.out.println("Sum of elements in the array: " + sum);

        // Print elements in a 2D array
        System.out.print("Enter the number of rows in the 2D array: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns in the 2D array: ");
        int columns = scanner.nextInt();
        
        int[][] twoDArray = new int[rows][columns];
        
        System.out.println("Enter the elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                twoDArray[i][j] = scanner.nextInt();
            }
        }
        
        System.out.println("Elements in the 2D array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(twoDArray[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
