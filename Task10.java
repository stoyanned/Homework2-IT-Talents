import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert an integer: ");
        int a = sc.nextInt();
        boolean isPrime = true;
        for (int i = 2; i < a - 1; i++) {
            if (a % i == 0){
                isPrime = false;
                break;
            }
        }
        if (isPrime){
            System.out.println("The number is prime");
        } else
            System.out.println("The number is not prime");
    }
}
