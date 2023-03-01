import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the first number: ");
        int a = sc.nextInt();
        System.out.println("Input the second number: ");
        int b = sc.nextInt();
        if (a > b){
            int temp = a;
            a = b;
            b = temp;
        }
        int sum = 0;
        for (int i = a; i <= b; i++) {
            if (i % 3 == 0){
                System.out.print("skip 3" + ", ");
                continue;
            }
            int square = i * i;
            System.out.print(square + ", ");
            sum = sum + square;
            if (sum > 200){
                break;
            }
        }
    }
}
