import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int money = 0;

        if (a == b && b == c) {
            // 1번
            money = 10000 + (a * 1000);
        } else if (a == b || b == c || c == a) {
            // 2번
            if (a == b) {
                money = 1000 + (a * 100);
            } else if (b == c) {
                money = 1000 + (b * 100);
            } else { // c == a
                money = 1000 + (c * 100);
            }
        } else if ( a != b && b != c && a != c) {
            // 3번
            money = Math.max(a, Math.max(b, c)) * 100;
        }

        System.out.println(money);
    }
}