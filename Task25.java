import java.util.Scanner;

public class Task25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Please enter a positive number: ");
            n = sc.nextInt();
        } while (n < 1);
        int factorial = 1;
        int i = 1;
        do {
            factorial *= i;
            i++;
        } while (i <= n);
        System.out.println(factorial);
    }
}
