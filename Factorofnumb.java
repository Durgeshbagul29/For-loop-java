import java.util.Scanner;

public class Factorofnumb {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter Number : ");
            int num = sc.nextInt();

            for(int i=1; i<=num; i++){
                if(num%i==0){
                    System.out.print(i+ " ");
                }
            }
        }
    }
}
