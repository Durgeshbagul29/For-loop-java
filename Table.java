
//WAP to print table of given number.
import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        int ans = 0;
        System.out.println("Enter any Number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1; i < 11; i++) {
            ans = num * i;
            System.out.println(ans);
        }
    }
}
