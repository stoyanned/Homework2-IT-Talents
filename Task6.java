import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please input an integer number: ");
        int input = sc.nextInt();
        int num = 1;
        int sum = 1;
        while (num < input) {
            num++;
            sum += num;
        }
        System.out.println("The result is: " + sum);
    }
}
