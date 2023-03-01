import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        do {
            System.out.print("Please enter a number between 1 and 9: ");
            a = sc.nextInt();
        } while (a < 1 || a > 9);
        int b;
        do {
            System.out.print("Please enter a number between 1 and 9: ");
            b = sc.nextInt();
        } while (b < 1 || b > 9);
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= b; j++) {
                System.out.println(i + "*" + j + "=" + i*j);
            }
        }
    }
}
