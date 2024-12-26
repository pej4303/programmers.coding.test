import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); // 테스트 케이스

        int q = 25; // 쿼더
        int d = 10; // 다임
        int n = 5; // 니켈
        int p = 1; // 페니

        for (int i=0; i<t; i++) {
            int money = sc.nextInt();

            int cntQ = money / q;
            money %= q;

            int cntD = money / d;
            money %= d;

            int cntN = money / n;
            money %= n;

            int cntP = money / p;
            money %= p;

            System.out.println( String.format("%d %d %d %d", cntQ, cntD, cntN, cntP));

        }
    }
}