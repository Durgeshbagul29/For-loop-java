//WAP to sum of given even and odd number.
import java.util.Scanner;

public class sumofevennum {
    public static void main(String[] args) {
        System.out.println("Eneter your number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0, add = 0;
        for (int i = 0; i <= num; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            } else if (i % 2 != 0) {
                add = add + i;
            }
        }
        System.out.println("Addition of even numbers is " + sum);
        System.out.println("Addition of odd numbers is " + add);
    }
}