import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the first integer: ");
        int a = sc.nextInt();
        System.out.println("Input the second integer: ");
        int b = sc.nextInt();
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        for (int i = a; i <= b; i++) {
            System.out.print(i + " ");
        }
    }
}
