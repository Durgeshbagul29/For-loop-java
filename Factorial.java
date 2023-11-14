//WAP factorial of given number.
import java.util.Scanner;

    public class Factorial {
    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a number: ");
            int number = scanner.nextInt();
            int factorial = 1;
            for (int i = 1; i <= number; i++) {
                factorial *= i;
                System.out.print( i+" ");
            }
            System.out.println("The factorial of " + number + " is " + factorial);
        }
    } 

