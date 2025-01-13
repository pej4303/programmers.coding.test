import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int money = 1000 - n; // 거스름돈
        
        int cnt500 = 0;  // 500엔
        int cnt100 = 0;  // 100엔
        int cnt50 = 0;   // 50엔
        int cnt10 = 0;   // 10엔
        int cnt5 = 0;    // 5엔
        int cnt1 = 0;    // 1엔

        while (money > 0) {
            cnt500 = money / 500;
            money %= 500;

            cnt100 = money / 100;
            money %= 100;

            cnt50 = money / 50;
            money %= 50;

            cnt10 = money / 10;
            money %= 10;

            cnt5 = money / 5;
            money %= 5;

            cnt1 = money / 1;
            money %= 1;
        }

        System.out.println(cnt500 + cnt100 + cnt50 + cnt10 + cnt5 + cnt1);
    }
}