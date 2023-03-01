import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum;
        do {
            System.out.println("Please enter a number between 2 and 27: ");
            sum = sc.nextInt();
        } while (!(sum <= 27 && sum >= 2));
        for (int i = 100; i <= 999; i++) {
            int ones = i % 10;
            int tens = (i / 10) % 10;
            int hundreds = i /100;
            if ((ones + tens + hundreds) == sum){
                System.out.print(i + ", ");
            }
        }
    }
}
