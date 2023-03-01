import java.util.Scanner;

public class Task22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Please enter a number between 1 and 999: ");
            n = sc.nextInt();
        } while (n < 1 || n > 999);
        int x = 1;
        while (x <= 10){
            if (n % 2 == 0 || n % 3 == 0 || n % 5 == 0){
                System.out.print(x + ":" + n + "; ");
                x++;
            }
            n++;
        }
    }
}
