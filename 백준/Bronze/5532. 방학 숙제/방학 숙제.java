import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int l = sc.nextInt();  // 방학일수
        int a = sc.nextInt();  // 국어
        int b = sc.nextInt();  // 수학
        int c = sc.nextInt();  // 국어 최대 페이지
        int d = sc.nextInt();  // 수학 최대 페이지

        int t1 = a / c;
        int t2 = b / d;

        if (a % c != 0) {
            t1++;
        }
        if (b % d != 0) {
            t2++;
        }

        System.out.println(l - Math.max(t1,t2));
    }
}