import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Please enter a number between 10 and 5555: ");
            n = sc.nextInt();
        } while (n < 10 || n > 5555);
        int m;
        do {
            System.out.print("Please enter a number between 10 and 5555: ");
            m = sc.nextInt();
        } while (m < 10 || m > 5555);
        if (n > m){
            int temp = n;
            n = m;
            m = temp;
        }
        for (int i = m; i >= n; i--) {
            if (i % 50 == 0){
                System.out.print(i + " ");
            }
        }
    }
}