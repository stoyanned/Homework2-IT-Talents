import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a char form the keyboard: ");
        char c = sc.nextLine().charAt(0);
        int side;
        do {
            System.out.print("Please enter the side of a square between 3 and 20: ");
            side = sc.nextInt();
        } while (side < 3 || side > 20);
        for (int i = 1; i <= side; i++) {
            if (i == 1 || i == side){
                for (int j = 1; j <= side; j++) {
                    System.out.print("*");
                }
                System.out.println();
            } else {
                System.out.print("*");
                for (int k = 1; k <= side - 2; k++) {
                    System.out.print(c);
                }
                System.out.print("*");
                System.out.println();
            }
        }
    }
}
