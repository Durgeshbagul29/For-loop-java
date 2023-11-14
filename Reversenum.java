import java.util.Scanner;

public class Reversenum {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr number : ");
        int num = sc.nextInt();
        int temp = num;
        for (int i = 1; i <= num; i++) {
            sum = num % 10;
            num = num / 10;
        }
        System.out.println(sum);
    }
}
