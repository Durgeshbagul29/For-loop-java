//WAP to check given number is prime or not.
//Prime Number is number divided by 1 and itself only.
import java.util.Scanner;

public class primenum {
    public static void main(String[] args) {
        boolean isprime = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int num = sc.nextInt();
        for (int i = 2; i <= num / 2; i++) {
            if ((num % i) == 0) {
                isprime = false;
                break;
            }
        }

        if (isprime) {
            System.out.println(num + " is prime");
        } else {
            System.out.println(num + " is not prime ");
        }
    }
}
