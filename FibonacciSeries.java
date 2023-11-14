import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {
        
        // Get the number of terms from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();

        // Initialize the first two terms of the Fibonacci series
        int a = 0, b = 1;

        // Print the first two terms
        System.out.print(a + " " + b + " ");

        // Calculate and print the remaining terms
        for (int i = 2; i < n; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }

        System.out.println(); // New line
    }
}