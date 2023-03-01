import java.util.Scanner;

public class Task24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.print("Please enter a number between 10 and 30000: ");
            num = sc.nextInt();
        } while (num < 10 || num > 30000);
        boolean isPalindrome = true;
        int frontDiv;
        int backDiv = 1;
        if (num <= 99){
            frontDiv = 10;
        }
        else {
            if (num <= 999){
                frontDiv = 100;
            }
            else {
                if (num <= 9999){
                    frontDiv = 1000;
                }
                else {
                    frontDiv = 10000;
                }
            }
        }
        int backResult = num;
        int frontResult = num / frontDiv;
        do {
            if (frontResult != backResult % 10){
                isPalindrome = false;
                break;
            }
            backDiv = backDiv * 10;
            backResult = backResult / backDiv;
            frontDiv = frontDiv / 10;
            frontResult = (num - frontResult * frontDiv * 10) / frontDiv;
        }
        while (frontDiv > backDiv);
        if (isPalindrome){
            System.out.println(num + " is a palindrome!");
        }
        else {
            System.out.println(num + " is not a palindrome!");
        }
    }
}
