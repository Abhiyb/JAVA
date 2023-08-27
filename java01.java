import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display any message
        System.out.println("Hello, this is a Java program!");

        // Calculate the factorial of a number
        int num = 5; // Change this to the number for which you want to calculate the factorial
        long factorial = calculateFactorial(num);
        System.out.println("Factorial of " + num + " is: " + factorial);

        // Print prime numbers using command line arguments
        System.out.println("Prime numbers from command line arguments:");
        for (String arg : args) {
            int n = Integer.parseInt(arg);
            if (isPrime(n)) {
                System.out.print(n + " ");
            }
        }
        System.out.println();

        // Calculate the sum of first 'n' odd integer numbers
        System.out.print("Enter the value of 'n' to calculate the sum of first 'n' odd numbers: ");
        int n = scanner.nextInt();
        int sum = calculateOddSum(n);
        System.out.println("Sum of first " + n + " odd numbers is: " + sum);

        scanner.close();
    }

    static long calculateFactorial(int n) {
        if (n <= 0) {
            return 1;
        }
        return n * calculateFactorial(n - 1);
    }

    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    static int calculateOddSum(int n) {
        int sum = 0;
        for (int i = 1; n > 0; i += 2, n--) {
            sum += i;
        }
        return sum;
    }
}
