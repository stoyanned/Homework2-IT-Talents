public class Task12 {
    public static void main(String[] args) {
        for (int i = 100; i <= 999 ; i++) {
            int ones = i % 10;
            int tens = (i / 10) % 10;
            int hundreds = i / 100;
            if (!(ones == tens || ones == hundreds || tens == hundreds)){
                System.out.println(i);
            }
        }
    }
}
