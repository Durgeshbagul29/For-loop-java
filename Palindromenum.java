import java.util.Scanner;

public class Palindromenum {
    public static void main(String[] args) {
        int sum = 0;
        int r = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = sc.nextInt();
        int temp = num;
        for (int i = num; i >0; i++) {
            r = num % 10;
            sum = (sum * 10) + r;
            num = num / 10;
        }
        if (temp == sum) {
            System.out.println(temp + " is palindrome number");
        } else {
            System.out.println(temp + " is not palindrome number");
        }
    }
}
