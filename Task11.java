import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please insert the number of rows N: ");
        int rows = sc.nextInt();
        int stars = 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= stars ; star++) {
                System.out.print("*");
            }
            System.out.println();
            stars += 2;
        }
    }
}